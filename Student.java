package student;

import java.util.Scanner;

public class Student 
{   
    public static void main(String[] args) 
    {
        StudentInformation stud = new StudentInformation();
        
        Scanner num = new Scanner (System.in);
        
        System.out.print("Full Name: ");
        String Fname = num.nextLine();
        stud.getFname(Fname);
        
        System.out.print("Middle Name: ");
        String Mname = num.nextLine();
        stud.getMname(Mname);
        
        System.out.print("Last Name: ");
        String Lname = num.nextLine();
        stud.getLname(Lname);
        
        System.out.print("Birth of Date: ");
        String bDate = num.nextLine();
        stud.getBDate(bDate);
        
        System.out.print("Address: ");
        String add = num.nextLine();
        stud.getAddress(add);
        
        System.out.print("Gender: ");
        String gen = num.nextLine();
        stud.getGender(gen);
        
        System.out.print("Course: ");
        String course = num.nextLine();
        stud.getCourse(course);
        
        System.out.print("Major: ");
        String major = num.nextLine();
        stud.getMajor(major);
        
        System.out.print("Student Email: ");
        String studemail = num.nextLine();
        stud.getStudentEmail(studemail);
        
        System.out.print("Student No: ");
        int studnum = num.nextInt();
        stud.getStudentNo(0);
        
        System.out.print("Age: ");
        int dob = num.nextInt();
        stud.getDateofBirth(0);
        
        System.out.print("Year: ");
        int year = num.nextInt();
        stud.getYear(0);
        
        System.out.print("GWA: ");
        int gwa = num.nextInt();
        stud.getGWA(0);
        
        System.out.print("Allowance: ");
        int allowance = num.nextInt();
        stud.getAllowance(0);
        
        System.out.print("Height: ");
        int height = num.nextInt();
        stud.getHeight(0);
        
        System.out.print("Weight: ");
        int weight = num.nextInt();
        stud.getWeight(0);    
    }
}
