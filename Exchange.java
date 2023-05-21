package Lesson4.homework08052023.task3;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exchange {


        public static BigDecimal convertEurToUsd(BigDecimal amount) {

            BigDecimal exchangeRate = getExchangeRateFromAPI();

            BigDecimal usdAmount = amount.multiply(exchangeRate).setScale(2, RoundingMode.HALF_UP);

            return usdAmount;
        }

        private static BigDecimal getExchangeRateFromAPI() {

            BigDecimal exchangeRate = new BigDecimal("1.22");
            return exchangeRate;
        }

        public static void main(String[] args) {
            BigDecimal amountInEur = new BigDecimal("100");
            BigDecimal amountInUsd = convertEurToUsd(amountInEur);
            System.out.println(amountInEur + " EURO = " + amountInUsd + " USD");
        }
    }