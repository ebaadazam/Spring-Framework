// We have created this CarRepository Class to get us connected with the database
package com.ebaad.SpringJdbc.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ebaad.SpringJdbc.model.Car;

@Repository // As it is a DAO class, it is annotated with this. DA0 Classes are responsible for communicating with the database
public class CarRepository {
	
	// We created the object of JdbcTemplate and generated its setters and getters
	private JdbcTemplate template;
	
	public JdbcTemplate getTemplate() {
		return template;
	}
	@Autowired // use this annotation to get the JdbcTemplate object by the Spring Framework
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	// Methods of CarRepository
	public void save(Car car) {
		String sql = "insert into car (modelNo, modelName) values(?,?)";
		
		// Below used update method returns you the number of rows affected so we need to store it in the int type
		int rows = template.update(sql, car.getModelNo(), car.getModelName());
		System.out.println(rows + " row(s) affected");
	}
	
	public List<Car> findAll() {
		
		String sql = "select * from car order by modelNo limit 3";
		
		// When you got all your data in the ResultSet, you would want to fetch one row at a time
		// So RowMapper will provide you one row at a time, so create an object of RowMapper
		// RowMapper is a functional interface thats why it is an anonymous class
		RowMapper<Car> mapper = new RowMapper<Car>() {

			@Override
			public Car mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Car c = new Car();
				c.setModelNo(rs.getInt("modelNo"));  // Assuming 'modelNo' is the column name
				c.setModelName(rs.getString("modelName"));  // Assuming 'modelName' is the column name
				return c;

			}
	    };
	    List<Car> cars = template.query(sql, mapper);
	    // Above 'query' returns the data from the table.
	    // Query will return you the object of List of Car class so we have to accept the value
	    // in a variable of type List
		return cars;
	}
}

