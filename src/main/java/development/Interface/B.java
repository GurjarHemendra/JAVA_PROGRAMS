package development.Interface;

public interface B {

    // static concrete method

     static void sample()                      // compiler will add public modifier implicitly
    {
        System.out.println("sample method");
    }

    public static void main(String[] args) {

    }
}
