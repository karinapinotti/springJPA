package br.com.pinotti.events.controller;

import br.com.pinotti.events.model.Session;
import br.com.pinotti.events.model.Subscription;
import br.com.pinotti.events.model.User;
import br.com.pinotti.events.service.ISubscriptionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SubscriptionController {

    private ISubscriptionService service;

    public SubscriptionController(ISubscriptionService service) {
        this.service = service;
    }

    @PostMapping("/subscriptions")
    public ResponseEntity<Subscription> addSubscription(@RequestBody Subscription subscription) {
        return ResponseEntity.status(201).body(service.addSubscription(subscription));
    }

    @GetMapping("/subscriptions/user/{userId}")
    public ResponseEntity<List<Subscription>> getById(@PathVariable Integer id) {
        User user = new User();
        user.setUserId(id);
        return ResponseEntity.ok(service.getAllByUser(user));
    }

    @GetMapping("/subscriptions/session/{id}")
    public ResponseEntity<List<Subscription>> getBysession(@PathVariable Integer id) {
        Session session = new Session();
        session.setIdSession(id);
        return ResponseEntity.ok(service.getAllBySession(session));
    }
}
