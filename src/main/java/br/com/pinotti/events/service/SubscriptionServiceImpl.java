package br.com.pinotti.events.service;

import br.com.pinotti.events.model.Session;
import br.com.pinotti.events.model.Subscription;
import br.com.pinotti.events.model.User;
import br.com.pinotti.events.repo.SubscriptionRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriptionServiceImpl implements ISubscriptionService {

    private final SubscriptionRepo repo;

    public SubscriptionServiceImpl(SubscriptionRepo repo) {
        this.repo = repo;
    }

    @Override
    public Subscription addSubscription(Subscription subscription) {
        return repo.save(subscription);
    }

    @Override
    public List<Subscription> getAllByUser(User user) {
        return repo.findByIdUser(user);
    }

    @Override
    public List<Subscription> getAllBySession(Session session) {
        return repo.findByIdSession(session);
    }
}