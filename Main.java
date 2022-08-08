package com.abc.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.abc.model.AbcModel;

public class Main {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int rollno=0;
		do {
			System.out.println("Enter rollno: ");
			String rollstr = sc.nextLine();
			
			try {
				rollno =Integer.parseInt(rollstr);
				if(String.valueOf(rollno).length()!=4)
					rollno = 0;
			}
			catch(Exception e) {
				
			}
		}while(rollno == 0);
		
		String studentName="";
		boolean lowercasefound;
		do {
			System.out.println("Enter Name: ");
			studentName= sc.nextLine();
			lowercasefound = false;
			for(int i=0; i<studentName.length(); i++) {
				if(Character.isLowerCase(studentName.charAt(i))) {
					lowercasefound = true;
					break;
				}
			}
		}while(studentName.length()>20 || lowercasefound);
			
			String standard = "";
			String [] standards = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
			
			List<String> list = new ArrayList<String>(Arrays.asList(standards));
			do {
				System.out.println("Enter the standards ");
				standard = sc.nextLine();
			}while(!list.contains(standard));
		
			
			System.out.println("Enter D.o.B.: ");
			String dob = sc.nextLine();
			
			Double fees = 0.0;
			do {
				System.out.println("Enter the fees: ");
				if(sc.hasNextDouble()) {
					fees = sc.nextDouble();
				}
			}while(fees==0.0);
			
		
		AbcModel abc = new AbcModel(rollno, studentName, standard, dob, fees);
	
		
	}
}
