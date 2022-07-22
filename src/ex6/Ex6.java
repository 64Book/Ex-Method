package ex6;

class Coins{
    int ten, five, one;
}

class ExchageCoin{
    public void findCoin(Coins c, int m){
        c.ten = m/10;
        c.five = m/5;
        c.one = m/1;
    }
}


public class Ex6 {
    public static void main(String[] args) {
        int money = 25;
        Coins coin = new Coins();
        ExchageCoin coindata = new ExchageCoin();
        coindata.findCoin(coin, money);
        System.out.println("เงิน "+ money + " บาท แลกได้"+ "เหรียญสิบ " +
                coin.ten+ " เหรียญ เหรียญห้า "+coin.five+" เหรียญ เหรียญบาท "+
                coin.one+" เหรียญ");
    }
}
