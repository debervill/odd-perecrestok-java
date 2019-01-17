package settings;



import commonMethods.ErrAlert;
import commonMethods.LoadFxml;
import db.dbHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class SettingsController implements Initializable {
    @FXML private PasswordField passwd;

    @FXML private TableView<SostavPotoka> tbl_sostavpotoka;
    @FXML private TableColumn<SostavPotoka, Integer>  tb_minlegk;
    @FXML private TableColumn<SostavPotoka, Integer>  tb_maxlegk;
    @FXML private TableColumn<SostavPotoka, Integer>  tb_mingruz;
    @FXML private TableColumn<SostavPotoka, Integer>  tb_maxgruz;
    @FXML private TableColumn<SostavPotoka, Integer>  tb_minautobus;
    @FXML private TableColumn<SostavPotoka, Integer>  tb_maxautobus;
    @FXML private TableColumn<SostavPotoka, Integer>  tb_minautopoezd;
    @FXML private TableColumn<SostavPotoka, Integer>  tb_maxautopoezd;
    /*this is a bug
    */
    private ObservableList<SostavPotoka> oblist = FXCollections.observableArrayList();

    public void initialize (URL location, ResourceBundle resources) {
        //TODO сделать возможность редактирования таблицы
        try {

            SetTblSostavpotoka(tb_minlegk, tb_maxlegk, tb_mingruz, tb_maxgruz, tb_minautobus, tb_maxautobus,
                    tb_minautopoezd, tb_maxautopoezd);

            SetEdiatble(tb_minlegk, tb_maxlegk, tb_mingruz, tb_maxgruz, tb_minautobus, tb_maxautobus,
                    tb_minautopoezd, tb_maxautopoezd);

            tbl_sostavpotoka.setItems(oblist);

        } catch (Exception ex){
            ex.printStackTrace();
        }
                ResultSet rs;
                try (Connection con = dbHandler.getDbConnect()) {
                    String sql = "select * from sostavtrpotoka";
                    rs = con.createStatement().executeQuery(sql);


                while (rs.next()) {
                    oblist.add(new SostavPotoka(rs.getInt("minlegk"),
                            rs.getInt("maxlegk"),
                            rs.getInt("mingruz"),
                            rs.getInt("maxgruz"),
                            rs.getInt("minautobus"),
                            rs.getInt("maxautobus"),
                            rs.getInt("minautopoezd"),
                            rs.getInt("maxautopoezd")
                    ));
                }
            } catch (SQLException ex){
                ex.printStackTrace();
            }
    }

    private void SetEdiatble(TableColumn<SostavPotoka, Integer> tb_minlegk,
                              TableColumn<SostavPotoka, Integer> tb_maxlegk,
                              TableColumn<SostavPotoka, Integer> tb_mingruz,
                              TableColumn<SostavPotoka, Integer> tb_maxgruz,
                              TableColumn<SostavPotoka, Integer> tb_minautobus,
                              TableColumn<SostavPotoka, Integer> tb_maxautobus,
                              TableColumn<SostavPotoka, Integer> tb_minautopoezd,
                              TableColumn<SostavPotoka, Integer> tb_maxautopoezd) {

        tb_minlegk.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        tb_maxlegk.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        tb_mingruz.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        tb_maxgruz.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        tb_minautobus.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        tb_maxautobus.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        tb_minautopoezd.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        tb_maxautopoezd.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
    }

    private void SetTblSostavpotoka(TableColumn<SostavPotoka, Integer> tb_minlegk,
                                    TableColumn<SostavPotoka, Integer> tb_maxlegk,
                                    TableColumn<SostavPotoka, Integer> tb_mingruz,
                                    TableColumn<SostavPotoka, Integer> tb_maxgruz,
                                    TableColumn<SostavPotoka, Integer> tb_minautobus,
                                    TableColumn<SostavPotoka, Integer> tb_maxautobus,
                                    TableColumn<SostavPotoka, Integer> tb_minautopoezd,
                                    TableColumn<SostavPotoka, Integer> tb_maxautopoezd){

        tb_minlegk.setCellValueFactory(cellDaata -> cellDaata.getValue().getfMinlegk().asObject());
        tb_maxlegk.setCellValueFactory(new PropertyValueFactory<>("maxlegk"));
        tb_mingruz.setCellValueFactory(new PropertyValueFactory<>("mingruz"));
        tb_maxgruz.setCellValueFactory(new PropertyValueFactory<>("maxgruz"));
        tb_minautobus.setCellValueFactory(new PropertyValueFactory<>("minautobus"));
        tb_maxautobus.setCellValueFactory(new PropertyValueFactory<>("maxautobus"));
        tb_minautopoezd.setCellValueFactory(new PropertyValueFactory<>("minautopoezd"));
        tb_maxautopoezd.setCellValueFactory(new PropertyValueFactory<>("maxautopoezd"));

        tbl_sostavpotoka.setEditable(true);
        tbl_sostavpotoka.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);
    }

    public void goEditSett(ActionEvent event) {

            String password;
            password = passwd.getText();
            String mainPasswd = "1123456";
            if (password.equals(mainPasswd)) {
                new LoadFxml("passwdOK", "editSettings.fxml", "Редактирование настроек");
            }
            else new ErrAlert("Неверный пароль");
    }

       @FXML
    private void getData() {

    }
}