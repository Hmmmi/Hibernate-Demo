package com.mijing.bean;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractSeekUser entity provides the base persistence definition of the
 * SeekUser entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSeekUser implements java.io.Serializable {

	// Fields

	private String userId;
	private String password;
	private String headImg;
	private String background;
	private String sign;
	private String nickname;
	private String birthday;
	private Integer sex;
	private String addressId;
	private String education;
	private Set seekFriendsForFriendId = new HashSet(0);
	private Set seekSendMsgs = new HashSet(0);
	private Set seekFriendsForUserId = new HashSet(0);
	private Set seekIntents = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSeekUser() {
	}

	/** minimal constructor */
	public AbstractSeekUser(String userId) {
		this.userId = userId;
	}

	/** full constructor */
	public AbstractSeekUser(String userId, String password, String headImg,
			String background, String sign, String nickname, String birthday,
			Integer sex, String addressId, String education,
			Set seekFriendsForFriendId, Set seekSendMsgs,
			Set seekFriendsForUserId, Set seekIntents) {
		this.userId = userId;
		this.password = password;
		this.headImg = headImg;
		this.background = background;
		this.sign = sign;
		this.nickname = nickname;
		this.birthday = birthday;
		this.sex = sex;
		this.addressId = addressId;
		this.education = education;
		this.seekFriendsForFriendId = seekFriendsForFriendId;
		this.seekSendMsgs = seekSendMsgs;
		this.seekFriendsForUserId = seekFriendsForUserId;
		this.seekIntents = seekIntents;
	}

	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHeadImg() {
		return this.headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getBackground() {
		return this.background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getAddressId() {
		return this.addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public Set getSeekFriendsForFriendId() {
		return this.seekFriendsForFriendId;
	}

	public void setSeekFriendsForFriendId(Set seekFriendsForFriendId) {
		this.seekFriendsForFriendId = seekFriendsForFriendId;
	}

	public Set getSeekSendMsgs() {
		return this.seekSendMsgs;
	}

	public void setSeekSendMsgs(Set seekSendMsgs) {
		this.seekSendMsgs = seekSendMsgs;
	}

	public Set getSeekFriendsForUserId() {
		return this.seekFriendsForUserId;
	}

	public void setSeekFriendsForUserId(Set seekFriendsForUserId) {
		this.seekFriendsForUserId = seekFriendsForUserId;
	}

	public Set getSeekIntents() {
		return this.seekIntents;
	}

	public void setSeekIntents(Set seekIntents) {
		this.seekIntents = seekIntents;
	}

}