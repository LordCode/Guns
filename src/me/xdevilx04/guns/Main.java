package me.xdevilx04.guns;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	
	public static Main instance;
	
	public void onEnable() 
	{
		instance = this;
	}
	
	public void onDisable() 
	{
		
	}
	
	public static Main getInstance() {
		return instance;
		
	}

}

