package com.revature.dao;

import com.revature.model.Post;
import com.revature.util.ConnectionFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PostDao {

    //post (C)
    public int createPost(Post createdPost) throws SQLException {
        try (Connection connection = ConnectionFactory.createConnection()) {
            try {
                PreparedStatement pstmt = connection.prepareStatement
                        ("INSERT INTO posts (postTitle, postDescription, postImage, userId");

                FileInputStream uploadedImg = new FileInputStream(createdPost.getPostImage().toString());

                pstmt.setString(1, createdPost.getPostTitle());
                pstmt.setString(2, createdPost.getPostDescription());
                pstmt.setBinaryStream(3, uploadedImg);

                int numOfRecordUpdated = pstmt.executeUpdate();
                return numOfRecordUpdated;

            }catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    //get (R)
    public Post getPostsById(int id) throws SQLException {
        try (Connection connection = ConnectionFactory.createConnection()){
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM posts WHERE id = ?");

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                Blob blob = rs.getBlob("image");
                InputStream is = blob.getBinaryStream(1, blob.length());
                BufferedImage postImage = ImageIO.read(is);

                return new Post(rs.getInt("id"), rs.getString("postTitle"),
                        rs.getString("postDescription"), postImage, rs.getInt("user_id"), rs.getInt("postLike"));
            } else {
                //if no record associated with the id is found
                return null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Post> getAllPostsBelongingToUser(int userId) throws SQLException {
        try (Connection connection = ConnectionFactory.createConnection()){
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM posts WHERE user_id = ?");

            ResultSet rs = pstmt.executeQuery();

            List<Post> userPosts = new ArrayList<>();

            while (rs.next()) {
                Blob blob = rs.getBlob("image");
                InputStream is = blob.getBinaryStream(1, blob.length());
                BufferedImage postImage = ImageIO.read(is);

                Post post = new Post(rs.getInt("id"), rs.getString("postTitle"),
                        rs.getString("postDescription"), postImage, rs.getInt("user_id"), rs.getInt("postLike"));

                userPosts.add(post);
            }
            return userPosts;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public List<Post> getAllPosts() throws SQLException {
        try (Connection connection = ConnectionFactory.createConnection()){
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM posts");

            ResultSet rs = pstmt.executeQuery();

            List<Post> posts = new ArrayList<>();

            while (rs.next()) {
                Blob blob = rs.getBlob("image");
                InputStream is = blob.getBinaryStream(1, blob.length());
                BufferedImage postImage = ImageIO.read(is);

                Post post = new Post(rs.getInt("id"), rs.getString("postTitle"),
                        rs.getString("postDescription"), postImage, rs.getInt("user_id"), rs.getInt("postLike"));

                posts.add(post);
            }
            return posts;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //update (U)

    //delete (D)

}
