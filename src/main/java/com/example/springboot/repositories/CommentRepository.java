package com.example.springboot.repositories; 

import com.example.springboot.models.Comment; 
import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository; 

@Repository 
public interface CommentRepository extends JpaRepository<Comment, Long> { 
}