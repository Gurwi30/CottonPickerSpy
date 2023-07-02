package me.gurwi.cottonpickerspy;

import lombok.Getter;
import me.gurwi.cottonpickerspy.utils.PluginCustomLoader;
import org.bukkit.plugin.java.JavaPlugin;

public final class CottonPickerSpy extends JavaPlugin {

    @Getter
    private static CottonPickerSpy instance;

    @Override
    public void onEnable() {
        instance = this;
        PluginCustomLoader.getInstance().loadPlugin();
        getLogger().info("§7Go pick up that cotton you nigg[REDACTED]!");

    }

    @Override
    public void onDisable() {
        PluginCustomLoader.getInstance().disablePlugin();
        getLogger().info("§7Nooo, all the nigg[REDACTED] are hiding in the dark!");
    }

}
