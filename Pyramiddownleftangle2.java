import java.util.Scanner;
class Pyramiddownleftangle2{
public static void main(String []a){
Scanner s = new Scanner(System.in);
System.out.println("Enter the number of rows");
byte row = s.nextByte();
int number=1;
for(int i=1; i<=row; i++){
for(int j=1; j<=row; j++){
if(i<=j)
System.out.print(i+" ");
else
System.out.print("   ");
}
System.out.println();
}
}
}