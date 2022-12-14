package me.hhh.oddishcute;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
  public static Plugin instance = null;

  @Override
  public void onEnable(){
    getLogger().info(ChatColor.GREEN + "Enabled" + this.getName());
    instance = this;
    this.getCommand("oddish").setExecutor(new CommandOddish());
    this.getCommand("rtp").setExecutor(new CommandRtp());
    this.getCommand("oddishchat").setExecutor(new CommandOddishChat());
    getServer().getPluginManager().registerEvents(new ChatReader(), this);
    getServer().getPluginManager().registerEvents(new SleepListener(), this);
  }

  @Override
  public void onDisable(){
    getLogger().info(ChatColor.RED + "Disabled" + this.getName());
    instance = null;
  }
}
