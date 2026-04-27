public enum LengthUnit {

    FEET(1.0),
    INCH(1.0/12.0),
    YARD(3.0),
    CENTIMETER(1.0/30.48);

    private final double factor;

    LengthUnit(double factor){
        this.factor=factor;
    }

    public double getFactor(){
        return factor;
    }

    public double convertToBaseUnit(double value){
        return value*factor;
    }

    public double convertFromBaseUnit(
            double baseValue){
        return baseValue/factor;
    }
}