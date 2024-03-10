package EmailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Tushar", "Chaudhary");       //Constructor
        em1.setAlternateEmail("tuehr@gmail.com");
        System.out.println(em1.getAlternateEmail());
        System.out.println(em1.showInfo());
        
        
    }
}
