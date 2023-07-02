package me.gurwi.cottonpickerspy.utils.customlogger;

import me.gurwi.cottonpickerspy.CottonPickerSpy;

import java.util.logging.Logger;

@SuppressWarnings("unused")
public class CustomLogger {

    private static final Logger logger = CottonPickerSpy.getInstance().getLogger();
    public static void log(LoggerTag loggerTag, String msg) {
        logger.info(loggerTag.getTag() + msg);
    }

}
