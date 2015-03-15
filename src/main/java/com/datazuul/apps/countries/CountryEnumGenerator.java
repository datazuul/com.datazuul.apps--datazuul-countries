package com.datazuul.apps.countries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class CountryEnumGenerator {
	public static void main(String[] args) {
		String[] countryCodes = Locale.getISOCountries();
		List<Country> list = new ArrayList<Country>(countryCodes.length);

		for (String cc : countryCodes) {
			list.add(new Country(cc.toUpperCase(), new Locale("", cc)
					.getDisplayCountry(new Locale("en"))));
		}

		Collections.sort(list);

		for (Country c : list) {
			System.out.println(c.getCode() + "(\"" + c.getName() + "\"),");
		}
		System.out.println(list.size() + " countries.");
	}
}