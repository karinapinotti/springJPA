package br.com.pinotti.events.service;

import br.com.pinotti.events.model.Session;
import java.util.List;

public interface ISessionService {

    Session addSession(Session session);

    Session getSessionById(Integer id);

    List<Session> getAllSessions();
}