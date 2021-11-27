package me.Juanma__.helloworld.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Juanma__.helloworld.Main;

public class RainbowCommand implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public RainbowCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("rainbow").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage("Solo los jugadores pueden ejecutar este comando!");
			return true;
		}
		
		Player p = (Player) sender;
		
		if (p.hasPermission("rainbow.use")){
			p.sendMessage(ChatColor.DARK_RED+"H"+ChatColor.RED+"o"+ChatColor.GOLD+"l"+ChatColor.YELLOW+"a"+ChatColor.DARK_GREEN+"A"+ChatColor.GREEN+"r"+ChatColor.AQUA+"c"+ChatColor.DARK_AQUA+"o"+ChatColor.DARK_BLUE+"i"+ChatColor.BLUE+"r"+ChatColor.LIGHT_PURPLE+"i"+ChatColor.DARK_PURPLE+"s");
			return true;
		} else {
			p.sendMessage("No tenes permisos para ejecutar este comando!");
		}
		return false;
	}

}
