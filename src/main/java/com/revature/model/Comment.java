package com.revature.model;

import java.util.Objects;

public class Comment {

    private int id;
    private String commentDescription;
    private int userId;

    public Comment(){}
    public Comment(int id) {
        this.id = id;
    }
    public Comment(int id, String commentDescription, int userId) {
        this.id = id;
        this.commentDescription = commentDescription;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommentDescription() {
        return commentDescription;
    }

    public void setCommentDescription(String commentDescription) {
        this.commentDescription = commentDescription;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return id == comment.id && userId == comment.userId && commentDescription.equals(comment.commentDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, commentDescription, userId);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", commentDescription='" + commentDescription + '\'' +
                ", userId=" + userId +
                '}';
    }

}
