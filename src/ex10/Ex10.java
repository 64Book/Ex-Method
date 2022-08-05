package ex10;

class Bonus{
    public float myBonus;

    public Bonus() {
        this.myBonus = myBonus;
    }
    public float calBonus(float s){
        myBonus = 0.05f * s;
        return myBonus;
    }
}
public class Ex10 {
    public static void main(String[] args) {
        System.out.println("Bonus = " + new Bonus().myBonus + "bath");
        System.out.println("Bonus = " + new Bonus().calBonus(30000) + " bath");
    }
}
