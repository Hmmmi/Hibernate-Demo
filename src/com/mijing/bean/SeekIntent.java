package com.mijing.bean;

/**
 * SeekIntent entity. @author MyEclipse Persistence Tools
 */
public class SeekIntent extends AbstractSeekIntent implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SeekIntent() {
	}

	/** minimal constructor */
	public SeekIntent(String intentUuid, SeekUser seekUser) {
		super(intentUuid, seekUser);
	}

	/** full constructor */
	public SeekIntent(String intentUuid, SeekUser seekUser, String intentCtx) {
		super(intentUuid, seekUser, intentCtx);
	}

}
