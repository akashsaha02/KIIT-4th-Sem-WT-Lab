class Student {
    int rollno;
    String course;

    public void register(String course) {
        this.course = course;
        System.out.println("Enrolled in " + course);
    }
}

class Kiitian extends Student {
    public void hostelRequest() {
        System.out.println("Kindly allot me hostel accomodition!");
    }
}

public class Question1 {
    public static void main(String[] args) {
        Kiitian k = new Kiitian();
        k.rollno = 123;
        k.register("Computer Science");
        k.hostelRequest();
        System.out.println(k instanceof Student); 
    }
}