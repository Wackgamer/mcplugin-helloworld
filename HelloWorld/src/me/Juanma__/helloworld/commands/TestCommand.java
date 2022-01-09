package me.Juanma__.helloworld.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Juanma__.helloworld.Main;
import me.Juanma__.helloworld.ui.TestUI;

public class TestCommand implements CommandExecutor {
	
	@SuppressWarnings("unused")
	private Main plugin;
	
	public TestCommand(Main plugin) {
		this.plugin = plugin;
		
		plugin.getCommand("test").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (!(sender instanceof Player)) {
			//Send console a message sender.sendMessage();
			return true;
		}
		
		Player p = (Player) sender;
		
		if (p.hasPermission("bla.bla")) {
			p.openInventory(TestUI.GUI(p));
		}
		return false;
	}
}
