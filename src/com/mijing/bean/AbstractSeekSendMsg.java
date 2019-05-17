package com.mijing.bean;

/**
 * AbstractSeekSendMsg entity provides the base persistence definition of the
 * SeekSendMsg entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSeekSendMsg implements java.io.Serializable {

	// Fields

	private String msgId;
	private SeekUser seekUser;
	private String receiveId;
	private String sendTime;
	private Integer msgType;
	private String content;

	// Constructors

	/** default constructor */
	public AbstractSeekSendMsg() {
	}

	/** minimal constructor */
	public AbstractSeekSendMsg(String msgId) {
		this.msgId = msgId;
	}

	/** full constructor */
	public AbstractSeekSendMsg(String msgId, SeekUser seekUser,
			String receiveId, String sendTime, Integer msgType, String content) {
		this.msgId = msgId;
		this.seekUser = seekUser;
		this.receiveId = receiveId;
		this.sendTime = sendTime;
		this.msgType = msgType;
		this.content = content;
	}

	// Property accessors

	public String getMsgId() {
		return this.msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public SeekUser getSeekUser() {
		return this.seekUser;
	}

	public void setSeekUser(SeekUser seekUser) {
		this.seekUser = seekUser;
	}

	public String getReceiveId() {
		return this.receiveId;
	}

	public void setReceiveId(String receiveId) {
		this.receiveId = receiveId;
	}

	public String getSendTime() {
		return this.sendTime;
	}

	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	public Integer getMsgType() {
		return this.msgType;
	}

	public void setMsgType(Integer msgType) {
		this.msgType = msgType;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}