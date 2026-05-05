package QuantityMeasurementApp;

public enum LengthUnit {

    FOOT(1.0),
    INCH(1.0 / 12.0),
    YARD(3.0),
    CENTIMETER(1.0 / 30.48);

    private final double factor;

    LengthUnit(double factor) {
        this.factor = factor;
    }

    // convert to base unit (FOOT)
    public double toBase(double value) {
        return value * factor;
    }

    // convert from base unit (FOOT)
    public double fromBase(double baseValue) {
        return baseValue / factor;
    }
}