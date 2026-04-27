import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    void testFeetToInches() {
        assertEquals(
                12.0,
                QuantityMeasurementApp.convert(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET,
                        QuantityMeasurementApp.LengthUnit.INCH
                ),
                0.0001
        );
    }

    @Test
    void testInchesToFeet() {
        assertEquals(
                2.0,
                QuantityMeasurementApp.convert(
                        24.0,
                        QuantityMeasurementApp.LengthUnit.INCH,
                        QuantityMeasurementApp.LengthUnit.FEET
                ),
                0.0001
        );
    }

    @Test
    void testYardToFeet() {
        assertEquals(
                3.0,
                QuantityMeasurementApp.convert(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.YARD,
                        QuantityMeasurementApp.LengthUnit.FEET
                ),
                0.0001
        );
    }

    @Test
    void testCentimeterToInch() {
        assertEquals(
                1.0,
                QuantityMeasurementApp.convert(
                        2.54,
                        QuantityMeasurementApp.LengthUnit.CENTIMETER,
                        QuantityMeasurementApp.LengthUnit.INCH
                ),
                0.0001
        );
    }

    @Test
    void testInvalidUnitThrows() {
        assertThrows(
                IllegalArgumentException.class,
                () -> QuantityMeasurementApp.convert(
                        1.0,
                        null,
                        QuantityMeasurementApp.LengthUnit.INCH
                )
        );
    }
}