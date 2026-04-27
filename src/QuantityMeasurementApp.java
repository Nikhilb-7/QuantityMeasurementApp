public class QuantityMeasurementApp {

    public static class QuantityLength {

        private final double value;
        private final LengthUnit unit;

        public QuantityLength(
                double value,
                LengthUnit unit){

            if(unit==null || !Double.isFinite(value))
                throw new IllegalArgumentException();

            this.value=value;
            this.unit=unit;
        }

        public double getValue(){
            return value;
        }

        public LengthUnit getUnit(){
            return unit;
        }

        private double toFeet(){
            return unit.convertToBaseUnit(value);
        }

        public QuantityLength convertTo(
                LengthUnit target){

            double converted=
                    target.convertFromBaseUnit(
                            toFeet()
                    );

            return new QuantityLength(
                    converted,
                    target
            );
        }

        public QuantityLength add(
                QuantityLength other){

            return add(other,this.unit);
        }

        public QuantityLength add(
                QuantityLength other,
                LengthUnit target){

            if(other==null || target==null)
                throw new IllegalArgumentException();

            double totalFeet=
                    this.toFeet()+
                            other.toFeet();

            return new QuantityLength(
                    target.convertFromBaseUnit(
                            totalFeet
                    ),
                    target
            );
        }

        @Override
        public boolean equals(Object obj){

            if(this==obj)
                return true;

            if(obj==null ||
                    getClass()!=obj.getClass())
                return false;

            QuantityLength other=
                    (QuantityLength)obj;

            return Math.abs(
                    this.toFeet()-
                            other.toFeet()
            )<0.0001;
        }
    }

    public static void main(String[] args){

        QuantityLength a=
                new QuantityLength(
                        1,
                        LengthUnit.FEET
                );

        QuantityLength b=
                new QuantityLength(
                        12,
                        LengthUnit.INCH
                );

        System.out.println(
                a.add(
                        b,
                        LengthUnit.YARD
                ).getValue()
        );
    }
}