package QuantityMeasurementAppTest;

import org.junit.jupiter.api.Test;
import QuantityMeasurementApp.*;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityWeightTest {

    @Test
    void testEquality_KgToGram() {
        QuantityWeight q1 = new QuantityWeight(1, WeightUnit.KILOGRAM);
        QuantityWeight q2 = new QuantityWeight(1000, WeightUnit.GRAM);

        assertTrue(q1.equals(q2));
    }

    @Test
    void testConversion_KgToGram() {
        QuantityWeight q = new QuantityWeight(1, WeightUnit.KILOGRAM);
        QuantityWeight result = q.convertTo(WeightUnit.GRAM);

        assertEquals(1000.0, result.getValue(), 0.001);
    }

    @Test
    void testAddition_KgPlusGram() {
        QuantityWeight q1 = new QuantityWeight(1, WeightUnit.KILOGRAM);
        QuantityWeight q2 = new QuantityWeight(1000, WeightUnit.GRAM);

        QuantityWeight result = q1.add(q2);

        assertTrue(result.equals(new QuantityWeight(2, WeightUnit.KILOGRAM)));
    }
}