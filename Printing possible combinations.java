import java.util.Scanner;
public class combinations {
public static void main(String[] args) {
int n;
Scanner sc = new Scanner(System.in);
System.out.print("Enter the total numbers you want to enter"); n = sc.nextInt();
int arr[] = new int[n]; System.out.println("Enter the numbers:"); for(int i = 0; i < n; i++)
{
arr[i] = sc.nextInt();
}
System.out.println("Possible combinations are”);
for (int a = 0; a<3; a++)
{
for (int b = 0; b < 3; b++)
{
for (int c = 0; c< 3; c++)
{
if (a != b && b != c && c!= a) { System.out.println(arr[a] + "" + arr[b] + "" + arr[c]);
}
}
}
}
}
}