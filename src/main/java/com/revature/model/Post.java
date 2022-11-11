package com.revature.model;

import java.awt.*;
import java.util.Objects;

public class Post {

    private int id;
    private String postTitle;
    private String postDescription;
    private Image postImage;
    private int userId;

    private int postLike;

    public Post(){}

    public Post(int id, String postTitle, String postDescription, Image postImage, int userId, int postLike) {
        this.id = id;
        this.postTitle = postTitle;
        this.postDescription = postDescription;
        this.postImage = postImage;
        this.userId = userId;
        this.postLike = postLike;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostTitle() {
        return postTitle;
    }

    public void setPostTitle(String postTitle) {
        this.postTitle = postTitle;
    }

    public String getPostDescription() {
        return postDescription;
    }

    public void setPostDescription(String postDescription) {
        this.postDescription = postDescription;
    }

    public Image getPostImage() {
        return postImage;
    }

    public void setPostImage(Image postImage) {
        this.postImage = postImage;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPostLike() {
        return postLike;
    }

    public void setPostLike(int postLike) {
        this.postLike = postLike;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Post post = (Post) o;
        return id == post.id && userId == post.userId && postTitle.equals(post.postTitle)
                && postDescription.equals(post.postDescription)
                && Objects.equals(postImage, post.postImage)
                && postLike == post.postLike;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, postTitle, postDescription, postImage, userId, postLike);
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", postTitle='" + postTitle + '\'' +
                ", postDescription='" + postDescription + '\'' +
                ", postImage=" + postImage +
                ", userId=" + userId +
                ", postLike=" + postLike +
                '}';
    }

}
