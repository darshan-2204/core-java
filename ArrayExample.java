class ArrayExample{
public static void main (String [] args){
int oddNumbers[]={1,3,5,7,9,11,13};  
System.out.println(oddNumbers[6]);
System.out.println("Size of oddNumbers"+oddNumbers.length);
int evenNumbers[]=new int[10];
System.out.println("Size of evenNumbers"+evenNumbers.length);
System.out.println(evenNumbers[0]);
evenNumbers[0]=2;
for(int i=0; i<oddNumbers.length; i++){
System.out.println(oddNumbers[i]);
}
}
}


