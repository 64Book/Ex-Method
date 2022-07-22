package ex9;

class Tax{
    public static float calVat(float m){
        return  0.07f*m;
    }
    public static  float calFuel(float f){
        return 0.03f*f;
    }
}

public class Ex9 {
    public static void main(String[] args) {
        float money = 5000;
        float total_vat = Tax.calVat(money);
        float total_Fuel = Tax.calFuel(money);
        System.out.println("สินค้าราคา "+ money + " บาท คิดภาษีมูลค่าเพิ่ม 7% เป็นเงิน "
        + total_vat + " บาท \nคิดภาษีน้ำมัน 3% เป้นเงิน "+ total_Fuel+" บาท");
        System.out.println("เหลือสุทธิ เป็นเงิน "+ (money - (total_vat+total_Fuel)));
    }
}
