package ex7;

//instance method
class Bonus{
    public float calBonus(float s){
        return 0.05f*s;
    }
}
public class Ex7 {
    public static void main(String[] args) {
        System.out.println("Bonus = " + new Bonus().calBonus(5000)+" บาท");
    }
}
