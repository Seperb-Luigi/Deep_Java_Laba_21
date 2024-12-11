package lb21.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GradusnikTest {

    @Test
    void testLiquidGradusnikToString() {
        LiquidGradusnik liquidGradusnik = new LiquidGradusnik("LT-100", -20, 120, 0.5, "Alcohol");
        String expected = "Термометр {Модель = 'LT-100', Діапазон температур = [-20.0, 120.0], Похибка вимірювання = ±0.5°C}, Тип рідини = 'Alcohol'";
        assertEquals(expected, liquidGradusnik.toString());
    }

    @Test
    void testElectricGradusnikToString() {
        ElectricGradusnik electricGradusnik = new ElectricGradusnik("ET-200", -50, 200, 0.2, 12.0);
        String expected = "Термометр {Модель = 'ET-200', Діапазон температур = [-50.0, 200.0], Похибка вимірювання = ±0.2°C}, Час роботи батареї = 12.0 год";
        assertEquals(expected, electricGradusnik.toString());
    }

    @Test
    void testOpticalGradusnikToString() {
        OpticalGradusnik opticalGradusnik = new OpticalGradusnik("OT-300", -100, 300, 0.1, "Infrared");
        String expected = "Термометр {Модель = 'OT-300', Діапазон температур = [-100.0, 300.0], Похибка вимірювання = ±0.1°C}, Тип сенсора = 'Infrared'";
        assertEquals(expected, opticalGradusnik.toString());
    }

    @Test
    void testInheritance() {
        Gradusnik liquidThermometer = new LiquidGradusnik("LT-100", -20, 120, 0.5, "Alcohol");
        assertTrue(liquidThermometer instanceof Gradusnik);
        assertTrue(liquidThermometer instanceof LiquidGradusnik);

        Gradusnik electricThermometer = new ElectricGradusnik("ET-200", -50, 200, 0.2, 12.0);
        assertTrue(electricThermometer instanceof Gradusnik);
        assertTrue(electricThermometer instanceof ElectricGradusnik);

        Gradusnik opticalThermometer = new OpticalGradusnik("OT-300", -100, 300, 0.1, "Infrared");
        assertTrue(opticalThermometer instanceof Gradusnik);
        assertTrue(opticalThermometer instanceof OpticalGradusnik);
    }
}
