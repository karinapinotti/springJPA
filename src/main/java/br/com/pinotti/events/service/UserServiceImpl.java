package br.com.pinotti.events.service;

import br.com.pinotti.events.exception.NotFoundException;
import br.com.pinotti.events.model.User;
import br.com.pinotti.events.repo.UserRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private UserRepo repo;

    public UserServiceImpl(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public User addUser(User user) {
        return repo.save(user);
    }

    @Override
    public User getUserById(Integer id) {
        return repo.findById(id)
                .orElseThrow(() -> new NotFoundException("User " + id + " not found"));
    }

    @Override
    public User getUserByEmail(String email) {
        return repo.findByEmail(email)
                .orElseThrow(() -> new NotFoundException("Email " + email + " not registred"));
    }

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

}