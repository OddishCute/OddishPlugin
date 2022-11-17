package me.hhh.oddishcute;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_16_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class CommandOddishChat implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        if(strings[0]==null)
        {
            commandSender.sendMessage("Please specify a player to send the message to!");
            return false;
        }
        Player target;
        try{
            target = Bukkit.getServer().getPlayer(strings[0]);
        }
        catch(Exception e)
        {
            commandSender.sendMessage("Please specify a player to send the message to!");
            return false;
        }

        if(Bukkit.getServer().getOnlinePlayers().contains(target))
        {
            target.sendMessage(ChatColor.GREEN+"                           .-\"--.__\n" +
                    "          _                / '+.--'\n" +
                    "           \\.-._          j / |\n" +
                    "            \\`-.`._      . j  |\n" +
                    "             \\  `. `.    | |  L                        _,,--+='\n" +
                    "              L   `. `-. | |   \\                  _.-+'    /\n" +
                    "              |     \\   j  |    \\            _,-'\" .'    ,'\n" +
                    "              .      \\  |  |     \\         ,'   _,'    ,'\n" +
                    "               \\      `j   |      \\      .'   ,'      /\n" +
                    "                `.     |   |       \\   ,'   ,'       /\n" +
                    "                  \\    |   |        \\ /    /        /\n" +
                    "  _,-''\"\"\"\"'\"\"'\"\"`--. j    |         V    /      _,+............._\n" +
                    "-=`...-----...__     `|    |         .   /   _.-'        _,.--\"\",..=.\n" +
                    "      `-.       `._   |    |          L,'  ,'       _,.-'    ,-'\n" +
                    "         `.        `. |    |          |  .'     _.-'       ,'\n" +
                    "            .        \\|    '          L/    _,-'          /\n" +
                    "             `._      `.    L        /   _,'            ,'\n" +
                    "                `-._    \\   `       ,' ,'             ,'\n" +
                    "                    `-.. `   \\     /,-'           _.-'\n" +
                    "                      ,'\"-..  .   /_,..---\"`+'\"\"\"\"\n" +
                    ChatColor.DARK_BLUE+"                     /           '           `.\n" +
                    "                    j                          .\n" +
                    "                   .                           |\n" +
                    "                   |   .-.       ,.            |\n" +
                    "                   |    -'       `.'           |\n" +
                    "                   `                           '\n" +
                    "                    `.      .--.             ,'\n" +
                    "                      `.    `._|          ,-'\n" +
                    "                    _.-`   ,..______.. .  `-.\n" +
                    "                  ,'       |          |      `.\n" +
                    "                ,'         '          |        `.\n" +
                    "               /         ,'            .         .\n" +
                    "               \\     _,-'               `._      |\n" +
                    "                `---'                      `-....'");
            return true;
        }
        else {
            return false;
        }
    }
}
