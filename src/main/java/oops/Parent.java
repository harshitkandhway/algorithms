package oops;

import java.util.HashMap;
import java.util.Map;

public class Parent {
    public void A(){
        System.out.println("method called for Parent A");
    }
}

class Child extends Parent{
//    public void A(){
//        System.out.println("child method A");
//    }
    public void A(int i){
        System.out.println("overloded method");
    }

    public static void main(String[] args) {
//        Child ref = new Child();
//        ref.A();
//        ref.A(2);

        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1==s2);

        Map<String, String> map = new HashMap<String, String>();
        map.put(s1, "b1");
        System.out.println(map);
        map.put(s2, "b2");
        System.out.println(map);
        System.out.println(map.get("abc"));
    }
}
