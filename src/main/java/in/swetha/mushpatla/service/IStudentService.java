package in.swetha.mushpatla.service;

import java.util.List;
import java.util.Optional;

import in.swetha.mushpatla.model.Student;


public interface IStudentService {
public Integer saveStudent(Student s);
public List<Student> getAllStudents();
public Optional<Student> getOneStudent(Integer id);
public boolean isExist(Integer id);
public void deleteStudent(Integer id);
}
