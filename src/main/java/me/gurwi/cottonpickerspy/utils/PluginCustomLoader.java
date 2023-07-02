package me.gurwi.cottonpickerspy.utils;

import lombok.Getter;
import me.gurwi.cottonpickerspy.CottonPickerSpy;
import me.gurwi.cottonpickerspy.listeners.ListenersManager;
import me.gurwi.cottonpickerspy.utils.customlogger.CustomLogger;
import me.gurwi.cottonpickerspy.utils.customlogger.LoggerTag;

public class PluginCustomLoader {

    @Getter(lazy = true)
    private final static PluginCustomLoader instance = new PluginCustomLoader();

    private final CottonPickerSpy plugin = CottonPickerSpy.getInstance();

    // METHODS

    private void registerListeners() {
        CustomLogger.log(LoggerTag.LOAD_TAG, "Loading Listeners...");

        new ListenersManager(plugin);
    }

    // MAIN METHODS

    public void loadPlugin() {

        registerListeners();

    }

    public void disablePlugin() {


    }

}
