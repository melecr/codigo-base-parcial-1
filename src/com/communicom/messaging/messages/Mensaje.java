package com.communicom.messaging.messages;

import java.awt.TrayIcon.MessageType;
import java.time.LocalDateTime;

public class Mensaje {
	String name;
    int messageNumber;
    String sourceAddress;
    String targetAddress;
    LocalDateTime emisionTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMessageNumber() {
        return messageNumber;
    }

    public void setMessageNumber(int messageNumber) {
        this.messageNumber = messageNumber;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getTargetAddress() {
        return targetAddress;
    }

    public void setTargetAddress(String targetAddress) {
        this.targetAddress = targetAddress;
    }

    public LocalDateTime getEmisionTime() {
        return emisionTime;
    }

    public void setEmisionTime(LocalDateTime emisionTime) {
        this.emisionTime = emisionTime;
    }

}
