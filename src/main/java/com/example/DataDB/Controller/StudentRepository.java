package com.example.DataDB.Controller;

import com.example.DataDB.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student,Long> {
}
