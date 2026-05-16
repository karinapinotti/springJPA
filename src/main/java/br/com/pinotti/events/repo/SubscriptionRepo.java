package br.com.pinotti.events.repo;

import br.com.pinotti.events.model.Session;
import br.com.pinotti.events.model.Subscription;
import br.com.pinotti.events.model.SubscriptionID;
import br.com.pinotti.events.model.User;
import org.springframework.data.repository.ListCrudRepository;

import java.util.List;

public interface SubscriptionRepo extends ListCrudRepository<Subscription, SubscriptionID> {

    List<Subscription> findByIdUser(User user);

    List<Subscription> findByIdSession(Session session);
}