package br.com.pinotti.events.service;

import br.com.pinotti.events.model.Session;
import br.com.pinotti.events.model.Subscription;
import br.com.pinotti.events.model.User;

import java.util.List;

public interface ISubscriptionService {
    public Subscription addSubscription(Subscription subscription);
    public List<Subscription> getAllByUser(User user);
    public List<Subscription> getAllBySession(Session session);
}
