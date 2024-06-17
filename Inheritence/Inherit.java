class Nokia1{
int x,y;

void f1(){

System.out.println("Parent function1 is executed.");

}

void f2(){


System.out.println("Parent function2 is executed.");

}

}
class Nokia2 extends Nokia1 {


int z;

void f3(){

System.out.println("child function1 is executed.");

}
}

class Inherit{

public static void main(String[]args){
Nokia2 n1 = new Nokia2();
n1.f1();

n1.f2();
n1.f3();

}

}