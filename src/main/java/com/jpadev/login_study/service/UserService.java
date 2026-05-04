package com.jpadev.login_study.service;

import com.jpadev.login_study.model.User;
import com.jpadev.login_study.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> listAllUsers(){
        return userRepository.findAll();
    }

    public User findUserById (Long id){
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found by ID:" + id));
    }

    public User saveUser(User user){
       return userRepository.save(user); // Voltar e construir com dto
    }

    public void deleteUserById(Long id){
        if (!userRepository.existsById(id)){
            throw new RuntimeException("User not found by ID:" + id);
        }
        userRepository.deleteById(id);
    }
}
