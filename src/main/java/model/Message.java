package model;

public class Message {

    private String content;
    private String sender;
    private MessageType type;

    public enum MessageType{
        CHAT,LEAVE,JOIN
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
