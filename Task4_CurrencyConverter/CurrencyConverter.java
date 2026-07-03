package Task4_CurrencyConverter;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("====== Currency Converter ======");

            System.out.print("Enter Base Currency (USD, INR, EUR): ");
            String base = sc.next().toUpperCase();

            System.out.print("Enter Target Currency (USD, INR, EUR): ");
            String target = sc.next().toUpperCase();

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            String apiUrl = "https://open.er-api.com/v6/latest/" + base;

            URL url = new URL(apiUrl);

            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));

            String inputLine;
            StringBuilder response = new StringBuilder();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }

            in.close();

            String json = response.toString();

            String search = "\"" + target + "\":";

            int index = json.indexOf(search);

            if (index != -1) {

                int start = index + search.length();

                int end = json.indexOf(",", start);

                if (end == -1)
                    end = json.indexOf("}", start);

                double rate = Double.parseDouble(json.substring(start, end));

                double converted = amount * rate;

                System.out.println("\n==========================");
                System.out.println("Exchange Rate : " + rate);
                System.out.println("Converted Amount : " + converted + " " + target);

            } else {

                System.out.println("Currency not found!");

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        sc.close();

    }

}
