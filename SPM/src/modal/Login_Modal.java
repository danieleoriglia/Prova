package modal;
import bean.Login_bean;
import cn.ConnectionDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class Login_Modal {
		
			public boolean check_user_name(Login_bean obj_Login_bean) {
				
					boolean flag = false;
					
					ConnectionDB obj_ConnectionDB = new ConnectionDB();
					Connection cn = obj_ConnectionDB.getConnection();
					
					PreparedStatement ps = null;
					ResultSet rs = null;
					
					try {
						//Class.forName("com.mysql.cj.jdbc.Driver");
						 // loads driver
						//Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/spm?serverTimezone=UTC", "root", ""); 
							String query = "select* from utenti_spm where username=? and password=?";
							
							ps=cn.prepareStatement(query);
							ps.setString(1, obj_Login_bean.getUsername());
							ps.setString(2, obj_ConnectionDB.hash(obj_Login_bean.getPassword()));
							rs=ps.executeQuery();
							
							
							
							if(rs.next()) {
								flag = true;
								
							}
						
					}catch(Exception e){
						
					}finally {
						try {
							if(cn!=null) {
								cn.close();
							}
						}catch(Exception e2){
							
						}
					}					
					
					return flag;
					
			}
}
