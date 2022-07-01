package mulesoft;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Main {
public static void main(String [] args) {
	createtable.createNewTable();
        insert(" Minnale ","  R Madhavan  "," Reema Sen    ", 2001 ,"Gautham Vasudev Menon");
        insert("  Vaaranam Aayiram   ","Suriya","Sameera Reddy            ",2008,"Gautham Vasudev Menon");
        insert("Vinnaithaandi Varuvaayaa "," Silambarasan T R ","Trisha ",2010,"Gautham Vasudev Menon");
        insert("Vinnaithaandi Varuvaayaa "," Silambarasan T R ","Trisha ",2010,"Gautham Vasudev Menon");
        insert("K.G.F: Chapter 1 "," Yash ","Srinidi Shetty ",2018,"Prashanth Neel");
        insert("K.G.F: Chapter 2 "," Yash ","Srinidi Shetty ",2022,"Prashanth Neel");
        
    
	select.selectAll();
	select.selectactormovie();
}
private static void insert(String moviename,String leadactor,String actress,Integer yearofrelease,String director) {
	Connection con=Dbconnection.connect();
	PreparedStatement ps=null;
	try {
		String sql="INSERT INTO movies(moviename,leadactor,actress,yearofrelease,director) VALUES(?,?,?,?,?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, moviename);
		ps.setString(2, leadactor);
		ps.setString(3, actress);
		ps.setInt(4,yearofrelease);
		ps.setString(5, director);
		ps.execute();
		System.out.println("Data has been inserted");
	}catch(SQLException e) {
		System.out.println(e.toString());
	}
}
}
