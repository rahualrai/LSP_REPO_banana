/**
 * Name: Rahual Rai
 */
package src.org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ETLPipeline {
    public static void main(String[] args) {
        String inputFile = "data/products.csv";
        String outputFile = "data/transformed_products.csv";
        List<Product> products = new ArrayList<>();

        // EXTRACT products from the CSV file
        // referenced from: http://www.codebind.com/java-tutorials/java-example-read-file-using-java/
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            boolean firstLine = true;

            while ((line = br.readLine()) != null) {
                if (firstLine) {
                    firstLine = false;
                    continue;
                }

                String[] values = line.split(",");
                
                int id = Integer.parseInt(values[0]);
                String name = values[1];
                double price = Double.parseDouble(values[2]);
                String category = values[3];
                products.add(new Product(id, name, price, category));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
