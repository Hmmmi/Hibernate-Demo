package com.mijing.bean;

/**
 * SeekFriend entity. @author MyEclipse Persistence Tools
 */
public class SeekFriend extends AbstractSeekFriend implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SeekFriend() {
	}

	/** minimal constructor */
	public SeekFriend(SeekFriendId id) {
		super(id);
	}

	/** full constructor */
	public SeekFriend(SeekFriendId id, String friendLabel, String addTime) {
		super(id, friendLabel, addTime);
	}
	
	@Override
	public String toString() {
		return "Friend ["+getId()+"] "+getFriendLabel()+","+getAddTime();
	}

}
