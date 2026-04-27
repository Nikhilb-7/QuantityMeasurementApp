package QuantityMeasurementAppTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    void testTargetFeet(){

        QuantityMeasurementApp.QuantityLength a=
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        QuantityMeasurementApp.QuantityLength b=
                new QuantityMeasurementApp.QuantityLength(
                        12.0,
                        QuantityMeasurementApp.LengthUnit.INCH
                );

        assertEquals(
                2.0,
                a.add(
                        b,
                        QuantityMeasurementApp.LengthUnit.FEET
                ).getValue(),
                0.0001
        );
    }

    @Test
    void testTargetInches(){

        QuantityMeasurementApp.QuantityLength a=
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        QuantityMeasurementApp.QuantityLength b=
                new QuantityMeasurementApp.QuantityLength(
                        12.0,
                        QuantityMeasurementApp.LengthUnit.INCH
                );

        assertEquals(
                24.0,
                a.add(
                        b,
                        QuantityMeasurementApp.LengthUnit.INCH
                ).getValue(),
                0.0001
        );
    }

    @Test
    void testTargetYards(){

        QuantityMeasurementApp.QuantityLength a=
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        QuantityMeasurementApp.QuantityLength b=
                new QuantityMeasurementApp.QuantityLength(
                        12.0,
                        QuantityMeasurementApp.LengthUnit.INCH
                );

        assertEquals(
                0.6667,
                a.add(
                        b,
                        QuantityMeasurementApp.LengthUnit.YARD
                ).getValue(),
                0.01
        );
    }

    @Test
    void testCentimeterTarget(){

        QuantityMeasurementApp.QuantityLength a=
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.INCH
                );

        QuantityMeasurementApp.QuantityLength b=
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.INCH
                );

        assertEquals(
                5.08,
                a.add(
                        b,
                        QuantityMeasurementApp.LengthUnit.CENTIMETER
                ).getValue(),
                0.01
        );
    }

    @Test
    void testCommutativity(){

        QuantityMeasurementApp.QuantityLength a=
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        QuantityMeasurementApp.QuantityLength b=
                new QuantityMeasurementApp.QuantityLength(
                        12.0,
                        QuantityMeasurementApp.LengthUnit.INCH
                );

        double first=
                a.add(
                        b,
                        QuantityMeasurementApp.LengthUnit.YARD
                ).getValue();

        double second=
                b.add(
                        a,
                        QuantityMeasurementApp.LengthUnit.YARD
                ).getValue();

        assertEquals(first,second,0.0001);
    }

    @Test
    void testZeroOperand(){

        QuantityMeasurementApp.QuantityLength a=
                new QuantityMeasurementApp.QuantityLength(
                        5.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        QuantityMeasurementApp.QuantityLength b=
                new QuantityMeasurementApp.QuantityLength(
                        0.0,
                        QuantityMeasurementApp.LengthUnit.INCH
                );

        assertEquals(
                1.6667,
                a.add(
                        b,
                        QuantityMeasurementApp.LengthUnit.YARD
                ).getValue(),
                0.01
        );
    }

    @Test
    void testNegativeValues(){

        QuantityMeasurementApp.QuantityLength a=
                new QuantityMeasurementApp.QuantityLength(
                        5.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        QuantityMeasurementApp.QuantityLength b=
                new QuantityMeasurementApp.QuantityLength(
                        -2.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        assertEquals(
                36.0,
                a.add(
                        b,
                        QuantityMeasurementApp.LengthUnit.INCH
                ).getValue(),
                0.0001
        );
    }

    @Test
    void testNullTarget(){

        QuantityMeasurementApp.QuantityLength a=
                new QuantityMeasurementApp.QuantityLength(
                        1.0,
                        QuantityMeasurementApp.LengthUnit.FEET
                );

        QuantityMeasurementApp.QuantityLength b=
                new QuantityMeasurementApp.QuantityLength(
                        12.0,
                        QuantityMeasurementApp.LengthUnit.INCH
                );

        assertThrows(
                IllegalArgumentException.class,
                ()->a.add(b,null)
        );
    }
}