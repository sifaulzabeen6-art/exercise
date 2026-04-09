/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagement;

/**
 *
 * @author user
 */
public class Employe {
    private  int Empid;
    private String EmpName;
    private String Designation;
    private int salary;

    public int getEmpid() {
        return Empid;
    }

    public void setEmpid(int Empid) {
        this.Empid = Empid;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if(salary>=0){
        this.salary = salary;
        }
        else
        {
            System.out.println("Salary should not be negative");
        }
    }
    public void DispalyEmployeeDetails()
    {
                System.out.println("EMPLOYEE ID"+Empid);
                System.out.println("EMPLOYEE NAME"+EmpName);
                System.out.println("DESIGNATION"+Designation);
                System.out.println("SALARY"+salary);
            }
    
}
