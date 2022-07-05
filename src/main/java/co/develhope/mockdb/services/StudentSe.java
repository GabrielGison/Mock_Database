package co.develhope.mockdb.services;

import co.develhope.mockdb.entities.Student;
import co.develhope.mockdb.repositories.StudentRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentSe {

    @Autowired
    private StudentRep studentRep;

    public List<Student> listAllStudent() {
        return studentRep.findAll();
    }
    public void saveStudent(Student student) { studentRep.save(student); }

    public Student getSong(Integer id) {return studentRep.findById(id).get();}

    public void deleteSong(Integer id) {
        studentRep.deleteById(id);
    }
}
