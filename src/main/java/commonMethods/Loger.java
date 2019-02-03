package commonMethods;

import settings.SettingsController;

import java.text.SimpleDateFormat;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class Loger {

    public void Loger (String cls){


    final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(cls);
    FileHandler fh = null;
        SimpleDateFormat format = new SimpleDateFormat("M-d_HHmmss");
        try {
            fh = new FileHandler("/Users/danamir/IdeaProjects/oddperekr/src/main/logs/app.log");
        } catch (Exception e) {
            e.printStackTrace();
        }

        fh.setFormatter(new SimpleFormatter());
        logger.addHandler(fh);
    }

}

