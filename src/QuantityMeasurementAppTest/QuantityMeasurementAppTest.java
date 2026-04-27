package QuantityMeasurementAppTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    void testEquality_FeetToFeet_SameValue(){
        assertTrue(
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET)
                        .equals(
                                new QuantityMeasurementApp.QuantityLength(
                                        1.0,
                                        QuantityMeasurementApp.LengthUnit.FEET))
        );
    }

    @Test
    void testEquality_InchToInch_SameValue(){
        assertTrue(
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.INCH)
                        .equals(
                                new QuantityMeasurementApp.QuantityLength(
                                        1.0,
                                        QuantityMeasurementApp.LengthUnit.INCH))
        );
    }

    @Test
    void testEquality_FeetToInch_EquivalentValue(){
        assertTrue(
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET)
                        .equals(
                                new QuantityMeasurementApp.QuantityLength(
                                        12.0,
                                        QuantityMeasurementApp.LengthUnit.INCH))
        );
    }

    @Test
    void testEquality_DifferentValue(){
        assertFalse(
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET)
                        .equals(
                                new QuantityMeasurementApp.QuantityLength(
                                        2.0,
                                        QuantityMeasurementApp.LengthUnit.FEET))
        );
    }

    @Test
    void testNullComparison(){
        QuantityMeasurementApp.QuantityLength q=
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET);

        assertFalse(q.equals(null));
    }

    @Test
    void testSameReference(){
        QuantityMeasurementApp.QuantityLength q=
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET);

        assertTrue(q.equals(q));
    }
}