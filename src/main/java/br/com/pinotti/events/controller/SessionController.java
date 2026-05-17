package br.com.pinotti.events.controller;

import br.com.pinotti.events.model.Session;
import br.com.pinotti.events.service.ISessionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sessions")
public class SessionController {

    private ISessionService service;

    public SessionController(ISessionService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Session> addSession(@RequestBody Session session) {

        return ResponseEntity
                .status(201)
                .body(service.addSession(session));
    }
}