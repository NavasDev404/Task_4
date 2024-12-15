// Voter class
class Voter {
    private int voterId;
    private String name;
    private int age;

    // Parameterized constructor
    public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
        if (age < 18) {
            throw new InvalidVoterAgeException("Invalid age for voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    // Override toString() for Voter details display
    @Override
    public String toString() {
        return "Voter{" +
               "voterId=" + voterId +
               ", name='" + name + '\'' +
               ", age=" + age +
               '}';
    }
}
// Custom checked exception for invalid voter age
class InvalidVoterAgeException extends Exception {
    public InvalidVoterAgeException(String message) {
        super(message);
    }
}