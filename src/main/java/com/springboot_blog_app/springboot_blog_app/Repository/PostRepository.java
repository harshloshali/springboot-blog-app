package com.springboot_blog_app.springboot_blog_app.Repository;

import com.springboot_blog_app.springboot_blog_app.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {}

