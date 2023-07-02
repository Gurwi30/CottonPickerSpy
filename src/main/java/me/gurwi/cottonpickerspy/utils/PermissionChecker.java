package me.gurwi.cottonpickerspy.utils;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.permissions.PermissionAttachmentInfo;

public class PermissionChecker {

    public static boolean playerHasPermissionStartingWith(CommandSender sender, String startsWith) {

        for (PermissionAttachmentInfo permission : sender.getEffectivePermissions()) {
            if (permission.getPermission().startsWith(startsWith) && permission.getValue()) {
                return true;
            }
        }

        return false;

    }

    public static int getPlayerSpyWeight(Player player) {

        String startsWith = "cottonpickerspy.weight.";

        if (!playerHasPermissionStartingWith(player, startsWith)) return 0;

        for (PermissionAttachmentInfo permission : player.getEffectivePermissions()) {
            if (permission.getPermission().startsWith(startsWith) && permission.getValue()) {

                String rawIntValue = permission.getPermission().replace(startsWith, "");
                if (!BasicFunctions.isInt(rawIntValue)) return 0;
                return Integer.parseInt(permission.getPermission().replace(startsWith, ""));

            }
        }

        return 0;

    }

    public static boolean isOp(CommandSender sender) {
        if (sender.isOp()) return true;
        if (sender.hasPermission("*")) return true;
        return sender.hasPermission("cottonpickerspy.*");
    }

    public static boolean canSpy(Player spy, Player target) {

        if (!spy.hasPermission("cottonpickerspy.spy") && !isOp(spy)) return false;
        if (spy.getUniqueId().equals(target.getUniqueId())) return false;

        int spyWeight = getPlayerSpyWeight(spy);
        int targetWeight = getPlayerSpyWeight(target);

        return spyWeight > targetWeight;
    }

}
