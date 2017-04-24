package org.zerock.domain;

import java.sql.Date;

public class MessageVO {

	
	private String sender;
	private String receiver;
	private String msg;
	private	Date regDate;
	private Date readDate;
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Date getReadDate() {
		return readDate;
	}
	public void setReadDate(Date readDate) {
		this.readDate = readDate;
	}
	@Override
	public String toString() {
		return "MessageVO [sender=" + sender + ", receiver=" + receiver + ", msg=" + msg + ", regDate=" + regDate
				+ ", readDate=" + readDate + "]";
	}

	
	
	
}
