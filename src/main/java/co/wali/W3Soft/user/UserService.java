package co.wali.W3Soft.user;

import java.util.Optional;

public class UserService {
    private UserRepository userRepository;

    public void allUser() {
        userRepository.findAll();
    }

    public Optional<UserModel> getUser(Long id) {
        return userRepository.findById(id);
    }

}
