package com.pinkpythons.csv.crud.read;

import com.pinkpythons.csv.CSV;
import com.pinkpythons.csv.CsvData;


public class Update {

    public static void question(String desiredID, String quantity, String wholesaleCost, String salePrice, String supplierID) {

        for (CsvData data : CSV.CsvDataArrayList) {
            if (data.getProduct_id() == desiredID) {
                data.setWholesale_cost(wholesaleCost);
                data.setSupplier_id(supplierID);
                data.setSale_price(salePrice);
                data.setQuantity(quantity);
            }
        }
    }
}
