package me.hhh.oddishcute;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatReader implements Listener
{
  @EventHandler
  public void onPlayerChat(AsyncPlayerChatEvent event){
    String message = event.getMessage();

    Player player = event.getPlayer();

    if(message.contains("aha"))
    {
      player.sendMessage("Jetzt wird deine ganze Familie umgebracht hahahaha");
    }
  }
}
