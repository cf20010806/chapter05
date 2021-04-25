package xcdq;

public class Uncle {
    private  String name;
    private  int age;

    public  Uncle(){
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  Uncle(String name){
        this.name = name;
        this.age  = age;
    }
    public  String getName(){
        return  name;
    }
    public void  setName(String name){
        this.name = name;
    }

    public  int  getAge() {
        return age;
    }
    @Override
    public  String toString(){
        return  "Uncle{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
     public  void  faHongbao(){
        System.out.println("舅舅在发红包");
     }
    }
