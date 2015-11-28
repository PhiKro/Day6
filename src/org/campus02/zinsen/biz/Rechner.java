package org.campus02.zinsen.biz;

public class Rechner {
	public static double berechen(double kapital, double zinsen, int tage){
	return (kapital*zinsen*tage/36000.0);		
	}
}