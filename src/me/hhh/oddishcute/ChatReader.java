package me.hhh.oddishcute;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatReader implements Listener
{
  @EventHandler
  public void onPlayerChat(AsyncPlayerChatEvent event)
  {
    String message = event.getMessage();

    Player player = event.getPlayer();

    if (player.getName().equals("LowerCaseH"))
    {
      return;
    }


    if (message.toLowerCase().contains("huhu"))
    {
      Bukkit.broadcastMessage(ChatColor.GREEN+"Huhu "+player.getName());
    }

    Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Main.instance, new Runnable()
    {
      @Override
      public void run()
      {
        if (message.toLowerCase().contains("aha") && !message.toLowerCase().contains("hah"))
        {
          if (message.toLowerCase().contains("und jetzt"))
          {
            player.sendMessage(ChatColor.RED + "...wird deine ganze Familie umgebracht " + player.getName() + ", hahahaha");
          }
          else
          {
            player.sendMessage(ChatColor.RED + "Jetzt wird deine ganze Familie umgebracht " + player.getName() + ", hahahaha");
          }
        }
        else if (message.toLowerCase().contains("junge"))
        {
          player.sendMessage(ChatColor.DARK_PURPLE + "seethe and cope");
        }
        else if (message.toLowerCase().contains("schön für dich " + player.getName()))
        {
          player.sendMessage(ChatColor.DARK_PURPLE + "Schöner als du allemal du Hackfresse");
        }
        else if (message.toLowerCase().contains("und jetzt"))
        {
          player.sendMessage(ChatColor.RED + "...wird deine ganze Familie umgebracht " + player.getName() + ", hahahaha");
        }
      }
    }, 10L);

  }
}
