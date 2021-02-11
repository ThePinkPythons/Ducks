package com.theoscode;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import com.theoscode.csvData;
/*
 * @author Theo White
 * 
 */

public class CSV {

	static String fileName = "data.csv";
	static ArrayList<csvData> csvDataArrayList = new ArrayList<csvData>();
	
	/*
	 * @param used to write the cvsDataArrayList to a file
	 */
	public static void writeData(ArrayList<csvData> csvDataToWrite) throws IOException {
		String[] data = new String[] { "product_id", "quantity", "wholesale_cost", "sale_price", "supplier_id" };
		Writer writer = new FileWriter(fileName);
		CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(data));
		for (csvData record : csvDataToWrite) {
			csvPrinter.printRecord(record.product_id,record.quantity,record.wholesale_cost,record.sale_price,record.supplier_id);
		}
	}

	/*
	 * @param used to read data for the given data file
	 */
	public static void readData() throws IOException {
		try (Reader reader = new FileReader(fileName);
				CSVParser csvParser = new CSVParser(reader,
						CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim())) {
			for (CSVRecord record : csvParser) {
				String product_id = record.get("product_id");
				String quantity = record.get("quantity");
				String wholesale_cost = record.get("wholesale_cost");
				String sale_price = record.get("sale_price");
				String supplier_id = record.get("supplier_id");
				csvDataArrayList.add(new csvData(product_id, quantity, wholesale_cost, sale_price, supplier_id));

			}
		}
	}
}
