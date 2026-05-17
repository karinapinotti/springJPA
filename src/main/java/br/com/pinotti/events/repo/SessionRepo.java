package br.com.pinotti.events.repo;

import org.springframework.data.repository.ListCrudRepository;

import br.com.pinotti.events.model.Session;

public interface SessionRepo extends ListCrudRepository<Session, Integer> {

}