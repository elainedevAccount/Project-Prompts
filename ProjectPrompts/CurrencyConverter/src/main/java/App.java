import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner inputTaken = new Scanner(System.in);

        System.out.println("""
                Pick your currency:\s
                1. Euro
                2. GBP
                3. USD
                """);
        int current = inputTaken.nextInt();
        System.out.println("""
                Pick your currency to change to:\s
                1. Euro
                2. GBP
                3. USD
                """);
        int changeTo = inputTaken.nextInt();

        System.out.println("Enter amount to convert: ");
        double amount = inputTaken.nextDouble();

        switchAmount(current, changeTo, amount);


    }

    public static void switchAmount(int currentCurrency, int changeToCurrency, double amount){

        ExchangeRates exchangeRates = new ExchangeRates();
        String currencySymbol = "";
        double result = 0.0;

        switch (currentCurrency){
            case 1:
                if (changeToCurrency == 2){
                   result = exchangeRates.euroToPound(amount);
                   currencySymbol = "£";
                }else if(changeToCurrency == 3){
                    result = exchangeRates.euroToUSD(amount);
                    currencySymbol = "$";
                }

                break;

            case 2:
                if (changeToCurrency == 1){
                    result = exchangeRates.poundToEuro(amount);
                    currencySymbol = "€";
                }else if(changeToCurrency == 3){
                    result = exchangeRates.poundToUSD(amount);
                    currencySymbol = "$";
                }

                break;

            case 3:
                if (changeToCurrency == 1){
                    result = exchangeRates.USDToEuro(amount);
                    currencySymbol = "€";
                }else if(changeToCurrency == 2){
                    result = exchangeRates.USDToPound(amount);
                    currencySymbol = "£";
                }

                break;
        }

        System.out.println(currencySymbol + result);
    }
}
