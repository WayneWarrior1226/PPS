import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.IOException;

public class UserDAO{
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/pps";
	private String jdbcUsername = "root";
	private String jdbcPassword = "pass1234";
	private PreparedStatement preparedStatement = null;
	
	public static final String INSERT_USERS_SQL =  "INSERT INTO users" + "(email, password, fname,lname,birthday,streetnum,street,city,state,zip, dollaramount,ppsamount) VALUES"
				+ "(?, ?,?,?, ?,?,?,?,?,?,?,?);";
		
	//GET CONNECTION
	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}catch(SQLException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	//Add new user
	public void insertUser(Users users) throws SQLException {
		try(Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)){
			preparedStatement.setString(1, users.getEmail());
			preparedStatement.setString(2, users.getPassword());
			preparedStatement.setString(3, users.getFname());
			preparedStatement.setString(4, users.getLname());
			preparedStatement.setString(5, users.getBirthday());
			preparedStatement.setString(6, users.getStreetnum());
			preparedStatement.setString(7, users.getStreet());
			preparedStatement.setString(8, users.getCity());
			preparedStatement.setString(9, users.getState());
			preparedStatement.setString(10, users.getZip());
			preparedStatement.setString(11, users.getDollaramount());
			preparedStatement.setString(12, users.getPpsamount());
			preparedStatement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	}  




