package id.go.lemhannas.latihandatabase;

import java.sql.SQLException;

public class Munculkan {

	   public static int id;
	   public static String nama;
	   public static String alamat;
	   
	   public Munculkan() {
	   
	   try {
	   KoneksiDatabase.rsst = KoneksiDatabase.stmt.executeQuery(KoneksiDatabase.sqlquery);
	   
	   KoneksiDatabase.rsst.next();
	   id = KoneksiDatabase.rsst.getInt(1);
	   nama = KoneksiDatabase.rsst.getString(2);
	   alamat = KoneksiDatabase.rsst.getString(3);
		   
		   
 	  	    	  	    	  
 	//  System.out.println("No :" + id);
 	// System.out.println("Nama :" + nama);
 	// System.out.println("Alamat :" + alamat);
 	  
   // }
   
   //}
	
	   } catch (SQLException sqle) {
		   
	   }
 }
}