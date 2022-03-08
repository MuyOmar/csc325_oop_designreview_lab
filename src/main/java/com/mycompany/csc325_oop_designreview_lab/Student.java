
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human{
    // ToDo 1: Make this class a child of Human
    // To make it a child of human we must extend the Human class and implement all abstract methods
    // Also make for GPA and make getter and setters
    private int gpa;
    // ToDo 2: Fix the resulting errors
    // ToDo 3: Add a field for GPA and create setter and getter
    // ToDo 4: Add comments to your code
    public Student(String name, short age) {
        super(name, age);
    }
    // GPA getter
    public int getGPA() {
        return gpa;
    }
    // GPA setter
    public void setGPA(int gpa) {
        this.gpa = gpa;
    }
    @Override
    public String getAddress() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setAddress(String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}