package com.dmtr.crud.dao;

import com.dmtr.crud.entity.Pupil;

import java.util.List;

public interface PupilDAO {
    void save(Pupil pupil);
    Pupil findById(int id);
    List<Pupil> findAll();
    List<Pupil> findPupilByLastName(String lastName);
    void update(Pupil pupil);
}
