package br.com.drools.pricing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;

public class ConvertXmlsToDrl {
	
	
	public static void main(String args[]) {
		InputStream is = null;
		try {

			is = new FileInputStream("src/main/resources/br/com/drools/pricing/g3/flight_g3_milesConverter.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// create compiler class instance
		SpreadsheetCompiler sc = new SpreadsheetCompiler();
		// compile the excel to generate the (.drl) file
		String drl = sc.compile(is, InputType.XLS);
		// check the generated (.drl) file
		System.out.println("Generate DRL file is –: ");
		System.out.println(drl);
	}
	
}