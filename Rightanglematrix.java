class Rightanglematrix{
public static void main(String[] args){
System.out.println("staring main()");
int row=5;
for(int i=1; i<=5; i++){
for(int j=1; j<=5; j++){
if(i<=j){
System.out.print(i+""+j+" ");
}
else{
System.out.print("   ");
}
}
System.out.println();
}
}
}

