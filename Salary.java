package com.delottie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Salary
 */
@WebServlet("/Salary")
public class Salary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Salary() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		String nam=request.getParameter("name");
		double s=Double.parseDouble(request.getParameter("sal"));
		String grade=request.getParameter("gra");
		double bonus = 0;
		if(s>100000&&grade== "A")
		{
		
		bonus=s*0.5;
		}
		else if(s<100000&&s>50000&&grade=="B")
		{
			
			bonus=s*0.7;
		}
		else if(s<50000&&grade=="C")
		{
			bonus=s*0.2;
		}
		double tax=s*0.25;
		double net=s+bonus-tax;
		String str1="<table border=1>"+"<tr><th>Name</th>"+"<th>Salary</th>"+"<th>Bonus</th>"+"<th>Tax</th>"+"<th>Net Salary</th>"+"</tr>";
		String str2="<tr>"+"<td>"+nam+"</th>"+"<th>"+s+"</th>"+"<th>"+bonus+"</th>"+"<th>"+tax+"</th>"+"<th>"+net+"</th>";
		pw.println(str1+str2);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
