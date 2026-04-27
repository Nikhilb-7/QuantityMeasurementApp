import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    void testFeetToBase(){
        assertEquals(
                5.0,
                LengthUnit.FEET
                        .convertToBaseUnit(5),
                0.0001
        );
    }

    @Test
    void testInchesToBase(){
        assertEquals(
                1.0,
                LengthUnit.INCH
                        .convertToBaseUnit(12),
                0.0001
        );
    }

    @Test
    void testYardToBase(){
        assertEquals(
                3.0,
                LengthUnit.YARD
                        .convertToBaseUnit(1),
                0.0001
        );
    }

    @Test
    void testFeetToInches(){
        assertEquals(
                12.0,
                LengthUnit.INCH
                        .convertFromBaseUnit(1),
                0.0001
        );
    }

    @Test
    void testEquality(){

        var a=
                new QuantityMeasurementApp
                        .QuantityLength(
                        1,
                        LengthUnit.FEET
                );

        var b=
                new QuantityMeasurementApp
                        .QuantityLength(
                        12,
                        LengthUnit.INCH
                );

        assertTrue(a.equals(b));
    }

    @Test
    void testConvertTo(){

        var a=
                new QuantityMeasurementApp
                        .QuantityLength(
                        1,
                        LengthUnit.FEET
                );

        assertEquals(
                12.0,
                a.convertTo(
                        LengthUnit.INCH
                ).getValue(),
                0.0001
        );
    }

    @Test
    void testAddFeet(){

        var a=
                new QuantityMeasurementApp
                        .QuantityLength(
                        1,
                        LengthUnit.FEET
                );

        var b=
                new QuantityMeasurementApp
                        .QuantityLength(
                        12,
                        LengthUnit.INCH
                );

        assertEquals(
                2.0,
                a.add(
                        b,
                        LengthUnit.FEET
                ).getValue(),
                0.0001
        );
    }

    @Test
    void testAddYardTarget(){

        var a=
                new QuantityMeasurementApp
                        .QuantityLength(
                        1,
                        LengthUnit.FEET
                );

        var b=
                new QuantityMeasurementApp
                        .QuantityLength(
                        12,
                        LengthUnit.INCH
                );

        assertEquals(
                0.6667,
                a.add(
                        b,
                        LengthUnit.YARD
                ).getValue(),
                0.01
        );
    }

    @Test
    void testNullUnitThrows(){
        assertThrows(
                IllegalArgumentException.class,
                ()->new QuantityMeasurementApp
                        .QuantityLength(
                        1,
                        null
                )
        );
    }

    @Test
    void testNaNThrows(){
        assertThrows(
                IllegalArgumentException.class,
                ()->new QuantityMeasurementApp
                        .QuantityLength(
                        Double.NaN,
                        LengthUnit.FEET
                )
        );
    }
}