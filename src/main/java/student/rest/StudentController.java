package student.rest;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import student.service.StudentService;
import student.view.StudentRequest;
import student.view.StudentResponse;



@RestController
@RequestMapping(path = "/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<StudentResponse> getStudentInfo(@RequestBody StudentRequest request) {
		
		return studentService.getStudentInfo(request);
	}
	
	@GetMapping(path="/check")
	public String checkAdmin() {
		return "CHECK REST WORK";
	}
	
}
