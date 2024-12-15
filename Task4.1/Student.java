// Student class
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Constructor to initialize Student attributes
    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }
        if (!isValidName(name)) {
            throw new NameNotValidException("Name contains invalid characters. Only alphabets are allowed.");
        }
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to validate name (only alphabets allowed)
    private boolean isValidName(String name) {
        return name.matches("[a-zA-Z ]+");
    }

    // Override toString() for Student details display
    @Override
    public String toString() {
        return "Student{" +
               "rollNo=" + rollNo +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", course='" + course + '\'' +
               '}';
    }
}

// User-defined exception for age not within the valid range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

// User-defined exception for invalid name
class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

