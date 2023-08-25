package mx.com.conversorDeMoneda;

public class ConversionMath {
	public Object[] EURtoUSD(double value) {
		double resultValue = value * ApiRequest.Request("USD");
		resultValue = (double) Math.round(resultValue * 100d)/100; 
		String currency = " Dolares";
		return new Object[] {resultValue, currency};		
	}
		
	public Object[] USDtoEUR(double value) {
		double resultValue = value / ApiRequest.Request("USD");
		resultValue = (double) Math.round(resultValue * 100d)/100;
		String currency = " Euros";
		return new Object[] {resultValue, currency};		
	}
	
	public Object[] EURtoMXN(double value) {
		double resultValue = value * ApiRequest.Request("MXN");
		resultValue = (double) Math.round(resultValue * 100d)/100; 
		String currency = " Pesos Mexicanos";
		return new Object[] {resultValue, currency};		
	}
		
	public Object[] MXNtoEUR(double value) {
		double resultValue = value / ApiRequest.Request("MXN");
		resultValue = (double) Math.round(resultValue * 100d)/100;
		String currency = " Euros";
		return new Object[] {resultValue, currency};		
	}
	
	public Object[] EURtoGBP(double value) {
		double resultValue = value * ApiRequest.Request("GBP");
		resultValue = (double) Math.round(resultValue * 100d)/100; 
		String currency = " Libras Esterlinas";
		return new Object[] {resultValue, currency};		
	}
		
	public Object[] GBPtoEUR(double value) {
		double resultValue = value / ApiRequest.Request("GBP");
		resultValue = (double) Math.round(resultValue * 100d)/100;
		String currency = " Euros";
		return new Object[] {resultValue, currency};		
	}
	
	public Object[] EURtoJPY(double value) {
		double resultValue = value * ApiRequest.Request("JPY");
		resultValue = (double) Math.round(resultValue * 100d)/100; 
		String currency = " Yenes Japoneses";
		return new Object[] {resultValue, currency};		
	}
		
	public Object[] JPYtoEUR(double value) {
		double resultValue = value / ApiRequest.Request("JPY");
		resultValue = (double) Math.round(resultValue * 100d)/100;
		String currency = " Euros";
		return new Object[] {resultValue, currency};		
	}
	
	public Object[] EURtoKRW(double value) {
		double resultValue = value * ApiRequest.Request("KRW");
		resultValue = (double) Math.round(resultValue * 100d)/100; 
		String currency = " Wons Surcoreanos";
		return new Object[] {resultValue, currency};		
	}
		
	public Object[] KRWtoEUR(double value) {
		double resultValue = value / ApiRequest.Request("KRW");
		resultValue = (double) Math.round(resultValue * 100d)/100;
		String currency = " Euros";
		return new Object[] {resultValue, currency};		
	}
}

