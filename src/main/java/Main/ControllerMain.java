package Main;


import commonMethods.ErrAlert;
import commonMethods.LoadFxml;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.regex.Pattern;

public class ControllerMain {

    @FXML private TextField sname;
    @FXML private TextField sfamilia;
    @FXML private TextField zachnum;
    @FXML private TextField stdgroup;

    @FXML
    private void nextpressed(ActionEvent event) {

        String name;
        name = sname.getText().trim();
        String familia;
        familia = sfamilia.getText().trim();
        String zachetka;
        zachetka = zachnum.getText().trim();
        String group;
        group = stdgroup.getText().trim();

        String patternName = "^[А-Я]+[а-я]*";
        String patternGroup = "^[1-9]+[А-Яа-я]*[1-9]";
        String patternZach =  "^[1-9]*";

        //TODO Cделать корректную проверку через regexp
        //TODO Написать паттерны для проверки ввода
        //TODO Проверять наличие студента в базе данных
        //TODO css стили для алерта


        if (name.equals("") || familia.equals("") || group.equals("") || zachetka.equals("") )
            new ErrAlert("Не все поля заполнены! Для продолжения работы заполните все поля\"");
        else

        if  (!checkVvod(name, patternName) ) {
            new ErrAlert("Неверно введено имя");
        }
        else if (!checkVvod(familia, patternName)) {
             new ErrAlert("Неверно введена фамилия");
        }
        else if (!checkVvod(zachetka,patternZach)){
            new ErrAlert("Неверно введен номер зачетной книжки");
        }
        else if (!checkVvod(group, patternGroup)){
            new ErrAlert("Неверно введен номер группы");
        }
        else  new LoadFxml("btnext", "zadanie.fxml", "Задание для расчета");

    }

    private  boolean checkVvod(String text, String pattern) {
        return (Pattern.matches(pattern, text));
    }

    @FXML
    private void settingsPressed(ActionEvent event) {
        new LoadFxml("btnsettings", "settingsPassword.fxml", "Введите пароль");
    }


}
