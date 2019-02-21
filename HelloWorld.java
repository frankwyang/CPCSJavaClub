public class HelloWorld{
    public static void main(String[] args) 
    {
        int x = 5;
        System.out.println("x = " + x);
        method6(x);
        System.out.println("x = " + x);
        
        if(x == 4)
        {
            System.out.println("Hello World!");
            method1();
        }        
        method2();
        SlaveHello.method3();

        SlaveHello slave3 = new SlaveHello();
        slave3.method3();
        
        SlaveHello slave4 = new SlaveHello();
        slave4.method4();

        SlaveHello.method3();

        slave4.method3();

    }

    public static void method6(int x)
    {
        System.out.println("method6.x = " + x);
        x = x + 1;
        System.out.println("method6.x = " + x);
        x = x + 1;
        System.out.println("method6.x = " + x);
        x = x + 1;
        System.out.println("method6.x = " + x);
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