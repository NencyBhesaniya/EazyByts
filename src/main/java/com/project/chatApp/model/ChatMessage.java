package com.project.chatApp.model;

public class ChatMessage {
    private String sender;
    private String content;
    // Optionally include timestamp, message type etc.

    // Getters and setters
    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}
