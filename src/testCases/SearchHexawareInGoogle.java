package testCases;

import Pages.Google;
import enums.Action;
import enums.Expected;
import exceptions.ActionException;
import utilities.Do;
import utilities.Wait;

public class SearchHexawareInGoogle {

	public static void execute() throws ActionException {

		Do.action(Action.NAVIGATE, "www.google.com");
		
		Do.action(Action.TYPE, "Hexaware", Google.txt_SearchBar());
		Wait.Explicit(Expected.ELEMENT_TO_BE_CLICKABLE, 5, Google.btn_Search());
		Do.action(Action.CLICK, Google.btn_Search());
		if(Do.action(Action.VERIFY_IF_EXIST, Google.lbl_FirstResult())) {
			System.out.println("Contains");
		}else {
			System.out.println("Not Contains");
		}
		
	}

}
