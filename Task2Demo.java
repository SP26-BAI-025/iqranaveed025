
class Task2Demo {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.studentId = "BAI-001";
        s1.name = "Abeer Amina";
        s1.completedCredits = 30;

        Student2 s2 = new Student2();
        s2.studentId = "BAI-002";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 60;

        System.out.println("--- Initial State ---");
        System.out.println(s1.summary());
        System.out.println(s2.summary());

        // Add new credits
        s1.addCredits(3);
        s2.addCredits(4);

        System.out.println("\n--- After Adding Credits ---");
        System.out.println(s1.summary());
        System.out.println(s1.name + " Remaining Credits: " + s1.remainingCredits());

        System.out.println("\n" + s2.summary());
        System.out.println(s2.name + " Remaining Credits: " + s2.remainingCredits());
    }
}