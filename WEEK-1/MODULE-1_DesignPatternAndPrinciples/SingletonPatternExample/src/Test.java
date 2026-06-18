public class Test {
    public static void main(String[] args) {
        // To verify only one instance is created.

        Logger logger = Logger.getInstance();
        System.out.println("Logger 1 : "+logger);
        Logger logger1 = Logger.getInstance();
        System.out.println("Logger 2 : "+logger1);
        System.out.println("Is Logger 1 == Logger 2 : "+(logger1 == logger));
    }
}
