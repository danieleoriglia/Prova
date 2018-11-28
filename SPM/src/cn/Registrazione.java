package cn;
import cn.ConnectionDB;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registrazione
 */
@WebServlet("/Registrazione")
public class Registrazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrazione() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ConnectionDB obj_ConnectionDB = new ConnectionDB();
		Connection cn = obj_ConnectionDB.getConnection();
		
		
		
		 response.setContentType("text/html");
		  PrintWriter out = response.getWriter();
		  String username = request.getParameter("username");
		  String password = request.getParameter("password");
		  String affilation = request.getParameter("affilation");
		  String name = request.getParameter("name");
		  String surname = request.getParameter("surname");
		  String email = request.getParameter("email");
		  String date = request.getParameter("date");
		  String cryptopassword = "";
		  try {
			 cryptopassword = obj_ConnectionDB.hash(password);
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			//prova
			e1.printStackTrace();
		}
		  
		  if (username.isEmpty() || password.isEmpty() || affilation.isEmpty() || name.isEmpty() || surname.isEmpty() || email.isEmpty()| date.isEmpty()) {
			   RequestDispatcher rd = request.getRequestDispatcher("Registrazione.jsp");
			   out.println("<font color=red>Please fill all the fields</font>");
			   rd.include(request, response);
			  } else {
			   // inserting data into mysql database 
			   // create a test database and student table before running this to create table
			   //create table student(name varchar(100), userName varchar(100), pass varchar(100), addr varchar(100), age int, qual varchar(100), percent varchar(100), year varchar(100));
			  }
		  
		  
		 
		  
		  
		  try {
			   // Class.forName("com.mysql.cj.jdbc.Driver");
			    // loads mysql driver

			   // Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/spm?serverTimezone=UTC", "root", ""); 
		  
			    String query = "insert into utenti_spm(username, password, affilation, name, surname, email, date) values(?,?,?,?,?,?,?)";

			    PreparedStatement ps = cn.prepareStatement(query); // generates sql query

			    ps.setString(1, username);
			    ps.setString(2, cryptopassword);
			    ps.setString(3, affilation);
			    ps.setString(4, name);
			    ps.setString(5, surname);
			    ps.setString(6, email);
			    ps.setString(7, date);
			    

			    ps.executeUpdate(); // execute it on spm database
			    out.println("successfuly inserted");
			    ps.close();
			    cn.close();
			   } catch (Exception e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			   }
			   RequestDispatcher rd = request.getRequestDispatcher("Welcome.jsp");
			   rd.forward(request, response);
			  
		
		doGet(request, response);
	}


}
