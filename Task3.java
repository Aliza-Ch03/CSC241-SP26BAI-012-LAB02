class OverloadDemo {

    // Signature: enroll(String)
    void enroll(String courseCode) {
        System.out.println("Enrolled in course: " + courseCode);
    }

    // Signature: enroll(String, int)
    void enroll(String courseCode, int section) {
        System.out.println(
            "Enrolled in course: " + courseCode
            + ", Section: " + section
        );
    }

    // Signature: enroll(int)
    void enroll(int numericCourseCode) {
        System.out.println(
            "Enrolled in numeric course: " + numericCourseCode
        );
    }

    public static void main(String[] args) {

        OverloadDemo demo = new OverloadDemo();

        demo.enroll("CSC241");

        demo.enroll("CSC241", 2);

        demo.enroll(241);

        // Invalid:
        // demo.enroll();

        // Invalid:
        // demo.enroll("241", "2");
    }
}