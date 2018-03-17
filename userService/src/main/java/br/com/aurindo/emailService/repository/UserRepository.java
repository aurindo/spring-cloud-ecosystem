package br.com.aurindo.emailService.repository;

import br.com.aurindo.emailService.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByLogin(String login);

    User findByLoginAndPassword(String login, String password);

}
