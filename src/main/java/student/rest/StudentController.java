package student.rest;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import student.service.StudentService;
import student.view.StudentRequest;
import student.view.StudentResponse;



@RestController
@RequestMapping(path = "/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	public List<StudentResponse> getStudentInfo(StudentRequest request) {
		
		return studentService.getStudentInfo(request);
	}
	
	@GetMapping(path="/check")
	public String checkAdmin() {
		return "CHECK REST WORK";
	}
	
}
