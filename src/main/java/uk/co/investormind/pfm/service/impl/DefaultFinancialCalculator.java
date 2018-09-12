package uk.co.investormind.pfm.service.impl;

import uk.co.investormind.pfm.data.FinancialRecord;
import uk.co.investormind.pfm.service.FinancialCalculator;

import static java.time.temporal.ChronoUnit.DAYS;

public class DefaultFinancialCalculator implements FinancialCalculator {

    @Override
    public Double calculateNominalInterestRate(final FinancialRecord from, final FinancialRecord to) {

        final Double presentValue = from.getAmount();
        final Double futureValue = to.getAmount();

        final Long daysDelta = DAYS.between(from.getDate(), to.getDate());
        final Double yearsDelta = daysDelta / 365.25;

        final Double interest = (100 * Math.pow((futureValue / presentValue), (1.0 / yearsDelta))) - 100;

        return interest;
    }

    public Double calculateFutureValue(final Double presentValue, final Double interest, final Integer days) {

        final Double yearDelta = days / 365.25;
        final Double futureValue = presentValue * Math.pow (((100.0+interest)/100.0), yearDelta);

        return futureValue;
    }

        @Override
    public Double round(final Double value) {
        return 1.0 * Math.round(100 * value) / 100;
    }


}
