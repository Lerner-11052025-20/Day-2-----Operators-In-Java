public class AllTypesOfOperators
{
    public static void main(String args[])
    {
        int a = 5;
        int b = 10;         
        // 1) Arithmetic operator(op.)         // ++ --        // * / %         // + -        // condition ? true block of code : false block of code ;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println( ((a>b) ? true : false) );
        System.out.println( ((a>b) ? a : b) );

        // 2) Relational||Comparisonal op.
        // == != >= <= > <
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
      
        // 3). Logical op.
        // && || !
        System.out.println( a<b && a==b);
        System.out.println( a<b || a==b);
        System.out.println( !(a>b) );

        // 4). Bitwise op.
        // & | ~
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println( ~(a) );

        // 5). Assignment op.
        // = 
        // *= /= %= += -=
        System.out.println(a = b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);
        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a - b);

        // basics of type casting with out the cast operator
        System.out.println(2f/4d);
        System.out.println(2f/4);
        System.out.println(2/4);
        System.out.println(2/4.0);
        System.out.println(2D/4L);
        System.out.println(2d/4l);
        System.out.println(2/4);
        System.out.println(2/4l);
        System.out.println(2d/4L);
        System.out.println(2f/4L);
    }
}
