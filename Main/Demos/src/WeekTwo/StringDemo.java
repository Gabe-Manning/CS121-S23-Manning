public class StringDemo {

    public static void main(String[] args){
        String name = "John" + " " + "Doe";
        String firstName = "John";
        String lastName = "Doe";
        String fullName = String.format("%s %s", firstName, lastName);
        int age = 20;
        double gpa = 3.8;
        char grade = 'A';
        String info = String.format("name: %s, \nage: %d, \ngpa: %.1f, \ngrade: %c\n", fullName, age, gpa, grade);


        //System.out.println(fullName);
        //System.out.println(info);
        //System.out.printf("name: %s, age: %d, gpa: %.1f, grade: %c", fullName, age, gpa, grade);

        //String.replace()
        System.out.printf("0. %s\n", name);
        System.out.printf("1. %s\n", name.replace("John", "Jane"));
        System.out.printf("2. %s\n", name);
        name = name.replace("John", "Jane");
        System.out.printf("3. %s\n\n", name);

        // String.length()
        System.out.printf("Number of characters: %d\n\n", name.length());

        // String.toUpperCase() and String.toLowerCase()
        System.out.printf("%s\n", name.toUpperCase());
        System.out.printf("%s\n", name.toLowerCase());
        System.out.printf("%s\n\n", name);

        // String.charAt(index)
        System.out.printf("Initials: %s.%s.\n\n", name.charAt(0), name.charAt(5));

        //String.substring(beginning index, ending index)
        System.out.printf("First name: %s\nLastName: %s\n\n", name.substring(0, 4), name.substring(5,8));
    }
}
