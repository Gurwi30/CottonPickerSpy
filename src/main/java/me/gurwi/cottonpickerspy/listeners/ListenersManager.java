package me.gurwi.cottonpickerspy.listeners;

import me.gurwi.cottonpickerspy.CottonPickerSpy;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

public class ListenersManager {

    private final CottonPickerSpy plugin;

    public ListenersManager(CottonPickerSpy plugin) {
        this.plugin = plugin;

        register(new CommandSpy());
    }

    private void register(Listener listener) {
        Bukkit.getPluginManager().registerEvents(listener, plugin);
    }

}
