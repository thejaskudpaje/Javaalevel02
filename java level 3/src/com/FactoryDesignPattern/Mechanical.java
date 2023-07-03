package com.FactoryDesignPattern;

import java.util.HashMap;

public class Mechanical implements VTU {
static String branch="Royal mech";
private String name;
private double fee;


public Mechanical() {
	
}
public Mechanical(String name,double fee) {
	this.name=name;
	this.fee=fee;
}

	public void branch() {
		System.out.println("Welocome to mechanical");
		HashMap<Integer,Mechanical> std=new HashMap();
		
	    Mechanical st1=new Mechanical("thejas",12500);
	    Mechanical st2=st1.addObject("thejas",12500);
//		Mechanical st2=new Mechanical("madhuraj",124000);
//		Mechanical st3=new Mechanical("shrijan",19500);
		
		std.put(101, st1);
		std.put(102, st2);
		//std.put(103, st3);
		
		for(Integer i:std.keySet()) {
			System.out.println(i+" "+std.get(i));
		}
		
	}
	public String toString() {
		return name+"  "+fee;
	}

	public Mechanical addObject(String name, double fee) {
		if (this.name==name && this.fee==fee) {
			return null;
		}
		else
			return new Mechanical(name, fee);
		
	}
}
