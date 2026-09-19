class OverloadDemo {
    public static void main(String[] args) {
        Student3 st = new Student3();
        st.name = "Abeer Amina";

        // Testing overloaded methods
        st.enroll("CSC241");
        st.enroll("CSC241", 2);
        st.enroll(241);
    }
}