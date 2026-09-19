class Task2Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s1.studentId = "BAI012";
        s1.name = "Aliza Ch";
        s1.completedCredits = 30;

        s2.studentId = "BAI013";
        s2.name = "Zainab Shezad";
        s2.completedCredits = 26;

        System.out.println("Before adding credits:");
        System.out.println(s1.summary());
        System.out.println(s2.summary());

        s1.addCredits(6);
        s2.addCredits(3);

        System.out.println("\nAfter adding credits:");
        System.out.println(s1.summary());
        System.out.println(s2.summary());

        System.out.println("\nRemaining Credits:");

        System.out.println(
            s1.name + ": " + s1.remainingCredits(130)
        );

        System.out.println(
            s2.name + ": " + s2.remainingCredits(130)
        );
    }
}