package AbstractionDemo;

abstract class StudentActivity {

    public abstract void performActivity();

 
    public void attendSchool() {
        System.out.println("Student is attending school.");
    }
}

class SportsActivity extends StudentActivity {

    @Override
    public void performActivity() {
        System.out.println("Student is playing basketball.");
    }
}

class AcademicActivity extends StudentActivity {

    @Override
    public void performActivity() {
        System.out.println("Student is participating in a quiz bee.");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        StudentActivity student1 = new SportsActivity();
        StudentActivity student2 = new AcademicActivity();

        System.out.println("=== STUDENT SCHOOL ACTIVITIES ===");

        System.out.println("\nSports Activity:");
        student1.attendSchool();
        student1.performActivity();

        System.out.println("\nAcademic Activity:");
        student2.attendSchool();
        student2.performActivity();
    }
}