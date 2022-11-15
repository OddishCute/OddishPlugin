package me.hhh.oddishcute;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class SleepListener implements Listener
{
  @EventHandler
  public void onPlayerSleep(PlayerBedEnterEvent event)
  {
    Player player = event.getPlayer();

    player.sendMessage(ChatColor.AQUA + "Nachti Nacht :)");
  }
}
