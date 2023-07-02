package me.gurwi.cottonpickerspy.listeners;

import me.gurwi.cottonpickerspy.utils.PermissionChecker;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandSpy implements Listener {

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent event) {

        Player player = event.getPlayer();
        String cmd = event.getMessage();

        Bukkit.getOnlinePlayers().stream().filter(p -> PermissionChecker.canSpy(p, player))
                .forEach(onlinePlayer -> onlinePlayer.sendMessage("§8§l(§f§lCOTTONPICKER§7§lSPY§8§l) §f" + player.getName() + " §7ran §f" + cmd));

    }

}
