package org.example.service;

import org.example.model.Speaker;
import org.example.repository.HibernateSpeakerRepositoryImpl;
import org.example.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    @Override
    public List<Speaker> findAll() {
        SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
        return repository.findAll();
    }
}
