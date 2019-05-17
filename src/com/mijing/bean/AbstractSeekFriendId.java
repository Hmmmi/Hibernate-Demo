package com.mijing.bean;

/**
 * AbstractSeekFriendId entity provides the base persistence definition of the
 * SeekFriendId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSeekFriendId implements java.io.Serializable {

	// Fields

	private SeekUser seekUser;
	private SeekUser seekUser_1;

	// Constructors

	/** default constructor */
	public AbstractSeekFriendId() {
	}

	/** full constructor */
	public AbstractSeekFriendId(SeekUser seekUser, SeekUser seekUser_1) {
		this.seekUser = seekUser;
		this.seekUser_1 = seekUser_1;
	}

	// Property accessors

	public SeekUser getSeekUser() {
		return this.seekUser;
	}

	public void setSeekUser(SeekUser seekUser) {
		this.seekUser = seekUser;
	}

	public SeekUser getSeekUser_1() {
		return this.seekUser_1;
	}

	public void setSeekUser_1(SeekUser seekUser_1) {
		this.seekUser_1 = seekUser_1;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractSeekFriendId))
			return false;
		AbstractSeekFriendId castOther = (AbstractSeekFriendId) other;

		return ((this.getSeekUser() == castOther.getSeekUser()) || (this
				.getSeekUser() != null && castOther.getSeekUser() != null && this
				.getSeekUser().equals(castOther.getSeekUser())))
				&& ((this.getSeekUser_1() == castOther.getSeekUser_1()) || (this
						.getSeekUser_1() != null
						&& castOther.getSeekUser_1() != null && this
						.getSeekUser_1().equals(castOther.getSeekUser_1())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getSeekUser() == null ? 0 : this.getSeekUser().hashCode());
		result = 37
				* result
				+ (getSeekUser_1() == null ? 0 : this.getSeekUser_1()
						.hashCode());
		return result;
	}

}