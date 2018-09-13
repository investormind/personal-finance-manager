package uk.co.investormind.pfm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import uk.co.investormind.pfm.dao.FinancialRecordRepository;
import uk.co.investormind.pfm.data.FinancialRecord;

import java.time.LocalDate;

@RestController
public class FinancialRecordController {

    @Autowired
    private FinancialRecordRepository repository;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/financial-record", method = RequestMethod.POST)
    public String createFinancialRecord() {

        final FinancialRecord financialRecord = new FinancialRecord();
        financialRecord.setAmount(1000.0);
        financialRecord.setDate(LocalDate.now());

        repository.save(financialRecord);

        return "";
    }
}