class Task1Demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.studentId = "BAI012";
        s1.name = "Aliza Ch";
        s1.completedCredits = 30;

        s2.studentId = "BAI013";
        s2.name = "Zainab Shezad";
        s2.completedCredits = 26;

        s3.studentId = "BAI014";
        s3.name = "Abeeha Fatima";
        s3.completedCredits = 20;

        System.out.println("Before Change:");

        System.out.println(s1.studentId + " " + s1.name + " " + s1.completedCredits);
        System.out.println(s2.studentId + " " + s2.name + " " + s2.completedCredits);
        System.out.println(s3.studentId + " " + s3.name + " " + s3.completedCredits);

        s2.completedCredits = s2.completedCredits + 6;

        System.out.println("\nAfter Changing s2:");

        System.out.println(s1.studentId + " " + s1.name + " " + s1.completedCredits);
        System.out.println(s2.studentId + " " + s2.name + " " + s2.completedCredits);
        System.out.println(s3.studentId + " " + s3.name + " " + s3.completedCredits);
    }
}