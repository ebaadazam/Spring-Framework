// We have defined this Car class in the model package
package com.ebaad.SpringJdbc.model;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // It means we are asking the Spring framework to handle the object creation, managing and object destroying of this class by the spring framework
@Scope("prototype")
public class Car {
	
	private int modelNo;
	private String modelName;
	
	// Setters and getters
	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	@Override
	public String toString() {
		return "Model No of the Car: " + modelName + " : " + modelNo;
	}
}

