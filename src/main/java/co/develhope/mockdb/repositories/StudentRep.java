package co.develhope.mockdb.repositories;

import co.develhope.mockdb.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRep extends JpaRepository<Student, Integer> {
    List<Student> findBySongTitle(String email);
}
