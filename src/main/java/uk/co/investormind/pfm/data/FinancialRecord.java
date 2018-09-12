package uk.co.investormind.pfm.data;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class FinancialRecord extends GenericObject {

    private Double amount;

    private LocalDate date;

    private List<FinancialRecord> historyRecords;
}
