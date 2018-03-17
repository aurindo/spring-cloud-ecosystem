package br.com.aurindo.bookService;

import br.com.aurindo.bookService.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByLogin(String login);

    User findByLoginAndPassword(String login, String password);

}
