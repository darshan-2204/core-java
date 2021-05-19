 class LogicalOperatorDemo{

public static void main(String[] args){

int i = 10;
int j = 20;
int k = 10;

System.out.println(i==k && i<j++); //true
System.out.println(i!=k && i>j); //false
System.out.println(i<=k && i==j); //false
System.out.println(i>=j && i<k--); //false
System.out.println(j); //21
System.out.println(k); //10

System.out.println(i<=k || i>=k); //true
System.out.println(j>=i || i==j); //true
System.out.println(i<=j || k!=i++); //true
System.out.println(i<k-- || i>j); //false
System.out.println(k); //9
System.out.println(i); //10
}
}
