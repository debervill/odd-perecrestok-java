package settings;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class SostavPotoka {
            private SimpleIntegerProperty fminlegk;
            private SimpleIntegerProperty fmaxlegk;
            private SimpleIntegerProperty fmingruz;
            private SimpleIntegerProperty fmaxgruz;
            private SimpleIntegerProperty fminautobus;
            private SimpleIntegerProperty fmaxautobus;
            private SimpleIntegerProperty fminautopoezd;
            private SimpleIntegerProperty fmaxautopoezd;


    public SostavPotoka(Integer minlegk, Integer maxlegk, Integer mingruz, Integer maxgruz, Integer minautobus, Integer maxautobus, Integer minautopoezd, Integer maxautopoezd) {
        this.fminlegk = new SimpleIntegerProperty(minlegk);
        this.fmaxlegk = new SimpleIntegerProperty(maxlegk);
        this.fmingruz = new SimpleIntegerProperty(mingruz);
        this.fmaxgruz = new SimpleIntegerProperty(maxgruz);
        this.fminautobus = new SimpleIntegerProperty(minautobus);
        this.fmaxautobus = new SimpleIntegerProperty(maxautobus);
        this.fminautopoezd = new SimpleIntegerProperty(minautopoezd);
        this.fmaxautopoezd = new SimpleIntegerProperty(maxautopoezd);
    }

    public IntegerProperty getfMinlegk() {

        return fminlegk;
    }

    public void setMinlegk(Integer minlegk) {
        fminlegk.set(minlegk);

    }

    public Integer getMaxlegk() {
        return fmaxlegk.get();
    }

    public void setMaxlegk(Integer maxlegk) {

        fmaxlegk.set(maxlegk);
    }

    public Integer getMingruz() {
        return fmaxgruz.get();
    }

    public void setMingruz(Integer mingruz) {
        fmingruz.set(mingruz);
    }

    public Integer getMaxgruz() {
        return fmaxgruz.get();
    }

    public void setMaxgruz(Integer maxgruz) {
        fmaxgruz.set(maxgruz);
    }

    public Integer getMinautobus() {

        return fminautobus.get();
    }

    public void setMinautobus(Integer minautobus) {
        fminautobus.set(minautobus);
    }

    public Integer getMaxautobus() {
        return fmaxautobus.get();
    }

    public void setMaxautobus(Integer maxautobus) {
        fmaxautobus.set(maxautobus);
    }

    public Integer getMinautopoezd() {
        return fminautopoezd.get();
    }

    public void setMinautopoezd(Integer minautopoezd) {
        fminautopoezd.set(minautopoezd);
    }

    public Integer getMaxautopoezd() {
        return fmaxautopoezd.get();
    }

    public void setMaxautopoezd(Integer maxautopoezd) { fmaxautopoezd.set(maxautopoezd);
    }
}
