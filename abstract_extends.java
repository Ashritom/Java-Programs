abstract class Parent {
    abstract void m1();
    void m2(){
        System.out.println("HELLO World");
    }
}

class Child extends Parent {
    void m1(){
        System.out.println("This is JAVA");
    }
    public static void main(String[] args){
        Child obj = new Child();
        obj.m1();
        obj.m2();
    }
}
