package com.yaoge.reflection;

public class PublicClass {
	
	private static int privateStaticInt=0;	
	public static int publicStaticInt=0;
	
	private static String privateStaticString="the total count is little than 5.";
	public static String publicStaticString="";
	
	private int privateInt;
	public int publicInt;
	
	private String privateString;
	public String publicString;
	
	{
		privateStaticInt++;
		if (privateStaticInt>5) {
			privateStaticString="the total count is more than 5.";
		}
		System.out.println("This is No."+privateStaticInt +" instance and "+privateStaticString);
	}
	
	public PublicClass() {
		super();
	}

	public PublicClass(int privateInt, String privateString) {
		super();
		this.privateInt = privateInt;
		this.privateString = privateString;
	}

	public PublicClass(int privateInt, int publicInt, String privateString,
			String publicString) {
		super();
		this.privateInt = privateInt;
		this.publicInt = publicInt;
		this.privateString = privateString;
		this.publicString = publicString;
	}
	
	public static PublicClass newAnInstance(int privateInt, String privateString){
		return new PublicClass(privateString, privateInt);
	}
	
	private PublicClass(String privateString,int privateInt) {
		super();
		this.privateInt = privateInt;
		this.privateString = privateString;
	}	

	public int getPrivateInt() {
		return privateInt;
	}

	public void setPrivateInt(int privateInt) {
		this.privateInt = privateInt;
	}

	public String getPrivateString() {
		return privateString;
	}

	public void setPrivateString(String privateString) {
		this.privateString = privateString;
	}

	@Override
	public String toString() {
		return privateGenerateToString();
	}
	
	private String privateGenerateToString(){
		return "PublicClass [privateInt=" + privateInt + ", publicInt="
				+ publicInt + ", privateString=" + privateString
				+ ", publicString=" + publicString + "]";
	}
	
	public String publicGenerateToString(){
		return "PublicClass [privateInt=" + privateInt + ", publicInt="
				+ publicInt + ", privateString=" + privateString
				+ ", publicString=" + publicString + "]";
	}
}