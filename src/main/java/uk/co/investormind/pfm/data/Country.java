package uk.co.investormind.pfm.data;

import java.util.Locale;
import java.util.Objects;

import static java.util.Arrays.asList;

public class Country {

    private static final String DEFAULT_LANGUAGE = "en";

    private Locale locale;

    public Country(final String isoCode) {
        if (!asList(Locale.getISOCountries()).contains(isoCode)) {
            throw new IllegalArgumentException(String.format("Country does not exist: ", isoCode));
        }

        locale = new Locale(DEFAULT_LANGUAGE, isoCode);
    }

    public String getDisplayCountry() {
        return locale.getDisplayCountry();
    }

    public String getISO3Country() {
        return locale.getISO3Country();
    }

    public String getCountry() {
        return locale.getCountry();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Country country = (Country) o;
        return Objects.equals(locale.getISO3Country(), country.locale.getISO3Country());
    }

    @Override
    public int hashCode() {
        return Objects.hash(locale.getISO3Country());
    }

    @Override
    public String toString() {
        return locale.getCountry();
    }
}
