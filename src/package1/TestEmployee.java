/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

/**
 *
 * @author Vicent Ng
 */
public class TestEmployee {

    public static void main(String [] args)
    {
        
        Employee emp1 = new Employee("Vince", 4321.00);
        Employee emp2 = new Employee("CheeChuen");
        emp2.setSalary(5600.00);
                
        //Part B
        System.out.println("Salary : " + emp1.getSalary());
        
        emp1.raiseSalary(8.0);
      
        System.out.println("Salary : " + emp1.getSalary());
        
        //Part C
        if(emp1.getSalary() > emp2.getSalary())
        {
            System.out.println(emp1.getName() + " " +emp1.getSalary());
        }
        else
        {
            System.out.println(emp2.getName() + " " + emp2.getSalary());
        }
        
        System.out.printf("%.2f + %.2f = %.2f",emp1.getSalary(),emp2.getSalary(),emp1.getSalary()+emp2.getSalary());
    }
    
}
