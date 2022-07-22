package Ex2;

class Wage {
    //Method Wage
    public void calWage(int hour, float rate){
        float total = (40 * rate) + (hour - 40) * (1.5f * rate);
        System.out.println("ค่าแรงรวม = " + total + "บาท");
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Wage emp_wage = new Wage();
        emp_wage.calWage(50,200.0f);
    }
}
