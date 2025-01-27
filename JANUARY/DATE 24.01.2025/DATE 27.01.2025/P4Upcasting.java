public class P4Upcasting {
    public static void main(String[] args) {
          Demo_ d = new Demo_1();//Upcasting
          d.name = "Parent";
          System.out.println(d.name);
          d.method();
        //   Demo_1 d1 = (Demo_1)d;
        //   d1.method(); 
    }
    
}
class Demo_{
    String name;
    void method(){
        System.out.println("Demo");
    }
}

class Demo_1 extends Demo_{
    void method(){
        System.out.println("Demo1");
    }
}
