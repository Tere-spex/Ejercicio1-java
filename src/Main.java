public class Main {
    public static void main(String[] args) {
        String fullName = "Teresa Hernandez";
        int reservedNumber = (int)(Math. random()*10+2);
        System.out.println("Hello"+" "+fullName+"!");
        System.out.println("The reserved number is"+" "+reservedNumber+"!");
        System.out.println("Goodbye"+" "+fullName.toUpperCase().replace(" ", "_")+"!");
    }
}