package ex14;

class Employee{
    String emp_id;  double emp_salary;
    public Employee(){
        emp_id = "F001";
    }
    public Employee(String s){
        emp_id = s;
    }
}
class EmployeeSalary extends Employee{
    public EmployeeSalary(double s){
        super("F003");
        emp_salary = s;
    }
}

public class Ex14 {
    public static void main(String[] args) {
        double data = 30000;
        Employee emp = new EmployeeSalary(data);
        System.out.println("=========This Test=========");
        System.out.println("Employee ID = " + emp.emp_id);
        System.out.println("Salary = " + emp.emp_salary);
        System.out.println("===========================");
    }
}
