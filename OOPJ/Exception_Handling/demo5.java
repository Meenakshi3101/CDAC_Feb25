/* 5. Implement IllegalArgumentException
Write a Java method setAge(int age) that throws an IllegalArgumentException if the age is negative or greater than 150.*/


 class demo5 {
    private int age;

    public void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150.");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        demo5 person = new demo5();
        try {
            person.setAge(206); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
