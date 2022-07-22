package ex8;

//static method
class Bonus{
    public static float calBonus(float s){
        return 0.05f*s;
    }
}

public class Ex8 {
    public static void main(String[] args) {
        float bonusAll = Bonus.calBonus(4000);
        System.out.println("Bonus = " + bonusAll +" บาท");
    }

}
