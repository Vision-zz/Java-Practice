public class App {
    
    public static void main(String[] args) {
        Alto alto = new Alto();
        alto.start();
        alto.steer(20.5, 6, 5);

        XUV xuv = new XUV();
        xuv.start();
        xuv.steer(31.7, 3, 6);
    }
}
