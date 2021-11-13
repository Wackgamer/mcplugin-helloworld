package me.Juanma__.helloworld.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Juanma__.helloworld.Main;

public class HelloCommand implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public HelloCommand(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("hello").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)){
			sender.sendMessage("Solo los jugadores pueden ejecutar este comando!");
			return true;
		}
		
		Player p = (Player) sender;
		
		if (p.hasPermission("hello.use")){
			p.sendMessage("Hola!");
			return true;
		} else {
			p.sendMessage("No tenes permisos para ejecutar este comando!");
		}
		return false;
	}

}
