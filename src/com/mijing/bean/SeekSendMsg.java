package com.mijing.bean;

/**
 * SeekSendMsg entity. @author MyEclipse Persistence Tools
 */
public class SeekSendMsg extends AbstractSeekSendMsg implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SeekSendMsg() {
	}

	/** minimal constructor */
	public SeekSendMsg(String msgId) {
		super(msgId);
	}

	/** full constructor */
	public SeekSendMsg(String msgId, SeekUser seekUser, String receiveId,
			String sendTime, Integer msgType, String content) {
		super(msgId, seekUser, receiveId, sendTime, msgType, content);
	}

}
