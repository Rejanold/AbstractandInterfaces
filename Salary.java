/**
 * Author Robert Hable
 * Co-Authors, Blake Furlano, Mason Waters, Dr. Amthauer(Driver)
 * 15Sep2019
 * CS245
 * HW 0
 */
import java.util.*;
/**
 * Salary class for salary employees that implements the Employee interface.
 */
public class Salary implements Employee{
    public Salary(String name){
       // super();
        this.name = name;
        type = "Salary";
    }

    /**
     * Method to set the employee type as Salary
     * @param type Salary type
     */
    public void setType(String type){
        this.type = type;
    }

    private double salary = 0;
    private double weeklyPay = 0;
    private String name = "";
    private String type = "";

    /**
     * A method to get the salary of the employee.
     */
    public void readEmployeeData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the yearly salary of employee: ");
        salary = input.nextDouble();
    }

    /**
     * Method to calculate the weekly pay
     * @return the calculated weekly salary
     */
    public double calculateWeeklyPay() {
        double weeklyPay = salary / 52.0;
        return weeklyPay;
    }

    /**
     * Method to get the employees name
     * @return returns the employees name
     */
    public String getName() {
        return name;
    }

    /**
     * method to get the employees type.
     * @return the employees type
     */
    public String getType() {
        return type;
    }

    /**
     * To String method to print out the required information.
     * @return the string with pertinent info.
     */
    public String toString(){
        return "Name: " + name + "\nType: " + type + "\nYearly Salary: " + salary;
    }
}