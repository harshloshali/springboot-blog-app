package com.springboot_blog_app.springboot_blog_app.Service;

import com.springboot_blog_app.springboot_blog_app.DTO.PostDTO;

import java.util.List;

public interface PostService {
    PostDTO createPost(PostDTO postDto);
    List<PostDTO> getAllPosts();
    PostDTO getPostById(Long id);
    PostDTO updatePost(Long id, PostDTO postDto);
    void deletePost(Long id);
}
