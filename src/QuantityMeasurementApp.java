public class QuantityMeasurementApp {

    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Feet feet = (Feet) obj;
            return Double.compare(feet.value, value) == 0;
        }
    }

    public static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Inches inches = (Inches) obj;
            return Double.compare(inches.value, value) == 0;
        }
    }

    public static boolean checkFeetEquality(double a,double b){
        return new Feet(a).equals(new Feet(b));
    }

    public static boolean checkInchesEquality(double a,double b){
        return new Inches(a).equals(new Inches(b));
    }

    public static void main(String[] args) {
        System.out.println(checkFeetEquality(1.0,1.0));
        System.out.println(checkInchesEquality(1.0,1.0));
    }
}