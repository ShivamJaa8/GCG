package com.example.gcg;

public class msgModelclass {
    String message;
    String senderid;
    long timestamp;

    public msgModelclass(){

    }
    public msgModelclass(String message,String senderid,long temestamp){
        this.message=message;
        this.senderid=senderid;
        this.timestamp=temestamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSenderid() {
        return senderid;
    }

    public void setSenderid(String senderid) {
        this.senderid = senderid;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
}
