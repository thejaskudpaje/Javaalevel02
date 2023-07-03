package com.FactoryDesignPattern;

import java.util.Scanner;

public class UserInterface {
public static void main(String[] args) {
	FactoryClass fc=new FactoryClass();
	System.out.println("****Welcome to VTU****\nSelect Your Branch Name\nMechanical-->ME\nAutomobile-->AU\nCivil------->CV");
	Scanner s=new Scanner(System.in);
	System.out.print("Enter here-->");
	String branch=s.next();
	VTU enterBranch = fc.selectBranch(branch);
	enterBranch.branch();
	
}
}