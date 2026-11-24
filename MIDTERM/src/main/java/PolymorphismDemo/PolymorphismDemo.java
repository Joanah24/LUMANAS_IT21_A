package PolymorphismDemo;

class Transportation {

    public void travelToSchool() {
        System.out.println("Student is traveling to school.");
    }
}


class Bus extends Transportation {

    @Override
    public void travelToSchool() {
        System.out.println("Student travels to school by Bus.");
    }
}


class Motorcycle extends Transportation {

    @Override
    public void travelToSchool() {
        System.out.println("Student travels to school by motorcycle.");
    }
}


public class PolymorphismDemo {

    public static void main(String[] args) {

        Transportation student1 = new Bus();
        Transportation student2 = new Motorcycle();

        System.out.println("=== STUDENT TRANSPORTATION ===");

        student1.travelToSchool();
        student2.travelToSchool();
    }
}
