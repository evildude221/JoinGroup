package me.cgfx360.joingroup;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	
	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has Been Disabled!");
	
	}
    
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Has Been Enabled!");
		System.out.println("Report any bugs to Evildude221 on Bukkit.org");
		 this.getServer().getPluginManager().registerEvents(new Join(this), this);
	        getConfig().options().copyDefaults(true);
	        saveConfig();
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(commandLabel.equalsIgnoreCase("join-blue")){
		    getServer().dispatchCommand(getServer().getConsoleSender(), "pex user "+sender.getName()+" group set blue");
			sender.sendMessage(ChatColor.BLUE + "You Joined Blue.");
			return true;
	      
		}
		if(commandLabel.equalsIgnoreCase("join-green")){
		    getServer().dispatchCommand(getServer().getConsoleSender(), "pex user "+sender.getName()+" group set green");
			sender.sendMessage(ChatColor.GREEN + "You Joined Blue");
			return true;
	      
		}
		
		return false;
		
	}
	
	
	
	
	
	
	
	

}

