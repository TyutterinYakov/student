package student.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import student.domain.Faculty;


public interface FacultyRepository extends JpaRepository<Faculty, Long> {
	
}
