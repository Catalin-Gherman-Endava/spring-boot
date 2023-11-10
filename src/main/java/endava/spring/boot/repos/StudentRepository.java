package endava.spring.boot.repos;

import endava.spring.boot.domain.Student;

import org.springframework.data.jpa.repository.JpaRepository;


public interface StudentRepository extends JpaRepository<Student, Long> {
}
