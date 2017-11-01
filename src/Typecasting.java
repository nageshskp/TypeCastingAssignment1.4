import java.util.Scanner;
public class Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   byte b;
   short s;
   int i;
   long l;
   float f;
   double d;
   
   Scanner in=new Scanner(System.in);
   System.out.println("Enter value for byte:");
   b=in.nextByte();
   System.out.println("Enter value for short:");
   s=in.nextShort();
   i= b + s;
   System.out.println("Value of integer:"+ i);
   l= s+i;
   System.out.println("Value of long:"+ l);
   f= i+l;
   System.out.println("Value of float:"+ f);
   d= l+f;
   System.out.println("Value of double:"+ d);
		
		
		
	}

}
