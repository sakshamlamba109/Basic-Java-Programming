public class fibonacci {
public static void main(String[] args) {
// TODO Auto-generated method stub
int a=0,b=1,i;
System.out.println("The fibonacci series is ");
for(i=0;i<18;i++)
{int c; System.out.print(a+ " "); c=a+b;
a=b; b=c;
}
}
}