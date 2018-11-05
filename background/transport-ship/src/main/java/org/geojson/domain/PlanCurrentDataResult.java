package org.geojson.domain;

import java.io.Serializable;

public class PlanCurrentDataResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4111991690090107217L;
	
	private String code;
	private String message;
	private String messageCn;
	private String messageEn;
	
	private PlanCurrentDataData data;
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessageCn() {
		return messageCn;
	}

	public void setMessageCn(String messageCn) {
		this.messageCn = messageCn;
	}

	public String getMessageEn() {
		return messageEn;
	}

	public void setMessageEn(String messageEn) {
		this.messageEn = messageEn;
	}

	public PlanCurrentDataData getData() {
		return data;
	}

	public void setData(PlanCurrentDataData data) {
		this.data = data;
	}

	


}
