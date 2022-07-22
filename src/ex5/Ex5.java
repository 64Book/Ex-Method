package ex5;

class Wage {
    //Method Wage
    public double calWage(float hour, double rate){
       return (40 * rate) + (hour - 40) * (1.5f * rate);
    }
}

public class Ex5 {
    public static void main(String[] args) {
        Wage emp_wage = new Wage();
        int hr = 50; float rate = 600.0f;
        double total = emp_wage.calWage(hr, rate);
        System.out.println("ค่าแรงรวม = " + total + "บาท");
    }

}
