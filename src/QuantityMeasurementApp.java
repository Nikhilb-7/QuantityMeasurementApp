public class QuantityMeasurementApp {

    public enum LengthUnit {
        FEET(1.0),
        INCH(1.0/12.0);

        private final double factor;

        LengthUnit(double factor){
            this.factor=factor;
        }

        public double getFactor(){
            return factor;
        }
    }

    public static class QuantityLength {
        private final double value;
        private final LengthUnit unit;

        public QuantityLength(double value, LengthUnit unit){
            this.value=value;
            this.unit=unit;
        }

        private double toFeet(){
            return value * unit.getFactor();
        }

        @Override
        public boolean equals(Object obj){
            if(this==obj) return true;
            if(obj==null || getClass()!=obj.getClass()) return false;

            QuantityLength other=(QuantityLength)obj;
            return Double.compare(this.toFeet(),other.toFeet())==0;
        }
    }
}