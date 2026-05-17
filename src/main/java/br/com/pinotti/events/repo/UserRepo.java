package br.com.pinotti.events.repo;

import br.com.pinotti.events.model.Session;
import br.com.pinotti.events.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.Optional;

public interface UserRepo extends ListCrudRepository<User, Integer> {

    public Optional<User> findByEmail(String email);
}