package me.Juanma__.helloworld;

import org.bukkit.plugin.java.JavaPlugin;

import me.Juanma__.helloworld.commands.HelloCommand;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new HelloCommand(this);
	}

}
