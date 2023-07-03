package com.FactoryDesignPattern;

public class FactoryClass {
	
public VTU selectBranch(String branch) {
	if(branch.equalsIgnoreCase("ME")) {
		return new Mechanical();
	}
	else if(branch.equalsIgnoreCase("AU")) {
		return new Automobile();
	}
	else if(branch.equalsIgnoreCase("CV")) {
		return new Civil();
	}
	else
		return null;
}
}
