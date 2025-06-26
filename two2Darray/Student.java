package two2Darray;

public class Student {

    String name; 
    int age;    

    public Student(String string, int i) {
        name = string;
        age = i;
    }
    @Override
    public String toString() {
        
        return "["+this.name+","+this.age+"]";
    }
}
