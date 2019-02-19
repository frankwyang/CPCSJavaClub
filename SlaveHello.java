public class SlaveHello
{
    public static int numObj = 0;

    public SlaveHello()
    {
        numObj ++;
    }

    public static void method3()
    {
        System.out.println("SlaveHello method3 saying 'hello'");
        System.out.println("numObj = " + numObj);
    }

    public void method4()
    {
        System.out.println("SlaveHello method4 'hello'");
        System.out.println("numObj = " + numObj);
    }
}