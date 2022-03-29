
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UsersServerlet
 */
@WebServlet("/UsersServerlet")
public class UsersServerlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UsersServerlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void connect_func() throws SQLException{
    	 if (connect == null || connect.isClosed()) {
             try {
                 Class.forName("com.mysql.jdbc.Driver");
             } catch (ClassNotFoundException e) {
                 throw new SQLException(e);
             }
             connect = (Connection) DriverManager
   			      .getConnection("jdbc:mysql://127.0.0.1:3306/testdb?"
   			          + "useSSL=false&user=john&password=john1234");
             System.out.println(connect);
         }
    }
    	 
    	 //ADD NEW USER
    	 
    	 public boolean insert(Users user) throws SQLException{
    		 connect_func(); 
    		 String sql = "insert into  student(userid, password, fname,lname,birthday,streetnum,street,city,state,zip) values (?, ?, ?,?,?,?,?,?,?,?)";
    		 preparedStatement = (PreparedStatement) connect.prepareStatement(sql);
    		preparedStatement.setString(1, user.userid);
    		preparedStatement.setString(2, user.password);
    		preparedStatement.setString(3, user.fname);
    		preparedStatement.setString(4, user.lname);
    		preparedStatement.setInt(5, user.birthday);
    		preparedStatement.setInt(6, user.streetnum);
    		preparedStatement.setString(7, user.street);
    		preparedStatement.setString(8, user.city);
    		preparedStatement.setString(9, user.state);
    		preparedStatement.setInt(8, user.zip);
//    		preparedStatement.executeUpdate();
    		
    		boolean rowInserted = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
//            disconnect();
            return rowInserted;
    		
    	 }
    	
    }
    
    