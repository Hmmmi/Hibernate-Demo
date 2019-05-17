package com.mijing.bean;

/**
 * AbstractSeekFriend entity provides the base persistence definition of the
 * SeekFriend entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSeekFriend implements java.io.Serializable {

	// Fields

	private SeekFriendId id;
	private String friendLabel;
	private String addTime;

	// Constructors

	/** default constructor */
	public AbstractSeekFriend() {
	}

	/** minimal constructor */
	public AbstractSeekFriend(SeekFriendId id) {
		this.id = id;
	}

	/** full constructor */
	public AbstractSeekFriend(SeekFriendId id, String friendLabel,
			String addTime) {
		this.id = id;
		this.friendLabel = friendLabel;
		this.addTime = addTime;
	}

	// Property accessors

	public SeekFriendId getId() {
		return this.id;
	}

	public void setId(SeekFriendId id) {
		this.id = id;
	}

	public String getFriendLabel() {
		return this.friendLabel;
	}

	public void setFriendLabel(String friendLabel) {
		this.friendLabel = friendLabel;
	}

	public String getAddTime() {
		return this.addTime;
	}

	public void setAddTime(String addTime) {
		this.addTime = addTime;
	}

}