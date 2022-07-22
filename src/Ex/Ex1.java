package Ex;
// Method No param, No return
public class Ex1 {
    // Wage ค่าแรง total = (40*rate)+(hour-40)*(1.5f*rate)
    public static void main(String[] args) {
        Wage emp_wage = new Wage();
        emp_wage.hour = 50;
        emp_wage.rate = 100.0f;
        emp_wage.calWage();
    }
}
class Wage {
    public int hour;
    public float rate;

    //Method Wage
    public void calWage() {
        float total = (40 * rate) + (hour - 40) * (1.5f * rate);
        System.out.println("ค่าแรงรวม = " + total + "บาท");
    }
}