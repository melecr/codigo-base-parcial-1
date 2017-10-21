package com.communicom.messaging.messages;

import java.time.LocalDateTime;

public abstract class BootstrapOperationResponse implements Mensaje {
	private int messageNumber;
	private String sourceAddress;
	private String targetAddress;
	private LocalDateTime emisionTime;
	private String messageName;
	private String version;
}
