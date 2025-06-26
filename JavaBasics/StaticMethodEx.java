package JavaBasics;
class StaticMethod{

	static void Hello(){
	System.out.println("Hello World");
	}

}

class StaticMethodEx extends StaticMethod{

public static void main(String args[]){

StaticMethod st = new StaticMethod();
Hello();
}
}