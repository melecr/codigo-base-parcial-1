package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public abstract class PingServerRequest implements Mensaje {
	private int messageNumber;
	private String sourceAddress;
	private String targetAddress;
	private LocalDateTime emisionTime;
	
	public PingServerRequest(){
		this.messageNumber = 1;
		this.emisionTime = LocalDateTime.now();
	}
}
