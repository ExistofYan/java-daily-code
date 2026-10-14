package MidTerm27710;//package MidTerm27710;
//
//class Parent {
//    static int x = print("Parent static");
//    int y = print("Parent instance");
//    Parent() { System.out.println("Parent constructor"); show(); }
//    static int print(String s) { System.out.println(s); return 1; }
//    void show() { System.out.println("Parent show " + y);  }
//    void print1(Object o){
//        System.out.println("parent");
//    }
//}
//
//class Child extends Parent {
//    static int x = print("Child static");
//    int y = print("Child instance");
//    Child() { System.out.println("Child constructor"); }
//    @Override
//    void show() { System.out.println("Child show " + y); }
//    void print1(String s){
//        System.out.println("child");
//    }
//}
//
//public class test2 {
//    public static void main(String[] args) {
//        MidTerm27710.Parent parent =new Child();
//        System.out.println("============overloading=============");
//        parent.print1("yantong");
//    }
//}

class Parent {

    int x = print("Parent field");

    Parent() {
        print("Parent constructor");
        show();
    }

    void show() {
        System.out.println("Parent show: " + x);
    }

    static int print(String s) {
        System.out.println(s);
        return 0;
    }
}

class Child extends Parent {

    int x = print("Child field");

    Child() {
        print("Child constructor");
    }

    @Override
    void show() {
        System.out.println("Child show: " + x);
    }
}

public class test2 {
    public static void main(String[] args) {
        new Child();
    }
}