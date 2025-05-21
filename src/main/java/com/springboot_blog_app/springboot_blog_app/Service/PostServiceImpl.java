package com.springboot_blog_app.springboot_blog_app.Service;

import com.springboot_blog_app.springboot_blog_app.DTO.PostDTO;
import com.springboot_blog_app.springboot_blog_app.Entity.Post;
import com.springboot_blog_app.springboot_blog_app.Exceptions.ResourceNotFoundException;
import com.springboot_blog_app.springboot_blog_app.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    private PostDTO mapToDto(Post post) {
        PostDTO dto = new PostDTO();
        dto.setId(post.getId());
        dto.setTitle(post.getTitle());
        dto.setContent(post.getContent());
        return dto;
    }

    private Post mapToEntity(PostDTO dto) {
        Post post = new Post();
        post.setTitle(dto.getTitle());
        post.setContent(dto.getContent());
        return post;
    }

    @Override
    public PostDTO createPost(PostDTO postDto) {
        Post post = mapToEntity(postDto);
        return mapToDto(postRepository.save(post));
    }

    @Override
    public List<PostDTO> getAllPosts() {
        return postRepository.findAll().stream().map(this::mapToDto).toList();
    }

    @Override
    public PostDTO getPostById(Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post not found"));
        return mapToDto(post);
    }

    @Override
    public PostDTO updatePost(Long id, PostDTO postDto) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post not found"));
        post.setTitle(postDto.getTitle());
        post.setContent(postDto.getContent());
        return mapToDto(postRepository.save(post));
    }

    @Override
    public void deletePost(Long id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Post not found"));
        postRepository.delete(post);
    }
}

