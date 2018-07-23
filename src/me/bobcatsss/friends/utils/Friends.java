package me.bobcatsss.friends.utils;

import java.util.HashSet;
import java.util.Set;

import org.bukkit.entity.Player;

public class Friends {
	
	private Set<String> friends = new HashSet<>();
	private Set<String> pending = new HashSet<>();
	
	public Friends() {
		
	}
	
	public boolean isFriend(String uuid) {
		return friends.contains(uuid);
	}
	
	public boolean isFriend(Player player) {
		return friends.contains(player.getUniqueId().toString());
	}
	
	public boolean isPending(String uuid) {
		return pending.contains(uuid);
	}
	
	public boolean isPending(Player player) {
		return pending.contains(player.getUniqueId().toString());
	}

}
