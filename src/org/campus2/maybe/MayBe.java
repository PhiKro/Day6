package org.campus2.maybe;


public class MayBe<T> 
	{
	private T data;
	private int status;
	
	public MayBe(T data, int status) {
		this.data = data;
		this.status = status;
	}

	public static final int ZugriffErlaubt =1;
	public static final int ZugriffVerboten =2;
	public static final int KeineDaten = 3;

	public void setData(T data) {
		this.data = data;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	public void Maybeprint() 
	{
		switch (status) 
		{
		case ZugriffErlaubt:
			System.out.println("Acces granted: " +data );
			break;
		case ZugriffVerboten:
			System.out.println("Acces denied");
			break;
		case KeineDaten:
			System.out.println("No Data");
			break;
		default:
			System.out.println("Ivalid Status");
			break;
		}
	}
}
	


