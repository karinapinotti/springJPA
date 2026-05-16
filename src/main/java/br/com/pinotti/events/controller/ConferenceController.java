package br.com.pinotti.events.controller;

import br.com.pinotti.events.model.Conference;
import br.com.pinotti.events.service.IConferenceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conferences")
public class ConferenceController {

    private IConferenceService service;

    public ConferenceController(IConferenceService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Conference> addConference(@RequestBody Conference conference) {

        return ResponseEntity
                .status(201)
                .body(service.addConference(conference));
    }
}