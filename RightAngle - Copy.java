import java.util.Scanner;

class RightAngle{
public static void main(String []a){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number of row");
int row=sc.nextint();
for(int i=1; i<=row; i++){
for(int j=1; j<=row; j++){
System.out.print(" ");
}
System.out.println();
}
}
}


