package com.datazuul.apps.countries;

import java.net.URL;

import javax.swing.ImageIcon;

public class Country implements Comparable<Country> {
	private String name;
	private ImageIcon flagIcon;
	private URL path;
	private String code;

	public Country() {
	}

	public Country(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public Country(String name, URL path) {
		this.name = name;
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ImageIcon getFlagIcon() {
		// Lazily load flag icon. Make sure that each country's flag icon is
		// loaded only once.

		if (flagIcon == null)
			flagIcon = new ImageIcon(path);
		return flagIcon;
	}

	public void setFlagIcon(ImageIcon flagIcon) {
		this.flagIcon = flagIcon;
	}

	public URL getPath() {
		return path;
	}

	public void setPath(URL path) {
		this.path = path;
	}

	@Override
	public int compareTo(Country o) {
		return this.name.compareTo(o.name);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}