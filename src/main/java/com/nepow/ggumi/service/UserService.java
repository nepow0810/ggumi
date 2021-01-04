package com.nepow.ggumi.service;

import com.nepow.ggumi.model.User;
import com.nepow.ggumi.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;

  public List<User> getUserList() {
    return userRepository.findAll();
  }

  public void createUser(User user) {
    userRepository.save(user);
  }
}
