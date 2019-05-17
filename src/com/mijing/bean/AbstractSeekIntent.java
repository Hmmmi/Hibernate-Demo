package com.mijing.bean;

/**
 * AbstractSeekIntent entity provides the base persistence definition of the
 * SeekIntent entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSeekIntent implements java.io.Serializable {

	// Fields

	private String intentUuid;
	private SeekUser seekUser;
	private String intentCtx;

	// Constructors

	/** default constructor */
	public AbstractSeekIntent() {
	}

	/** minimal constructor */
	public AbstractSeekIntent(String intentUuid, SeekUser seekUser) {
		this.intentUuid = intentUuid;
		this.seekUser = seekUser;
	}

	/** full constructor */
	public AbstractSeekIntent(String intentUuid, SeekUser seekUser,
			String intentCtx) {
		this.intentUuid = intentUuid;
		this.seekUser = seekUser;
		this.intentCtx = intentCtx;
	}

	// Property accessors

	public String getIntentUuid() {
		return this.intentUuid;
	}

	public void setIntentUuid(String intentUuid) {
		this.intentUuid = intentUuid;
	}

	public SeekUser getSeekUser() {
		return this.seekUser;
	}

	public void setSeekUser(SeekUser seekUser) {
		this.seekUser = seekUser;
	}

	public String getIntentCtx() {
		return this.intentCtx;
	}

	public void setIntentCtx(String intentCtx) {
		this.intentCtx = intentCtx;
	}

}