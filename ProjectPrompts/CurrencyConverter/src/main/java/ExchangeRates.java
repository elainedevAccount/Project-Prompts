import java.util.ArrayList;

public class ExchangeRates {

    //Euro 1
    public double euroToPound(double amount){
        return amount * .86;
    }
    public double euroToUSD(double amount){
        return amount * 1.05;
    }

    //Pound 2
    public double poundToEuro(double amount){
        return amount * 1.15;
    }
    public double poundToUSD(double amount){
        return amount * 1.21;
    }

    //USD 3
    public double USDToPound(double amount){
        return amount * 0.82;
    }

    public double USDToEuro(double amount){
        return amount * 0.94;
    }

}

