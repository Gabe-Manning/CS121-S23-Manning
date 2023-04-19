public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jack", "Grey", 1234, "Psychology", "Senior");
        Student student2 = new Student("Bob", "Green", 1432, "Nursing", "Freshman");

        student1.addCourse("CS120");
        student1.addCourse("ENG104");
        student1.addCourse("HIST150");
        String info1 = student1.getStudentInfo();
        System.out.println(info1);
        student1.displayCourse();
        student1.removeCourse("CS120");
        student1.displayCourse();

        System.out.println();

        student2.addCourse("CS121");
        student2.addCourse("HONR199");
        student2.addCourse("ENG231");
        String info2 = student2.getStudentInfo();
        System.out.println(info2);
        student2.displayCourse();
        student2.removeCourse("ENG231");
        student2.displayCourse();

    }
}
