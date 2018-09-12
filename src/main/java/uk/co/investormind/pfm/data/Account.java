package uk.co.investormind.pfm.data;

import lombok.Data;
import uk.co.investormind.pfm.CompoundingFrequency;

import java.util.Currency;
import java.util.List;

@Data
public class Account {

    private String name;

    private String notes;

    private AccountType type;

    private Currency currency;

    private Double interest;

    private CompoundingFrequency frequency;

    private Country country;

    private List<FinancialRecord> records;
}
