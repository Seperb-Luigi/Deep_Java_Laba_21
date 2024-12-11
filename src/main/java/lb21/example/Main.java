package lb21.example;

public class Main {
    public static void main(String[] args) {
        Gradusnik liquidGradusnik = new LiquidGradusnik("AE-100", -50, 120, 0.5, "Alcohol");
        Gradusnik electricGradusnik = new ElectricGradusnik("PS-200", -20, 200, 0.2, 40.0);
        Gradusnik opticalGradusnik = new OpticalGradusnik("SA-300", -120, 300, 0.1, "Infrared");

        System.out.println(liquidGradusnik);
        System.out.println(electricGradusnik);
        System.out.println(opticalGradusnik);
    }
}

