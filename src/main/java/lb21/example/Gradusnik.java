package lb21.example;

public class Gradusnik {
    private String model;
    private double minTemperature;
    private double maxTemperature;
    private double errorMargin;

    public Gradusnik(String model, double minTemperature, double maxTemperature, double errorMargin) {
        this.model = model;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;
        this.errorMargin = errorMargin;
    }

    @Override
    public String toString() {
        return "Термометр {" +
                "Модель = '" + model + '\'' +
                ", Діапазон температур = [" + minTemperature + ", " + maxTemperature + "]" +
                ", Похибка вимірювання = ±" + errorMargin + "°C" +
                '}';
    }
}

