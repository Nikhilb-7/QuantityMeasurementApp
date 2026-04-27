package QuantityMeasurementAppTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    void testFeetPlusFeet(){
        QuantityMeasurementApp.QuantityLength a =
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        QuantityMeasurementApp.QuantityLength b =
                new QuantityMeasurementApp.QuantityLength(
                        2.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        assertEquals(
                3.0,
                a.add(b).getValue(),
                0.0001
        );
    }

    @Test
    void testFeetPlusInches(){
        QuantityMeasurementApp.QuantityLength a =
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        QuantityMeasurementApp.QuantityLength b =
                new QuantityMeasurementApp.QuantityLength(
                        12.0,
                        QuantityMeasurementApp.LengthUnit.INCH
                );

        assertEquals(
                2.0,
                a.add(b).getValue(),
                0.0001
        );
    }

    @Test
    void testInchesPlusFeet(){
        QuantityMeasurementApp.QuantityLength a =
                new QuantityMeasurementApp.QuantityLength(
                        12.0,
                        QuantityMeasurementApp.LengthUnit.INCH
                );

        QuantityMeasurementApp.QuantityLength b =
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        assertEquals(
                24.0,
                a.add(b).getValue(),
                0.0001
        );
    }

    @Test
    void testYardPlusFeet(){
        QuantityMeasurementApp.QuantityLength a =
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.YARD
                );

        QuantityMeasurementApp.QuantityLength b =
                new QuantityMeasurementApp.QuantityLength(
                        3.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        assertEquals(
                2.0,
                a.add(b).getValue(),
                0.0001
        );
    }

    @Test
    void testCentimeterPlusInch(){
        QuantityMeasurementApp.QuantityLength a =
                new QuantityMeasurementApp.QuantityLength(
                        2.54,
                        QuantityMeasurementApp.LengthUnit.CENTIMETER
                );

        QuantityMeasurementApp.QuantityLength b =
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.INCH
                );

        assertEquals(
                5.08,
                a.add(b).getValue(),
                0.01
        );
    }

    @Test
    void testAdditionWithZero(){
        QuantityMeasurementApp.QuantityLength a =
                new QuantityMeasurementApp.QuantityLength(
                        5.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        QuantityMeasurementApp.QuantityLength b =
                new QuantityMeasurementApp.QuantityLength(
                        0.0,
                        QuantityMeasurementApp.LengthUnit.INCH
                );

        assertEquals(
                5.0,
                a.add(b).getValue(),
                0.0001
        );
    }

    @Test
    void testNegativeAddition(){
        QuantityMeasurementApp.QuantityLength a =
                new QuantityMeasurementApp.QuantityLength(
                        5.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        QuantityMeasurementApp.QuantityLength b =
                new QuantityMeasurementApp.QuantityLength(
                        -2.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        assertEquals(
                3.0,
                a.add(b).getValue(),
                0.0001
        );
    }

    @Test
    void testNullOperand(){
        QuantityMeasurementApp.QuantityLength a =
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        assertThrows(
                IllegalArgumentException.class,
                () -> a.add(null)
        );
    }
}