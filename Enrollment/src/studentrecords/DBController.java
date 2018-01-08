package studentrecords;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBController {
    private Connection connection;
    private Statement statement;
    private PreparedStatement ps;
    private ResultSet resultSet;
    private String sql;
    
    public void dbaseConnect(String url, String user, String pass) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(url, user, pass);
    }
    
    public void createAccount(int idno, 
    		                  String lastname, 
    		                  String firstname, 
    		                  String midInitial, 
    		                  String gender, 
    		                  String contactno, 
    		                  String email) throws Exception {
    	
        sql = "insert into students "
        	+ "(idno, lastname, firstname, midInitial, gender, contactno, email) "
        	+ "values (?,?,?,?,?,?,?)";
        ps = connection.prepareStatement(sql);
        ps.setInt(1, idno);
        ps.setString(2, lastname);
        ps.setString(3, firstname);
        ps.setString(4, midInitial);
        ps.setString(5, gender);
        ps.setString(6, contactno);
        ps.setString(7, email);
        ps.executeUpdate(sql);
    }
    
    public void createSubject(String subjid,
    		                  String title,
    		                  String day,
    		                  int units) throws Exception {
    	
    	sql = "insert into subject "
    		+ "(subjid, title, day, units) "
    	    + "values (?,?,?,?)";
    	ps = connection.prepareStatement(sql);
    	ps.setString(1, subjid);
    	ps.setString(2, title);
    	ps.setString(3, day);
    	ps.setInt(4, units);
    	ps.executeUpdate(sql);
    }
    
    public void createClass(String classcode,
    		                String time,
                            String day,
                            String subjid) throws Exception {
    	sql = "insert into class "
            + "(classcode, time, day, subjid) "
    		+ "values (?,?,?,?)";
    	ps = connection.prepareStatement(sql);
    	ps.setString(1, classcode);
    	ps.setString(2, time);
    	ps.setString(3, day);
    	ps.setString(4, subjid);
    	ps.executeUpdate(sql);
    }
    
    public void createEnroll(String classcode,
    		                 int idno,
    		                 String datesubmitted,
    		                 String subjid) throws Exception {
    	
    	sql = "insert into class "
            + "(classcode, idno, datesubmitted, subjid) "
    		+ "values (?,?,?,?)";
    	ps = connection.prepareStatement(sql);
    	ps.setString(1, classcode);
    	ps.setInt(2, idno);
    	ps.setString(3, datesubmitted);
    	ps.setString(4, subjid);
    	ps.executeUpdate(sql);
    }
	
    public void close() {
        try {
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
}
