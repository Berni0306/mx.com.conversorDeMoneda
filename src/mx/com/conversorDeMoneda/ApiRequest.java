package mx.com.conversorDeMoneda;

import java.net.URI;
import java.net.HttpURLConnection;
import java.util.Scanner;

import javax.swing.JOptionPane;

import org.json.JSONObject;

public class ApiRequest {
	public static double Request(String currency) {
		
		double rate = 1.0;
		try {
			String urlString = "http://data.fixer.io/api/latest"
					+ "?access_key=015a6661186567398f92313e3b223fc2"
					+ "&base=EUR"
					+ "&symbols="
					+ currency;
			URI url = new URI(urlString);
			HttpURLConnection conn = (HttpURLConnection) url.toURL().openConnection();
			conn.setRequestMethod("GET");
			conn.connect();
			int responseCode = conn.getResponseCode();
			if (responseCode != 200) {
				throw new RuntimeException("Ocurrio un error" + responseCode);
			} else {
				StringBuilder infoString = new StringBuilder();
				Scanner scanner = new Scanner(url.toURL().openStream());
				while (scanner.hasNext()) {
					infoString.append(scanner.nextLine());
				}
				scanner.close();
				JSONObject jsonObject = new JSONObject(infoString.toString());
				rate = jsonObject.getJSONObject("rates").getDouble(currency);
			}
		} catch (Exception e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se pudo extablecer la conexion con la API \nRevise su conexion a internet");
			JOptionPane.showMessageDialog(null, "Programa terminado");
			System.exit(0);
		}
		return rate;
	}
}
