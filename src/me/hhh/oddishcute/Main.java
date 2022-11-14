package me.hhh.oddishcute;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
  @Override
  public void onEnable(){
    getLogger().info(ChatColor.GREEN + "Enabled" + this.getName());
    this.getCommand("oddish").setExecutor(new CommandOddish());
  }

  @Override
  public void onDisable(){
    getLogger().info(ChatColor.RED + "Disabled" + this.getName());
  }
}
