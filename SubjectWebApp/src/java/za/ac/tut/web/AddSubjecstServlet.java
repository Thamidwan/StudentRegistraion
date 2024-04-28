/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.SubjectsFacadeLocal;
import za.ac.tut.entities.Subjects;

/**
 *
 * @author USER
 */
public class AddSubjecstServlet extends HttpServlet {

    @EJB
    private SubjectsFacadeLocal psl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String subjectName = request.getParameter("subjectName");
        String subjectCode = request.getParameter("subjectCode");
        
        Subjects subject = createSubjects(subjectName,subjectCode);
        psl.create(subject);
        
        RequestDispatcher disp = request.getRequestDispatcher("add_outcome.jsp");
        disp.forward(request, response);
        
    }

    private Subjects createSubjects(String subjectName, String subjectCode) {
       Subjects s = new Subjects();
       Map<String,String> map = new HashMap<>();
       map.put(subjectName,subjectCode);
       s.setMap(map);
       return s;

    }

    
   

}
