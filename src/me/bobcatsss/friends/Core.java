package me.bobcatsss.friends;

import java.util.HashMap;
import java.util.Map;

import org.bukkit.plugin.PluginManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.bobcatsss.friends.utils.Friends;

public class Core extends JavaPlugin {
	
	private Map<String, Friends> f = new HashMap<>();
	//test
	
	@Override
	public void onEnable() {
		loadFriends();
		registerCommands();
		registerEvents();
	}
	
	@Override
	public void onDisable() {
		saveFriends();
		f.clear();
		f = null;
	}
	
	private void saveFriends() {
		
	}
	
	private void loadFriends() {
		
	}
	
	private void registerCommands() {
		
	}
	
	private void registerEvents() {
		PluginManager pm = Bukkit.getPluginManager();
	}

}
