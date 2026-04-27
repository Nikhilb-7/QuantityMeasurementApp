package QuantityMeasurementAppTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    void testFeetEquality_SameValue() {
        assertTrue(QuantityMeasurementApp.checkFeetEquality(1.0,1.0));
    }

    @Test
    void testFeetEquality_DifferentValue() {
        assertFalse(QuantityMeasurementApp.checkFeetEquality(1.0,2.0));
    }

    @Test
    void testInchesEquality_SameValue() {
        assertTrue(QuantityMeasurementApp.checkInchesEquality(1.0,1.0));
    }

    @Test
    void testInchesEquality_DifferentValue() {
        assertFalse(QuantityMeasurementApp.checkInchesEquality(1.0,2.0));
    }

    @Test
    void testNullComparison() {
        QuantityMeasurementApp.Feet f=new QuantityMeasurementApp.Feet(1.0);
        assertFalse(f.equals(null));
    }

    @Test
    void testNonNumericInput() {
        QuantityMeasurementApp.Inches i=new QuantityMeasurementApp.Inches(1.0);
        assertFalse(i.equals("abc"));
    }

    @Test
    void testSameReference() {
        QuantityMeasurementApp.Feet f=new QuantityMeasurementApp.Feet(1.0);
        assertTrue(f.equals(f));
    }
}