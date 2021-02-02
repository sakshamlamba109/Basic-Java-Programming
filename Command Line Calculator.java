public class commandlinecalculator {
public static void main(String[] args) {
// TODO Auto-generated method stub
int a,b;
a= Integer.parseInt(args[0]); b= Integer.parseInt(args[2]); char c= args[1].charAt(0); switch(c)
{
case '+':
System.out.println(a+b);
break; case '-':
System.out.println(a-b);
break; case '/':
System.out.println(a/b);
break; case 'm':
System.out.println(a*b);
break; default:
System.out.println("sorry wrong input");
}
}
}