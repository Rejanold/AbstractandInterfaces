/**
 * Author Robert Hable
 * Co-Authors, Blake Furlano, Mason Waters, Dr. Amthauer(Driver)
 * 15Sep2019
 * CS245
 * HW 0
 */
import java.util.*;
/**
 *My class for hourly employees that implements the employee interface.
 */
public class Hourly implements Employee {
    public Hourly(String name){
        this.employName = name;
        employType = "Hourly";
    }
    /**
     *Sets the type of Employ
     */
    public void type(String type){
        this.employType = type;
    }

    private double wage = 0;
    private double hoursWorked = 0;
    private double weeklyPay = 0;
    public String employName;
    public String employType;


    /**
     * Simple method to compute the weekly pay of the employee with or without overtime
     */
    public double calculateWeeklyPay() {
        if(hoursWorked <= 40){
            weeklyPay = hoursWorked * wage;
        }
        else{
            double overTime = wage * 1.5;
            weeklyPay = wage * 40 + overTime * (hoursWorked-40);
        }
        return weeklyPay;
    }
    /**
     * Prompts the user for the hourly wage and number of hours worked so we can
     * calculate the weekly pay.
     */
    public void readEmployeeData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the hourly wage of employee: ");
        wage = input.nextDouble();
        System.out.print("Enter the number of hours worked: ");
        hoursWorked = input.nextDouble();
    }
    /**
     * Gets the employees name
     */
    public String getName() {
        return employName;
    }
    /**
     * Gets the Employees Type
     */
    public String getType() {
        return employType;
    }
    /**
     * To string method for printing out Name type hours worked.
     */
    public String toString(){
        return "Name: " + employName + "\nType: " + employType + "\nWage: " + wage + "\nHours worked this week: " + hoursWorked;
    }
}
