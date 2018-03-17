package br.com.aurindo.bookService.service;

import br.com.aurindo.bookService.entity.User;

public interface UserService {
    Iterable<User> findAll();

    User findById(Long userId);

    User save(User user) throws Exception;

    void delete(Long userId);
}
