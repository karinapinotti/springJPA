package br.com.pinotti.events.service;

import br.com.pinotti.events.exception.NotFoundException;
import br.com.pinotti.events.model.Conference;
import br.com.pinotti.events.repo.ConferenceRepo;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class ConferenceServiceImpl implements IConferenceService {

    private ConferenceRepo repo;

    public ConferenceServiceImpl(ConferenceRepo repo) {
        this.repo = repo;
    }

    @Override
    public Conference addConference(Conference conference) {
        return repo.save(conference);
    }

    @Override
    public Conference getConferenceById(Integer id) {
        return repo.findById(id).orElseThrow(() -> new NotFoundException("Conference "+id+ "nor found"));
    }
}