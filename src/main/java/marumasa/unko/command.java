package marumasa.unko;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        Location location = player.getLocation();
        int value = 5;
        if (args.length != 0) value = Integer.parseInt(args[0]);
        if (value > 32) {
            player.sendMessage("33以上は設定できません");
            return false;
        }
        setBlock.unko(value, location);
        return true;
    }
}
