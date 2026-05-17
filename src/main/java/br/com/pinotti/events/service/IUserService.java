package br.com.pinotti.events.service;

import br.com.pinotti.events.model.User;

import java.util.List;

public interface IUserService {

    User addUser(User user);

    User getUserById(Integer id);

    User getUserByEmail(String email);

    List<User> getAllUsers();

}