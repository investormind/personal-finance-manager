package uk.co.investormind.pfm.service;

import uk.co.investormind.pfm.data.FinancialRecord;

public interface FinancialCalculator {
    Double calculateNominalInterestRate(final FinancialRecord from, final FinancialRecord to);
    Double calculateFutureValue(final Double presentValue, final Double interest, final Integer days);
    Double round(final Double value);
}
