public class Task1demo {
    public static void main(String[] args) {
        
        Student s1 = new Student();
        s1.studentId = "BAI-001";
        s1.name = "Abeer Amina";
        s1.completedCredits = 15;

        Student s2 = new Student();
        s2.studentId = "BAI-002";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 18;

        Student s3 = new Student();
        s3.studentId = "BAI-003";
        s3.name = "Abdul Rehman Azam";
        s3.completedCredits = 12;

        // Print before modification
        System.out.println("--- BEFORE MODIFICATION ---");
        System.out.println(s1.name + ": " + s1.completedCredits);
        System.out.println(s2.name + ": " + s2.completedCredits);
        System.out.println(s3.name + ": " + s3.completedCredits);

        // Modify only s2
        s2.completedCredits = s2.completedCredits + 3;

        // Print after modification
        System.out.println("\n--- AFTER MODIFICATION (Only s2 updated) ---");
        System.out.println(s1.name + ": " + s1.completedCredits);
        System.out.println(s2.name + ": " + s2.completedCredits);
        System.out.println(s3.name + ": " + s3.completedCredits);

        /*
         * EXPLANATION:
         * The other two objects (s1 and s3) did not change because each object created with 
         * 'new' occupies its own distinct location in heap memory with independent instance variables.
         */
    }
}