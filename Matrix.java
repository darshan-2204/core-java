class Matrix{
public static void main(String []a){
System.out.println("started main()");
int row=8;
for(int i =1; i<=row; i++){
for(int j =1; j<=row; j++){
if(i==j)
System.out.print(i+ " " +j+ " " );
else if (i+j==row+1)
System.out.print(i+ " " +j+ " " );
else
System.out.print(" ");
}
System.out.println();
}
}
}

