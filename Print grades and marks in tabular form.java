import java.util.Scanner;
public class students {
public static void main(String[] args) {
// TODO Auto-generated method stub
int i, array[]= new int[10]; Scanner sc=new Scanner(System.in); System.out.println("Enter the marks of ten students");
for(i=0;i<10;i++)
{array[i]=sc.nextInt();}
bubble(array);
System.out.println("Marks in ascending order is ");
for(i=0;i<10;i++)
{System.out.print(array[i]+ " ");} System.out.println(" ");
for( i=0;i<10;i++)
{if(array[i]>=40 && array[i]<=50)
{System.out.println(+array[i]+ " : PASS");}
if(array[i]>=51 &&array[i]<=75)
{System.out.println(+array[i]+ " : MERIT");}
if(array[i]>75)
{System.out.println(+array[i]+ " : DISTINCTION");}
}
}
static void bubble(int[] array)
{
int initial = 0, i;
for( i =0; i < 10; i++){ for(int j=1; j <=9; j++){ if(array[j-1] > array[j]){ initial = array[j-1]; array[j-1] = array[j]; array[j] = initial;
}
}
}
}
}