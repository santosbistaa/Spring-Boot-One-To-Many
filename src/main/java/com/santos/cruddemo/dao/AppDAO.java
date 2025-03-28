package com.santos.cruddemo.dao;

import com.santos.cruddemo.entity.Instructor;
import com.santos.cruddemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructionDetailById(int theId);

    void deleteInstructorDetailById(int theId);

}
