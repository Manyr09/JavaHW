package lesson6.problem2;

public class Practice {
    public static void main(String[] args) {
        TaxService taxService = new TaxService();
        Bill[] payments = new Bill[] {
                // TODO создать платежи с различным типами налогообложения
                new Bill(100_000, new IncomeTaxType(), new TaxService()),
                new Bill(200_000, new VATaxType(), new TaxService()),
                new Bill(90_000, new ProgressiveTaxType(), new TaxService())
        };
        for (int i = 0; i < payments.length; ++i) {
            Bill bill = payments[i];
            bill.payTaxes();
        }
    }
}
