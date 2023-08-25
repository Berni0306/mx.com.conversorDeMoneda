package mx.com.conversorDeMoneda;

import javax.swing.JOptionPane;

public class ConverterSelection {
	public static void main(String[] args) {
		
		ConversionMath money = new ConversionMath();	
		boolean flag = true;
		while (flag) {
		
			Object[] Convertion;
			String input;
			String option = "";
			try {
				option = (JOptionPane.showInputDialog(null, "Elije la conversion que quieras realizar", 
						"Conversor de Divisas", JOptionPane.PLAIN_MESSAGE, null, new Object[] 
						{"De Euro a Dolar", "De Dolar a Euro", 
						"De Euro a Peso Mexicano", "De Peso Mexicano a Euro", 
						"De Euro a Libra Esterlina", "De Libra Esterlina a Euro",
						"De Euro a Yen Japones", "De Yen Japones a Euro",
						"De Euro a Won Surcoreano", "De Won Surcoreano a Euro"}, null)).toString();			
			} catch(NullPointerException e){
				JOptionPane.showMessageDialog(null, "Programa terminado");
				System.exit(0);
			}
			switch(option){
			case "De Euro a Dolar":
				input = JOptionPane.showInputDialog("Ingresa la cantidad que desees convertir");
				if (NumberValidation(input)) {
					double myInput = Double.parseDouble(input); 
					Convertion = money.EURtoUSD(myInput);
					JOptionPane.showMessageDialog(null, "Tienes $" + Convertion[0] + Convertion[1]);
				} else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
				break;
			case "De Dolar a Euro":
				input = JOptionPane.showInputDialog("Ingresa la cantidad que desees convertir");
				if (NumberValidation(input)) {
					double myInput = Double.parseDouble(input); 
					Convertion = money.USDtoEUR(myInput);
					JOptionPane.showMessageDialog(null, "Tienes $" + Convertion[0] + Convertion[1]);
				} else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
				break;
			case "De Euro a Peso Mexicano":
				input = JOptionPane.showInputDialog("Ingresa la cantidad que desees convertir");
				if (NumberValidation(input)) {
					double myInput = Double.parseDouble(input); 
					Convertion = money.EURtoMXN(myInput);
					JOptionPane.showMessageDialog(null, "Tienes $" + Convertion[0] + Convertion[1]);
				} else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
				break;
			case "De Peso Mexicano a Euro":
				input = JOptionPane.showInputDialog("Ingresa la cantidad que desees convertir");
				if (NumberValidation(input)) {
					double myInput = Double.parseDouble(input); 
					Convertion = money.MXNtoEUR(myInput);
					JOptionPane.showMessageDialog(null, "Tienes $" + Convertion[0] + Convertion[1]);
				} else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
				break;
			case "De Euro a Libra Esterlina":
				input = JOptionPane.showInputDialog("Ingresa la cantidad que desees convertir");
				if (NumberValidation(input)) {
					double myInput = Double.parseDouble(input); 
					Convertion = money.EURtoGBP(myInput);
					JOptionPane.showMessageDialog(null, "Tienes $" + Convertion[0] + Convertion[1]);
				} else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
				break;
			case "De Libra Esterlina a Euro":
				input = JOptionPane.showInputDialog("Ingresa la cantidad que desees convertir");
				if (NumberValidation(input)) {
					double myInput = Double.parseDouble(input); 
					Convertion = money.GBPtoEUR(myInput);
					JOptionPane.showMessageDialog(null, "Tienes $" + Convertion[0] + Convertion[1]);
				} else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
				break;
			case "De Euro a Yen Japones":
				input = JOptionPane.showInputDialog("Ingresa la cantidad que desees convertir");
				if (NumberValidation(input)) {
					double myInput = Double.parseDouble(input); 
					Convertion = money.EURtoJPY(myInput);
					JOptionPane.showMessageDialog(null, "Tienes $" + Convertion[0] + Convertion[1]);
				} else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
				break;
			case "De Yen Japones a Euro":
				input = JOptionPane.showInputDialog("Ingresa la cantidad que desees convertir");
				if (NumberValidation(input)) {
					double myInput = Double.parseDouble(input); 
					Convertion = money.JPYtoEUR(myInput);
					JOptionPane.showMessageDialog(null, "Tienes $" + Convertion[0] + Convertion[1]);
				} else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
				break;
			case "De Euro a Won Surcoreano":
				input = JOptionPane.showInputDialog("Ingresa la cantidad que desees convertir");
				if (NumberValidation(input)) {
					double myInput = Double.parseDouble(input); 
					Convertion = money.EURtoKRW(myInput);
					JOptionPane.showMessageDialog(null, "Tienes $" + Convertion[0] + Convertion[1]);
				} else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
				break;
			case "De Won Surcoreano a Euro":
				input = JOptionPane.showInputDialog("Ingresa la cantidad que desees convertir");
				if (NumberValidation(input)) {
					double myInput = Double.parseDouble(input); 
					Convertion = money.KRWtoEUR(myInput);
					JOptionPane.showMessageDialog(null, "Tienes $" + Convertion[0] + Convertion[1]);
				} else {
					JOptionPane.showMessageDialog(null, "Valor invalido");
				}
				break;
			case "":
				break;
			} 
			int retry = JOptionPane.showConfirmDialog(null, "Deseas realizar otra conversion?");
			if (JOptionPane.OK_OPTION != retry) {
				flag = false;
				JOptionPane.showMessageDialog(null, "Programa terminado");
			} 
		}
	}
	
	public static boolean NumberValidation(String value) {  
		try {
			double resultType = Double.parseDouble(value);
			if (resultType >= 0);
				return true;
	    } catch (NumberFormatException | NullPointerException e) {
	    	return false;
	    }
	}
}

