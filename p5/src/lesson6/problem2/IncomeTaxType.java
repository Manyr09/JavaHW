package lesson6.problem2;

public class IncomeTaxType extends TaxType {
    @Override
    public double calculateTaxFor(double amount){
        return amount * 0.13;
    }
}
