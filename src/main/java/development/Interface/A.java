package development.Interface;

public interface A {
    // members we can have in interface
    //1  abstract non static method

     public void test(); // compiler will add abstract keyword implicitly

     void demo(); // compiler will add public and abstract keyword implicitly





    // can i write main method inside the interface : yes
    public static void main(String[] args) {
        System.out.println("main method");
    }

}
