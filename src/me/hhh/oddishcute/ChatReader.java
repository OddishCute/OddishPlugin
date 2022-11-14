package me.hhh.oddishcute;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.Locale;

public class ChatReader implements Listener
{
  @EventHandler
  public void onPlayerChat(AsyncPlayerChatEvent event){
    String message = event.getMessage();

    Player player = event.getPlayer();

    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
    {
      @Override
      public void run()
      {
        if(message.toLowerCase().contains("aha"))
        {
          if(message.toLowerCase().contains("und jetzt"))
          {
            player.sendMessage(ChatColor.RED+"...wird deine ganze Familie umgebracht hahahaha");
          }
          else{
            player.sendMessage(ChatColor.RED+"Jetzt wird deine ganze Familie umgebracht hahahaha");
          }
        }
        else if(message.toLowerCase().contains("junge"))
        {
          player.sendMessage(ChatColor.DARK_PURPLE + "seethe and cope");
        }
      }
    }, 10L);

  }
}
