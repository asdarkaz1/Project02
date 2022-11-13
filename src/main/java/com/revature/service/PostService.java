package com.revature.service;

import com.revature.dao.PostDao;
import com.revature.exception.PostUnsuccessfullyCreated;
import com.revature.model.Post;
import com.revature.exception.PostNotFoundException;

import java.sql.SQLException;
import java.util.List;

public class PostService {

    private PostDao postDao = new PostDao();

    public void createPost(Post post) throws SQLException {
       post.setPostTitle(post.getPostTitle().strip());
        post.setPostDescription(post.getPostDescription().strip());
        post.setPostImage(post.getPostImage());

        if (post.getPostTitle().length() == 0) {
            throw new IllegalArgumentException("You Must Have a Post Title");
        }
        if(post.getPostDescription().length() == 0) {
            throw new IllegalArgumentException("You Must Have a Post Description");
        }
        int createdPostRecord = postDao.createPost(post);
        if (createdPostRecord != 1) {
            throw new PostUnsuccessfullyCreated("The Post could not be created");
        }
    }
    public Post getPostsById(int id) throws SQLException {
        Post post = postDao.getPostsById(id);

        if (post == null) {
            throw new PostNotFoundException("Post with id "+id+" was not found");
        } else {
            return post;
        }
    }
    public List<Post> getAllPostsBelongingToUser(int userId) throws SQLException {
        return postDao.getAllPostsBelongingToUser(userId);
    }
    public List<Post> getAllPosts() throws SQLException {
        return postDao.getAllPosts();
    }

}
