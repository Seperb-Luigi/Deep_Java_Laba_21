package lb21.example;

class LiquidGradusnik extends Gradusnik {
    private String liquidType;

    public LiquidGradusnik(String model, double minTemperature, double maxTemperature, double errorMargin, String liquidType) {
        super(model, minTemperature, maxTemperature, errorMargin);
        this.liquidType = liquidType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Тип рідини = '" + liquidType + "'";
    }
}

class ElectricGradusnik extends Gradusnik {
    private double batteryLife;

    public ElectricGradusnik(String model, double minTemperature, double maxTemperature, double errorMargin, double batteryLife) {
        super(model, minTemperature, maxTemperature, errorMargin);
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {
        return super.toString() + ", Час роботи батареї = " + batteryLife + " год";
    }
}

class OpticalGradusnik extends Gradusnik {
    private String sensorType;

    public OpticalGradusnik(String model, double minTemperature, double maxTemperature, double errorMargin, String sensorType) {
        super(model, minTemperature, maxTemperature, errorMargin);
        this.sensorType = sensorType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Тип сенсора = '" + sensorType + "'";
    }
}
