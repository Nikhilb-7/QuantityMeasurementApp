package QuantityMeasurementAppTest;

import org.junit.jupiter.api.Test;
import QuantityMeasurementApp.*;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    void testObjectCreation() {
        QuantityWeight q = new QuantityWeight(1, WeightUnit.KILOGRAM);
        assertNotNull(q);
    }
}