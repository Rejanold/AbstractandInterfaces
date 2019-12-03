import java.text.NumberFormat;
import java.util.Scanner;

public class Payroll {
    /** The main program will perform the following steps repeatedly
     * 1. Ask for what type the employee is (hourly or salary)
     * 2. It will ask for characteristics of the employee
     * 3. It will compute the weekly pay for the employee
     * @param args the command line arguments -- not used
     *
     */

    public static void main(String args[]){
        Employee theEmployee;
        double pay;
        theEmployee = getEmployee();				//get the Employee type
        theEmployee.readEmployeeData();				//get specific attributes
        pay = theEmployee.calculateWeeklyPay();		//calculate the weekly pay
        reportPay(theEmployee, pay);				//report the results
        //exit
    }

    /** Query the user for Employee information and return the appropriate type
     *
     * @return the type of employee
     */
    public static Employee getEmployee(){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter the name of the Employee: ");
        String employName = in.nextLine(); //allows for full name - accepts spaces
        System.out.print("Enter the type of Employee (H for Hourly S for Salary): ");
        String employeeType = in.next();

        if(employeeType.equalsIgnoreCase("h")){
            return new Hourly(employName);
        }
        else if(employeeType.equalsIgnoreCase("s")){
            return new Salary(employName);
        }
        else{
            System.out.println("Invalid choice, program ending.");
            System.exit(0);
            return null;
        }

    }

    /** Display the information of the employee
     * @param employ - the Employee
     * @param pay - the pay to display
     */
    private static void reportPay(Employee employ, double pay){
        System.out.println(employ);
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String money = formatter.format(pay);
        System.out.println("The weekly pay "+ money);
    }

}
