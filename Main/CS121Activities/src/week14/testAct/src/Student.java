
    public class Student {
        public String firstname;
        public String lastname;
        public int id;
        public String major;
        public String classstanding;


        public Student(String firstname, String lastname, int id, String major, String classstanding) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.id = id;
            this.major = major;
            this.classstanding = classstanding;
        }

        public int getID() {
            return id;
        }

        public String getMajor() {
            return major;
        }


        public String getStudentInfo() {
            String s = "First Name: " + firstname + "\nLast Name: " + lastname + "\nStudent ID: " + id + "\nMajor: " + major + "\nClass Standing: " + classstanding;
            return s;
        }
    }