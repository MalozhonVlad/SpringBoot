package com.example.demo.servlet;

import com.example.demo.repo.LanguageMySQLRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/hell")
@Slf4j
public class HellServlet extends HttpServlet {

    @Autowired
    private LanguageMySQLRepo mySQLRepo;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.warn(Thread.currentThread().getName());

        String ip = req.getRemoteAddr();
        String creator = mySQLRepo.findById(1L).get().getCreator();

        resp.setContentType("text/html");

        PrintWriter pw = resp.getWriter();
        pw.println("<html>");

        pw.println("<head>");
        pw.println("<title>Hell</title>");
        pw.println("</head>");

        pw.println("<body>");
        pw.println("<p> Your ip: " + ip + "</p>");
        pw.println("<p> Creator: " + creator + "</p>");
        pw.println("</body>");

        pw.println("</html>");

    }
}
