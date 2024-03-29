package co.wali.W3Soft.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // CRUD methods
    public void createUser(User user) {
        System.out.println("UserService: "+ user);
        if (user != null) {
             userRepository.save(user);
        }else{

        }
    }

    /*public User createUser(User user) {
        return userRepository.save(user);
    }*/

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
