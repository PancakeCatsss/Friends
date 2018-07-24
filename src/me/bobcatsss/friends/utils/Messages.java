package me.bobcatsss.friends.utils;

public enum Messages {

	NO_PERMISSION ("You don't have permission to use this command."),
	FRIEND_ACCEPTED ("{player_name} has accepted your friend request."),
	ACCEPTED_REQUEST ("You have accepted {player_name}'s friend request."),
	FRIEND_REQUEST_DENIED ("You have denied {player_name}'s friend request."),
	REQUEST_DENIED ("{player_name} has denied your friend request."), 
	REQUEST_SENT ("You have sent {player_name} a friend request."),
	REQUEST_RECEIVED ("{player_name} has requested to be friends with you, type /f accept {player_name} to accept their request.");
	
	private String message;
	
	public String getValue() {
		return Utils.c(message);
	}
	
	private Messages(String type) {
		this.message = type;
	}
}
