package jdbc;
import java.sql.*;
public class StudentDAOIMpl implements StudentDAO{
	
	Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    private String user;
	private String password;
	private String url;
    public StudentDAOIMpl() {
    	this.user = "scott";
		this.password = "Tiger";
		this.url="jdbc:oracle:thin:@localhost:1521:orcl";
	}
    
    public Connection getConnection() throws SQLException {
 
    	try{
    		Class.forName("oracle.jdbc.OracleDriver");
    		conn = DriverManager.getConnection(url,user,password);	
    	}catch(Exception e){
    		e.printStackTrace();
    	}
        
        return conn;
}
    
	@Override
	public void add(StudentDTO st) {
		try {
            String queryString = "INSERT INTO students_info(RollNo, Name, Course, Address) VALUES(?,?,?,?)";
            conn = getConnection();
            ps =conn.prepareStatement(queryString);
            ps.setInt(1, st.getRollNo());
            ps.setString(2, st.getName());
            ps.setString(3, st.getCourse());
            ps.setString(4, st.getAddress());
            ps.executeUpdate();
    } catch (SQLException e) {
            e.printStackTrace();
    } finally {
            try {
                    if (ps != null)
                            ps.close();
                    if (conn != null)
                            conn.close();
            } catch (SQLException e) {
                    e.printStackTrace();
            } catch (Exception e) {
                    e.printStackTrace();
            }

    }
		
	}
	@Override
	public void update(StudentDTO st) {
		try {
            String queryString = "UPDATE students_info SET Name=? WHERE RollNo=?";
            conn = getConnection();
            ps = conn.prepareStatement(queryString);
            ps.setString(1, st.getName());
            ps.setInt(2, st.getRollNo());
            ps.executeUpdate();
            System.out.println("Table Updated Successfully");
    } catch (SQLException e) {
            e.printStackTrace();
    } finally {
            try {
                    if (ps != null)
                            ps.close();
                    if (conn != null)
                            conn.close();
            }

            catch (SQLException e) {
                    e.printStackTrace();
            } catch (Exception e) {
                    e.printStackTrace();

            }
    }
		
	}
	@Override
	public void findStudentInfo() {
		try {
            String queryString = "SELECT * FROM students_info";
            conn = getConnection();
            ps = conn.prepareStatement(queryString);
            rs = ps.executeQuery();
            while (rs.next()) {
                    System.out.println("Roll No " + rs.getInt(1)
                                    + ", Name " + rs.getString(2) + ", Course "
                                    + rs.getString(3) + ", Address "
                                    + rs.getString(4));
            }
    } catch (SQLException e) {
            e.printStackTrace();
    } finally {
            try {
                    if (rs != null)
                            rs.close();
                    if (ps != null)
                            ps.close();
                    if (conn != null)
                            conn.close();
            } catch (SQLException e) {
                    e.printStackTrace();
            } catch (Exception e) {
                    e.printStackTrace();
            }

    }
}
		
	

}
