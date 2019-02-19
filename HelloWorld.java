public class HelloWorld{
    public static void main(String[] args) {
        int x = 3;
        if(x == 4)
        {
            System.out.println("Hello World!");
            method1();
        }        
        method2();
    }

    public static void method1()
    {
        System.out.println("Blah!");
    }
    
    private static void method2()
    {
        System.out.println("Blah Blah!!");
    }
}