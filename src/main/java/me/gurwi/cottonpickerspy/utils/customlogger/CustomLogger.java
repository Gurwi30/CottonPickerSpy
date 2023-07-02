package me.gurwi.vanillateams.utils.customlogger;

import me.gurwi.vanillateams.VanillaTeams;

import java.util.logging.Logger;

@SuppressWarnings("unused")
public class CustomLogger {

    private static final Logger logger = VanillaTeams.getInstance().getLogger();
    public static void log(LoggerTag loggerTag, String msg) {
        logger.info(loggerTag.getTag() + msg);
    }

}
