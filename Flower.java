class Flower{
String name;
String color;
int noofPetals;
void bloom(){
System.out.println(color+" "+name+" is blooming with Petals"+noofPetals+"...!!");
}
public static void main(String args[]){
Flower rose=new Flower();
rose.name="Rose";
rose.color="Red";
rose.noofPetals=5;
rose.bloom();
Flower lotus=new Flower();
lotus.name="lotus";
lotus.color="pink";
lotus.noofPetals=6;
lotus.bloom();
}
} 