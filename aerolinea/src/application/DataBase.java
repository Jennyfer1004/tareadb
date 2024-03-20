package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

public class DataBase {
	private String conection;
	
	public DataBase() {
		this.conection = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	}
	
	public LinkedList<String> getAdminInfo(String codigo) throws SQLException{
		LinkedList<String> data= new LinkedList<String>();
		Connection cn =  DriverManager.getConnection(this.conection, "admin", "admin");
		
		Statement st = cn.createStatement();
		ResultSet res = st.executeQuery("select * from CATEGORIA where codigo=" + codigo);
		while(res.next()) {
			data.add(res.getString(1));
			data.add(res.getString(2));
			data.add(res.getString(3));
		}
		return data;
	}

}
