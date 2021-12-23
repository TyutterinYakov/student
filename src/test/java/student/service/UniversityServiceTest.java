package student.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import student.domain.Faculty;
import student.domain.University;

//@RunWith(SpringRunner.class)
//@ContextConfiguration(locations = {"classpath:springContext.xml"})
public class UniversityServiceTest {

	
//	@Autowired
//	private UniversityService service;
//	
//	@Test
//	public void findFullUniversities() {
//		List<University> list = service.findFullUniversities();
//		list.forEach(ff->System.out.println(ff.getUniversityName()+" "+ff.getFaculties()));
//	}
//	
//	@Test
//	public void getUniversity() {
//		University u = service.getUniversity(4L);
//		System.out.println(u.getUniversityName()+": "+u.getFaculties().size());
//	}
//	
////	@Test
////	public void findUniversities() {
////		List<University> list = service.findUniversities();
////		list.forEach(u->System.out.println(u.getUniversityId()+" "+u.getUniversityName()+" "+u.getFaculties().size()));
////	}
//	
////	@Test
////	public void findFaculties() {
////		List<Faculty> list = service.findFaculties();
////		list.forEach(f->System.out.println(f.getUniversity().getUniversityName()));
////	}
//	
//	@Test
//	public void getFaculty() {
//		Faculty fc = service.getFaculty(7L);
//		System.out.println(fc.getUniversity().getUniversityName());
//	}

}
