package student.servlet;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import student.domain.University;
import student.service.UniversityService;








@WebServlet(name="UniversityListServlet", urlPatterns={"/universityList"})

public class UniversityListServlet extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext ctx = getServletContext();
		WebApplicationContext webCtx = WebApplicationContextUtils.getWebApplicationContext(ctx);
		UniversityService service = webCtx.getBean(UniversityService.class);
		List<University> list = service.findUniversities();
		list.forEach(u->System.out.println(u.getUniversityId()+" "+u.getUniversityName()));
		req.setAttribute("today", LocalDate.now().format(DateTimeFormatter.ISO_DATE));
		req.setAttribute("universities", list);
		
		getServletContext().getRequestDispatcher("/universityList.jsp").forward(req, resp);
	}
	
	
	
}
