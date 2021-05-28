package me.blume.boatop;

import org.bukkit.plugin.java.JavaPlugin;

import me.blume.boatop.listeners.BoatBreak;

public class Main extends JavaPlugin{
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new BoatBreak(this), this);
	}
	@Override
	public void onDisable() {
		
	}

}
