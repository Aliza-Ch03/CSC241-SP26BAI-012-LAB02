class PassByValueDemo {

    static void changeNumber(int x) {
        x = 99;

        System.out.println(
            "Inside changeNumber(): x = " + x
        );
    }

    static void changeStudent(Student st) {
        st.completedCredits = 99;

        System.out.println(
            "Inside changeStudent(): credits = "
            + st.completedCredits
        );
    }

    static void replaceStudent(Student st) {

        st = new Student();

        st.name = "Temporary";
        st.completedCredits = 500;

        System.out.println(
            "Inside replaceStudent(): "
            + st.name + " " + st.completedCredits
        );
    }

    public static void main(String[] args) {

        // Experiment A
        int number = 10;

        System.out.println("Experiment A");
        System.out.println("Before: " + number);

        changeNumber(number);

        System.out.println("After: " + number);

        // Experiment B
        Student student = new Student();
        student.name = "Ali";
        student.completedCredits = 20;

        System.out.println("\nExperiment B");
        System.out.println(
            "Before: " + student.completedCredits
        );

        changeStudent(student);

        System.out.println(
            "After: " + student.completedCredits
        );

        // Experiment C
        Student original = new Student();
        original.name = "Abeer";
        original.completedCredits = 30;

        System.out.println("\nExperiment C");
        System.out.println(
            "Before: "
            + original.name
            + " "
            + original.completedCredits
        );

        replaceStudent(original);

        System.out.println(
            "After: "
            + original.name
            + " "
            + original.completedCredits
        );
    }
}