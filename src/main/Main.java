package main;

import enums.Browser;

import exceptions.ActionException;
import testCases.SearchHexawareInGoogle;
import utilities.Do;
import utilities.Driver;

public class Main {
	public static void main(String args[]) {
		Driver.Open(Browser.CHROME);
		
		try {
			SearchHexawareInGoogle.execute();
		} catch (ActionException e) {
			e.getMessage();
		}
		Driver.Close();
	}

}
