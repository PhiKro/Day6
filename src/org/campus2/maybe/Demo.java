package org.campus2.maybe;

import java.util.GregorianCalendar;

public class Demo {


	public static void main(String[] args) {

		MayBe<String> Name = new MayBe<String> ("Test",MayBe.ZugriffErlaubt);
		
		Name.Maybeprint();
		//Name.setStatus(MayBe.ZugriffVerboten);
		Name.Maybeprint();
		MayBe<Integer> gehalt = 
				new MayBe<Integer> 
			(1000,MayBe.ZugriffErlaubt); // (new Integer(1000),MayBe.ZugriffErlaubt);
		gehalt.Maybeprint();
		
		MayBe<GregorianCalendar> Geb= 
				new MayBe<GregorianCalendar>
			(new GregorianCalendar(2015,10,10),MayBe.ZugriffErlaubt);
		Geb.Maybeprint();

	}

}
