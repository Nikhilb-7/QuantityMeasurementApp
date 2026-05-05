package QuantityMeasurementApp;

public class QuantityMeasurementApp {
    public static void main(String[] args) {

        QuantityWeight w1 = new QuantityWeight(1, WeightUnit.KILOGRAM);
        QuantityWeight w2 = new QuantityWeight(1000, WeightUnit.GRAM);
        QuantityWeight w3 = new QuantityWeight(2.20462, WeightUnit.POUND);

        // Equality
        System.out.println("1 kg == 1000 g → " + w1.equals(w2));
        System.out.println("1 kg == 2.20462 lb → " + w1.equals(w3));

        // Conversion
        System.out.println("1 kg to gram → " + w1.convertTo(WeightUnit.GRAM));
        System.out.println("2.20462 lb to kg → " + w3.convertTo(WeightUnit.KILOGRAM));

        // Addition
        System.out.println("1 kg + 1000 g → " + w1.add(w2));
        System.out.println("1 kg + 1000 g (in grams) → " + w1.add(w2, WeightUnit.GRAM));
    }
}