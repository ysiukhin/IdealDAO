package org.itstep;

import org.itstep.dao.DaoFactory;
import org.itstep.dao.DoctorDao;
import org.itstep.entity.Doctor;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class Servlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        DaoFactory factory = DaoFactory.getInstance();
        DoctorDao dao = factory.createDoctorDao();

        List<Doctor> doctors= dao.findAll();
        request.setAttribute("doctors" , doctors);
        request.getRequestDispatcher("./WEB-INF/doctorlist.jsp")
                .forward(request,response);
          //response.getWriter().print("Hello from servlet");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

    }
}

