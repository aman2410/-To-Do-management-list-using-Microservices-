package com.exam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.exam.ValueObject.ResponseTemplateVO;
import com.exam.ValueObject.ToDo;
import com.exam.entity.User;
import com.exam.repository.UserDao;

@Service
public class UserService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
   private UserDao userRepository;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithToDo(Long userId, String url) {
		// TODO Auto-generated method stub
		 ResponseTemplateVO vo = new ResponseTemplateVO();
		Optional<User> user = userRepository.findById(userId);
		
		User user2 = user.get();
	  
		ToDo todo = restTemplate.getForObject("http://TODO-SERVICE/todolist/"+user2.getProjectId(), ToDo.class);
	vo.setUser(user2);
	vo.setTodo(todo);
	return vo;
		
	}

	public void deleteUserById(Long userId) {
		// TODO Auto-generated method stub
		
		userRepository.deleteById(userId);
	}
	
	
}
