
public class ProductCalculations implements IProductCalculations {

    @Override
    public double GetVat(int Price) {
        double VAT = Price * 0.15;
        return VAT;
    }

    @Override
    public double GetCommission(int Price) {
        double Commission = Price * 0.05;
        return Commission;
    }

    @Override
    public double GetTotal(int Price) {
        double VATTotal = Price * 0.15;
        double CommissionTotal = Price * 0.05;
        int Total = (int) (Price + VATTotal + CommissionTotal);
        return Total;
    }
    
}
