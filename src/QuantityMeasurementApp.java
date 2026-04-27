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
            if(unit == null || !Double.isFinite(value)){
                throw new IllegalArgumentException();
            }
            this.value = value;
            this.unit = unit;
        }

        public double getValue(){
            return value;
        }

        public LengthUnit getUnit(){
            return unit;
        }

        private double toFeet(){
            return value * unit.getFactor();
        }

        public QuantityLength convertTo(LengthUnit target){
            double convertedValue =
                    toFeet()/target.getFactor();

            return new QuantityLength(
                    convertedValue,
                    target
            );
        }

        public QuantityLength add(QuantityLength other){
            if(other == null){
                throw new IllegalArgumentException();
            }

            double totalFeet =
                    this.toFeet() + other.toFeet();

            double resultValue =
                    totalFeet / this.unit.getFactor();

            return new QuantityLength(
                    resultValue,
                    this.unit
            );
        }

        @Override
        public boolean equals(Object obj){
            if(this == obj)
                return true;

            if(obj == null || getClass()!=obj.getClass())
                return false;

            QuantityLength other =
                    (QuantityLength)obj;

            return Math.abs(
                    this.toFeet()-other.toFeet()
            ) < 0.0001;
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
                (source.getFactor()/
                        target.getFactor());
    }

    public static void main(String[] args) {

        QuantityLength a =
                new QuantityLength(
                        1.0,
                        LengthUnit.FEET
                );

        QuantityLength b =
                new QuantityLength(
                        12.0,
                        LengthUnit.INCH
                );

        System.out.println(
                a.add(b)
        );
    }
}