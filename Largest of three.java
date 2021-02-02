public class largest {
int a=10; int b=20; int c=17;
public static void main(String[] args)
{
// TODO Auto-generated method stub largest obj=new largest();
if(obj.a>obj.b && obj.a>obj.c)
{
System.out.println("a= "+obj.a+" is the greatest ");
}
if(obj.b>obj.a && obj.b>obj.c)
{
System.out.println("b= "+obj.b+" is the greatest ");
}
else
{
System.out.println("c= "+obj.c+" is the greatest ");
}
}
}