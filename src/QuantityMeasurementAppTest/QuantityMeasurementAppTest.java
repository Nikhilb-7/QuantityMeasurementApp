package QuantityMeasurementAppTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    void testYardToFeet(){
        assertTrue(
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.YARD)
                        .equals(
                                new QuantityMeasurementApp.QuantityLength(
                                        3.0,
                                        QuantityMeasurementApp.LengthUnit.FEET))
        );
    }

    @Test
    void testYardToInches(){
        assertTrue(
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.YARD)
                        .equals(
                                new QuantityMeasurementApp.QuantityLength(
                                        36.0,
                                        QuantityMeasurementApp.LengthUnit.INCH))
        );
    }

    @Test
    void testCentimeterToInch(){
        assertTrue(
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.CENTIMETER)
                        .equals(
                                new QuantityMeasurementApp.QuantityLength(
                                        0.393701,
                                        QuantityMeasurementApp.LengthUnit.INCH))
        );
    }

    @Test
    void testDifferentValues(){
        assertFalse(
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.YARD)
                        .equals(
                                new QuantityMeasurementApp.QuantityLength(
                                        2.0,
                                        QuantityMeasurementApp.LengthUnit.FEET))
        );
    }

    @Test
    void testSameReference(){
        QuantityMeasurementApp.QuantityLength q=
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.YARD);

        assertTrue(q.equals(q));
    }

    @Test
    void testNullComparison(){
        QuantityMeasurementApp.QuantityLength q=
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.YARD);

        assertFalse(q.equals(null));
    }
}