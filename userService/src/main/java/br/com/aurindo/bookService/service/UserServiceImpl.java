package br.com.aurindo.bookService.service;

import br.com.aurindo.bookService.UserRepository;
import br.com.aurindo.bookService.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long userId) {
        return userRepository.findById(userId).get();
    }

    @Override
    public User save(User user) throws Exception {

        if (userRepository.findByLogin(user.getLogin()) != null) {
            throw new Exception(String.format("Already user %s registered.", user.getLogin()));
        }

        return userRepository.save(user);
    }

    @Override
    public void delete(Long userId) {
        userRepository.delete(new User(userId));
    }
}
