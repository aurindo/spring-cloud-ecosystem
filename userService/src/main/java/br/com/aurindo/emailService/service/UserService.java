package br.com.aurindo.emailService.service;

import br.com.aurindo.emailService.entity.User;

public interface UserService {
    Iterable<User> findAll();

    User findById(Long userId);

    User save(User user) throws Exception;

    void delete(Long userId);
}
