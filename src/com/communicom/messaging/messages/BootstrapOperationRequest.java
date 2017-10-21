package com.communicom.messaging.messages;

import java.awt.TrayIcon.MessageType;
import java.time.LocalDateTime;

public abstract class BootstrapOperationRequest implements Mensaje {
	private int messageNumber;
	private String sourceAddress;
	private String targetAddress;
	private LocalDateTime emisionTime;
	private String messageName;
	private String version;
	protected MessageType messageType;

}
