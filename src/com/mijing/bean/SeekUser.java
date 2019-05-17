package com.mijing.bean;

import java.util.Set;

/**
 * SeekUser entity. @author MyEclipse Persistence Tools
 */
public class SeekUser extends AbstractSeekUser implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SeekUser() {
	}

	/** minimal constructor */
	public SeekUser(String userId) {
		super(userId);
	}

	/** full constructor */
	public SeekUser(String userId, String password, String headImg,
			String background, String sign, String nickname, String birthday,
			Integer sex, String addressId, String education,
			Set seekFriendsForFriendId, Set seekSendMsgs,
			Set seekFriendsForUserId, Set seekIntents) {
		super(userId, password, headImg, background, sign, nickname, birthday,
				sex, addressId, education, seekFriendsForFriendId,
				seekSendMsgs, seekFriendsForUserId, seekIntents);
	}
	
	@Override
	public String toString() {
		return "User["+getUserId()+"]: "+getNickname()+", "+getSign()+", "+getSex()
				+", "+getAddressId()+", "+getEducation();
	}

}
