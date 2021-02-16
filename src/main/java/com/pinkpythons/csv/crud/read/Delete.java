package com.pinkpythons.csv.crud.read;
import com.pinkpythons.csv.CSV;
import com.pinkpythons.csv.CsvData;

import java.util.ArrayList;


/**
 * Delete Class
 *
 */

public class Delete {

    public String product_ID;

    public static void question() {
        System.out.println("\nYou have chosen Delete!");
        System.out.println("\nPlease enter the ID of the product you are trying to remove:");
        String desiredID = main.input.next();
        Query target = new Query();
        target.setProductId(desiredID);
        ArrayList<CsvData> dataList = ReadData.select(target);
        for (CsvData data : dataList) {
            if (data.getProduct_id() == desiredID) {
                CSV.CsvDataArrayList.remove(data);
            }
        }
    }
}
