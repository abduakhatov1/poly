package com.example.demo2.repo;


import com.example.demo2.models.Post;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PostRepository extends CrudRepository <Post, Long>, JpaSpecificationExecutor<Post> {


    Optional<Post> findAllById(long id);
}
