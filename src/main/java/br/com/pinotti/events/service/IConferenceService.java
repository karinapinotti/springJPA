package br.com.pinotti.events.service;

import br.com.pinotti.events.model.Conference;

public interface IConferenceService {

    Conference addConference(Conference conference);

    Conference getConferenceById(Integer id);
}