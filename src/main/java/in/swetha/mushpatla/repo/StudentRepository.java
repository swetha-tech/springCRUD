package in.swetha.mushpatla.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.swetha.mushpatla.model.Student;

public interface StudentRepository 
	extends JpaRepository<Student, Integer>
{

}
