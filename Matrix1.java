class Matrix1{
public static void main(String []a){
System.out.println("started main()");
int row= 5;
for(int i=1; i<=row; i++){
for(int j=1; j<=row; j++){
if( i==1 || i==(row/2)+1 || j==1 || j==row ){
System.out.print(i+""+j+" ");
}
else
{
System.out.print(" ");
}
}
System.out.print();
}
}
}