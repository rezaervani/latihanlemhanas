package id.go.lemhannas.latihandatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class KoneksiDatabase {
	Connection conn = null;
	   Statement stmt = null;
	ResultSet rsst = null;
	  String sqlquery;
	int id;
	
	public KoneksiDatabase(String a, String b) {
	// final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	final String DB_URL = "jdbc:mysql://localhost/namadatabase";

	   //  Database credentials
	   final String USER = "root";
	   final String PASS = "Komlek123";
	   
	   
	   
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);
	      System.out.println("Koneksi Sukses");
	      
	      stmt = conn.createStatement();
	    
	      sqlquery = "SELECT * FROM data";
	      
	      
	      String datanamabaru = a;
	      String dataalamatbaru = b;
	      
	      // Contoh INSERT data ke database
	      String insertquery;
	      insertquery = "INSERT INTO data (nama, alamat) VALUES (\"" +  datanamabaru + "\" , \"" + dataalamatbaru + "\")";
	      stmt.executeUpdate(insertquery);
	      System.out.println("Penambahan Data Sukses");
	      
	      
	      
	    } catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		      System.out.println("Koneksi Gagal");
	   }
	}
	   
	   public int munculkan() {
		   rsst = stmt.executeQuery(sqlquery);
	      while (rsst.next()) {
	    	  id = rsst.getInt(1);
	    	  String nama = rsst.getString(2);
	          String alamat = rsst.getString(3);
	    	  
	    	  
	    	  
	    	//  System.out.println("No :" + id);
	    	 // System.out.println("Nama :" + nama);
	    	 // System.out.println("Alamat :" + alamat);
	    	  
	      //}
	      
	      }
		return id;
	  
		   }
	   }
	   


	   
