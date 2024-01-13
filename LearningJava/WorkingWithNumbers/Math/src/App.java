public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double x = -50;
        double y = 23.55;

        //Max mathod(Find the larger of two numbers):
        double z = Math.max(x, y);
        // >> 23.55

        //sqaure root method
        double a = Math.sqrt(z);

        //rounding off
        //round down .floor
        double b = Math.floor(z);

        //round up .ceil
        double c = Math.ceil(z);
    }
}
