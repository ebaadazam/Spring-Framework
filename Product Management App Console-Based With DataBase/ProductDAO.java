package com.productapp.Product_Management_AppDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// This ProductDAO Class is responsible to deal with the database. The actual logic of adding, removing
// searching for a product from the database will be here
public class ProductDAO {
	
	// Creating a Connection Object
	Connection con=null;
	
	// Constructor
	ProductDAO() {
		String url = "jdbc:mysql://localhost:3306/ebaad";
		String name = "root";
		String pass = "ebaad";
		
		try {
			con = DriverManager.getConnection(url, name, pass);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// Method to save the products to the database
	public void save(Product p) {
		String query = "Insert into Product(name, type, warranty, regularItem) values(?,?,?,?)";
		try {
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, p.getName());
			st.setString(2, p.getType());
			st.setInt(3, p.getWarranty());
			st.execute();
			System.out.println("Product Added");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	// Method to fetch the data/products from the database
	public List<Product> show() {
		List<Product> products = new ArrayList<>();
		
		String query = "Select * from Product";
		try {
			PreparedStatement st = con.prepareStatement(query);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				Product p = new Product(query, query, 0);
				p.setName(rs.getString(1));
				p.setType(rs.getString(2));
				p.setWarranty(rs.getInt(3));
				products.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return products;
	}
	
	
	// Method to fetch a particular product from the database
	public Product showOne(String name) {
		String query = "Select * from Product where name = ?";
		Product p = null;
		try {
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, name);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				p = new Product(query, query, 0);
				p.setName(rs.getString(1));
				p.setType(rs.getString(2));
				p.setWarranty(rs.getInt(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
	// Method to delete a particular product record from the database
	public Product delete(String name) {
		String query = "Delete from Product where name=?";
		Product p =null;
		try {
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, name);
			int count = st.executeUpdate(); // executeUpdate returns the number of rows affected
			System.out.println(count + " row(s) deleted.");		
		 } 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
