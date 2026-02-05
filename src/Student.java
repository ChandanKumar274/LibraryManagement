public class Student extends Person {

    public Student(String name) {
        super(name);
    }

    @Override
    public void showRole() {
        System.out.println("I am a student");
    }
}

