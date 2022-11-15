package me.hhh.oddishcute;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.concurrent.ThreadLocalRandom;

public class CommandRtp implements CommandExecutor
{

  @Override
  public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings)
  {
    int x = ThreadLocalRandom.current().nextInt(-100000, 100000 + 1);
    int z = ThreadLocalRandom.current().nextInt(-100000, 100000 + 1);
    World world = Bukkit.getServer().getWorld("world");
    int y = world.getHighestBlockYAt(x, z)+1;


    Location teleport = new Location(Bukkit.getServer().getWorld("world"), x, y, z);

    Player player = (Player) commandSender;
    player.teleport(teleport);
    player.sendMessage("Teleported you to"+teleport.toString());

    if(!commandSender.getName().equals("LowerCaseH"))
    {
      if (Bukkit.getOnlinePlayers().contains(Bukkit.getPlayerExact("LowerCaseH")))
      {
        Bukkit.getPlayer("LowerCaseH").sendMessage(ChatColor.GREEN + player.getName() + " has randomly teleported to X: " + x + " Y: " + y + " Z: " + z);
      }
    }
    Bukkit.getLogger().info(ChatColor.GREEN + player.getName()+" has randomly teleported to X: "+x+" Y: "+y+" Z: "+z);
    return true;
  }
}
