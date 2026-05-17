package br.com.pinotti.events.repo;

import br.com.pinotti.events.model.Conference;
import org.springframework.data.repository.ListCrudRepository;

public interface ConferenceRepo extends ListCrudRepository<Conference, Integer> {

}