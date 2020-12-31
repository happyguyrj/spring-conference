package org.example.repository;

import org.example.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository{

    public List<Speaker> findAll() {
        List<Speaker> newList = new ArrayList<>();
        newList.add(new Speaker("Rahul", "Jain"));
        return newList;
    }
}
