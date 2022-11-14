package me.hhh.oddishcute;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class CommandOddish implements CommandExecutor
{
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    if(sender instanceof Player)
    {
      Player player = (Player) sender;

      ItemStack oddish = new ItemStack(Material.BEETROOT);

      oddish.setAmount(64);

      player.getInventory().addItem(oddish);
    }
    return true;
  }


}
