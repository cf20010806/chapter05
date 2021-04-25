package xcdq;

public class Demo01 {
   public static void main(String[] args) {
        UncleOne dajiu = new UncleOne();
        dajiu.faHongbao();


         //多态
        Uncle dajiu1 = new UncleOne();
        dajiu1.faHongbao();  //大舅发红包


        //子类独有的方法在发生向下转型的时候无法在父类中使用
        // dajiu1.songYan(); //会报错   子类独有的方法在发生向上转型的时候无法在父类使用
       UncleOne  temp = (UncleOne) dajiu1;   //向下转型
       temp.songYan();  //可以调用子类独有的方法



       Uncle erjiu = new UncleTwo();
       erjiu.faHongbao();


       /*// 向下转型
       Uncle uncleTow = new uncleTwo();
       uncleTwo temp1 = (uncleTwo)  uncleTwo;
       temp.faHongbao(); */


    }
}

