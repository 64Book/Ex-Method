package ex13;
// this (keyword)
class Employee {
    String emp_id;
    double emp_salary;

    public Employee(){
        emp_id = "F001";
    }

    public Employee(String s){
        emp_id = s;
    }
    public Employee(double d){
        this("F002");
        emp_salary = d;
    }
}
public class Ex13 {
    public static void main(String[] args) {
        double data = 30000;
        Employee emp = new Employee(data);
        System.out.println("=========This Test=========");
        System.out.println("Employee ID = " + emp.emp_id);
        System.out.println("Salary = " + emp.emp_salary);
        System.out.println("===========================");
    }
}
