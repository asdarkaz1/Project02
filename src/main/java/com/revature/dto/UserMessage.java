package com.revature.dto;

import java.util.Objects;

public class UserMessage {

    private String message;

    public UserMessage() {
    }

    public String getMessage() {
        return message;
    }

    public UserMessage(String message){
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserMessage message1)) return false;
        return Objects.equals(message, message1.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                '}';
    }
}
