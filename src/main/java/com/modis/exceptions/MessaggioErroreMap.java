package com.modis.exceptions;

import java.util.Date;
import java.util.Map;

public class MessaggioErroreMap {
	private Date timeStamp;
	private int status;
	private String error;
	private Map<String, String> messages;
	private String pathUri;
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public Map<String, String> getMessages() {
		return messages;
	}
	public void setMessages(Map<String, String> messages) {
		this.messages = messages;
	}
	public String getPathUri() {
		return pathUri;
	}
	public void setPathUri(String pathUri) {
		this.pathUri = pathUri;
	}
}
