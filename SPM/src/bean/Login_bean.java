package bean;
import java.security.NoSuchAlgorithmException;

import cn.ConnectionDB;
public class Login_bean {
	
	private String username;
	private String password;

	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		/* try {
			 ConnectionDB obj_ConnectionDB = new ConnectionDB();
			this.password = obj_ConnectionDB.hash(password);
		} catch (NoSuchAlgorithmException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
		
	}
	
	 

}
