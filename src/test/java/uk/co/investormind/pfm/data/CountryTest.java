package uk.co.investormind.pfm.data;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CountryTest {

    @Test(expected = IllegalArgumentException.class)
    public void testCountryCanNotBeInitialisedWithNullIsoCode() {
        final Country country = new Country(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCountryFieldForAnIncorrectCode() {
        new Country("XX");
    }

    @Test
    public void testCountryFieldForGB() {

        final Country country = new Country("GB");

        Assert.assertEquals("GB", country.getCountry());
        Assert.assertEquals("GBR", country.getISO3Country());
        Assert.assertEquals("United Kingdom", country.getDisplayCountry());
    }

    @Test
    public void testCountryFieldForPL() {

        final Country country = new Country("PL");

        Assert.assertEquals("PL", country.getCountry());
        Assert.assertEquals("POL", country.getISO3Country());
        Assert.assertEquals("Poland", country.getDisplayCountry());
    }
}