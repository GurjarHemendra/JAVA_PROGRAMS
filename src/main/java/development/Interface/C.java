package development.Interface;

public interface C {
    // 3 : static final variable

      static  final int b=2;
      int a=10; // static and final will be added by the compiler implicitly

    public static void main(String[] args) {
        System.out.println(a);
    }
}
