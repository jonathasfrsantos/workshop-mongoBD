package com.jfrsantos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jfrsantos.domain.Post;
import com.jfrsantos.domain.User;
import com.jfrsantos.repositories.PostRepository;
import com.jfrsantos.repositories.UserRepository;
import com.jfrsantos.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository postRepository;

	public Post findById(String id) {
		Optional<Post> obj = postRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}


}
