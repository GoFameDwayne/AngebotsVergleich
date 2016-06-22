package Models;

import static java.lang.String.format;
import static java.lang.String.format;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.lang.String.*;


public class ProductCompare {    
    public double getPricePercentage(double ProductPrice, double ComparePrice){
        DecimalFormat df = new DecimalFormat("#.##");
        DecimalFormatSymbols decimalSymbol = new DecimalFormatSymbols(Locale.getDefault());
        decimalSymbol.setDecimalSeparator('.');
        df.setDecimalFormatSymbols(decimalSymbol);
        if(ComparePrice != 0.0){
            return Double.valueOf(df.format(100 - (ProductPrice / (ProductPrice + ComparePrice) * 100)));
        }
        return 100;
    }
}
