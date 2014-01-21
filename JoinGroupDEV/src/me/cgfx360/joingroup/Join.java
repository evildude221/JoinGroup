package me.cgfx360.joingroup;






import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.ChatColor;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener{
	public Main plugin;
	public Join(Main instance){
	plugin = instance;
	}
	
	@EventHandler
	public void onPlayerJoinEvent(PlayerJoinEvent event) {
	  if(!event.getPlayer().hasPlayedBefore()) {
		  event.getPlayer().sendMessage(ChatColor.GREEN + "Where do you want to join?");
		  event.getPlayer().sendMessage(ChatColor.GREEN + "/join-blue or /join-green");
		  
	  }
		  
	    
	}

}