public class QuantityMeasurementApp {

    public enum LengthUnit {
        FEET(1.0),
        INCH(1.0/12.0),
        YARD(3.0),
        CENTIMETER(0.393701/12.0);

        private final double factor;

        LengthUnit(double factor){
            this.factor = factor;
        }

        public double getFactor(){
            return factor;
        }
    }

    public static class QuantityLength {

        private final double value;
        private final LengthUnit unit;

        public QuantityLength(double value, LengthUnit unit){
            this.value = value;
            this.unit = unit;
        }

        private double toFeet(){
            return value * unit.getFactor();
        }

        public QuantityLength convertTo(LengthUnit target){
            double convertedValue =
                    toFeet() / target.getFactor();

            return new QuantityLength(
                    convertedValue,
                    target
            );
        }

        @Override
        public boolean equals(Object obj){
            if(this == obj)
                return true;

            if(obj == null ||
                    getClass()!=obj.getClass())
                return false;

            QuantityLength other =
                    (QuantityLength) obj;

            return Double.compare(
                    this.toFeet(),
                    other.toFeet()
            ) == 0;
        }

        @Override
        public String toString(){
            return value + " " + unit;
        }
    }

    public static double convert(
            double value,
            LengthUnit source,
            LengthUnit target){

        if(source == null ||
                target == null ||
                !Double.isFinite(value)){
            throw new IllegalArgumentException();
        }

        return value *
                (source.getFactor() /
                        target.getFactor());
    }

    public static void main(String[] args) {

        System.out.println(
                convert(
                        1.0,
                        LengthUnit.FEET,
                        LengthUnit.INCH
                )
        );

        System.out.println(
                convert(
                        3.0,
                        LengthUnit.YARD,
                        LengthUnit.FEET
                )
        );

        System.out.println(
                convert(
                        36.0,
                        LengthUnit.INCH,
                        LengthUnit.YARD
                )
        );
    }
}