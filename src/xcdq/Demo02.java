package xcdq;

public class Demo02 {
    public static void main(String[] args) {
        Uncle uncle1 = new UncleOne();
        Uncle uncle2 =  new UncleTwo();
        if ( uncle1 instanceof  UncleOne){
            UncleOne u1 = (UncleOne) uncle1;
            u1.faHongbao();
        }
            if (uncle2 instanceof  UncleTwo){
            UncleTwo u2 = (UncleTwo) uncle2;
            u2.faHongbao();
        }
    }
}
