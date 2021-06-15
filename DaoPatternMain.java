package com.logic;

import java.util.Scanner;

public class DaoPatternMain {
	
	private static Scanner sc = new Scanner(System.in);

    public static int menu() {
        int ch = 0;
        do {
        	System.out.println("\n\n------------------------------------------");
        	System.out.println("|         Student Interaction Menu           |");
        	System.out.println("|--------------------------------------------|");
        	System.out.println("|                                            |");
        	System.out.println("|         Select number and press <Enter>    |");
        	System.out.println("|              to perform an operation       |");
        	System.out.println("|--------------------------------------------|");
        	System.out.println("|                                            |");
            System.out.println("| 1.) Print list of all students             |");
            System.out.println("| 2.) update students                        |");
            System.out.println("| 3.) Display specific find employee         |");
            System.out.println("|--------------------------------------------|");
            System.out.println("|   Enter your choice :                      |");
            System.out.println("|____________________________________________|");
            
            ch = sc.nextInt();
            sc.nextLine();

            if (ch < 0 || ch > 5) {
                System.out.println("Invalid choice...please re enter ! ");
            }

        } 
        while (ch < 0 || ch > 5);
        return ch;
    }


	public static void main(String[] args) {
		
		int ch = 0;
        String id = "";
        
        do {
        	
        	StudentDaoImpl studentDao = new StudentDaoImpl();
        	ch = menu();
        	switch(ch) {
        	
        	case 1 :
        		for (Student student : studentDao.getAllStudents()) {
       	         System.out.println("Student: [RollNum : " + student.getRollNum() + ", Name : " + student.getName() + " ]");
        		}
       	         break;
       	    case 2:
       	    	Student student =studentDao.getAllStudents().get(0);
       	    	student.setName("Michael");
       	    	studentDao.updateStudent(student);
       	    	break;
       	    case 3:
       	    	studentDao.getStudent(0);
       	    	System.out.println("Student: [RollNo : " + student.getRollNum() + ", Name : " + student.getName() + " ]");
       	    	break;
       	   }
        }while (ch != 0);
        
	}
        
          
        
        
}
