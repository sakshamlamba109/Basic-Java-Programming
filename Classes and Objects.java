public class classandobject { classandobject(){ System.out.println("The program works");
}
int a,b,c;
public static void main(String[] args) {
// TODO Auto-generated method stub
classandobject obj1=new classandobject(); obj1.a=5;
obj1.b=10; obj1.c=obj1.a+obj1.b;
System.out.println("the sum is " +obj1.c);
}
}