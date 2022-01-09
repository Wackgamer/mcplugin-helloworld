package me.Juanma__.helloworld;

import org.bukkit.plugin.java.JavaPlugin;

import me.Juanma__.helloworld.commands.HelloCommand;
import me.Juanma__.helloworld.commands.RainbowCommand;
import me.Juanma__.helloworld.commands.TestCommand;
import me.Juanma__.helloworld.listeners.InventoryClickListener;
import me.Juanma__.helloworld.ui.TestUI;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new HelloCommand(this);
		new RainbowCommand(this);
		new TestCommand(this);
		new InventoryClickListener(this);
		TestUI.initialize();
	}

}
