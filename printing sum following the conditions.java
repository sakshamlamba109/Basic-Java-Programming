public class divisibleby5 {
public static void main(String[] args) {
// TODO Auto-generated method stub
int i, a=0;
for(i=41;i<250;i++)
{if((i % 5)==0)
{a=a+i;
}
}
System.out.println("The sum of integers >40 and <250 but divisible by 5 is "+a);
}
}