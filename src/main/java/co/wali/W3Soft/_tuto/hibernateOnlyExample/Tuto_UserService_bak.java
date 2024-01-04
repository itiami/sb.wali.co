package co.wali.W3Soft._tuto.hibernateOnlyExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.wali.W3Soft.user.UserModel;


  @Service
  public class Tuto_UserService_bak {

//  @Autowired
//  private UserRepository userRepository;

  public UserModel getUser(Long id) {
      //return userRepository.findById(id);
      return null;
  }

  }

