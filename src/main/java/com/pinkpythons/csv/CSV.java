package com.pinkpythons.csv;
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

/**
 * The CSV class
 *
 * @author Theo White
 *
 */
public class CSV {

	public static String fileName = "data.csv";
	public static ArrayList<CsvData> CsvDataArrayList = new ArrayList<CsvData>();

	/**
	 * Writes CSV Data to a file.
	 *
	 * @param CsvDataToWrite 	Used to write the cvsDataArrayList to a file
	 * @param outputFileName 	The output file name
	 */
	public static void writeData(ArrayList<CsvData> CsvDataToWrite, String outputFileName) throws IOException {
		String[] data = new String[] { "product_id", "quantity", "wholesale_cost", "sale_price", "supplier_id" };
		Writer writer = new FileWriter(fileName);
		CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT.withHeader(data));
		for (CsvData record : CsvDataToWrite) {
			csvPrinter.printRecord(record.product_id,record.quantity,record.wholesale_cost,record.sale_price,record.supplier_id);
		}
	}

	/**
	 * Reads the data Puts it into the CSV data store.
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
				CsvDataArrayList.add(new CsvData(product_id, quantity, wholesale_cost, sale_price, supplier_id));
			}
		}
	}
}
