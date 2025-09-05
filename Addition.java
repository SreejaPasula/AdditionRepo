// Addition.java
public class Addition {

    public int addNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addition addition = new Addition();
        int sum = addition.addNumbers(5, 7); // simple numbers
        System.out.println("Sum: " + sum);
    }
}
