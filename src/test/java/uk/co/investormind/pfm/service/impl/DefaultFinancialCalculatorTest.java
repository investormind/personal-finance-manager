package uk.co.investormind.pfm.service.impl;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import uk.co.investormind.pfm.data.FinancialRecord;
import uk.co.investormind.pfm.service.FinancialCalculator;

import java.time.LocalDate;
import java.util.Currency;
import java.util.Locale;

@RunWith(MockitoJUnitRunner.class)
public class DefaultFinancialCalculatorTest {

    @InjectMocks
    private FinancialCalculator financialCalculator = new DefaultFinancialCalculator();

    @Test
    public void test() {
        final FinancialRecord financialRecord = new FinancialRecord();

        Currency currency = Currency.getInstance("GBP");
        System.out.println(currency);

        Locale country = Locale.UK;

        System.out.println(country);


        FinancialRecord a = new FinancialRecord();
        a.setAmount(100.0);
        a.setDate(LocalDate.of(2018, 1, 1));

        FinancialRecord b = new FinancialRecord();
        b.setAmount(112.36);
        b.setDate(LocalDate.of(2019, 12, 30));

        FinancialRecord c = new FinancialRecord();
        c.setAmount(119.1016);
        c.setDate(LocalDate.of(2021, 1, 1));

        FinancialRecord d = new FinancialRecord();
        d.setAmount(102.9560);
        d.setDate(LocalDate.of(2018, 7, 2));


        Double x = financialCalculator.calculateNominalInterestRate(a, d);
        System.out.println(x);
        System.out.println(financialCalculator.round(x));

        Double x2 = financialCalculator.calculateNominalInterestRate(a, b);
        System.out.println(x2);
        System.out.println(financialCalculator.round(x2));

        Double x3 = financialCalculator.calculateNominalInterestRate(a, c);
        System.out.println(x3);
        System.out.println(financialCalculator.round(x3));

        System.out.println(financialCalculator.calculateFutureValue(100.0, 6.0, 182));
        System.out.println(financialCalculator.calculateFutureValue(100.0, 6.0, 365));
        System.out.println(financialCalculator.calculateFutureValue(100.0, 6.0, 730));

        Assert.assertTrue(true);
    }
}