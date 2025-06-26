package two2Darray;

public class Custom2DArray {

    public static void main(String[] args) {

        Student s1 = new Student("Allen", 21);
        Student s2 = new Student("Mark", 20);
        Student s3 = new Student("Zuck", 19);

        Student[] s = new Student[3];
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;

        for (Student st : s) {
            System.out.println(st);
        }

    }
}