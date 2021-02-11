package com.pinkpythons.csv.crud.read;

import com.pinkpythons.csv.CSV;
import com.pinkpythons.csv.CsvData;

import java.util.ArrayList;

/**
 * Class to read data
 */
public class ReadData {

    /**
     * Whether the supplier id is correct. Returns true if there is no
     * check provided or the string match exactly.
     *
     * @param query The query to run
     * @param data  The csv data
     * @return  Whether the supplier id matches.
     */
    public static boolean isSupplierIdCorrect(Query query, CsvData data){
        if(query.getSupplierId() != null){
            String qSid = query.getSupplierId();
            String cSid = data.getSupplier_id();
            if(cSid != null){
                if(cSid.equals(qSid)){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return true;
        }
    }

    /**
     * Checks whether the sales price is correct based on query information.
     * If the price is, it returns true. If not set or less than zero, returns
     * true.
     *
     * @param query The query dta
     * @param data  The csv data
     * @return  Whether the sale price is correct
     */
    public static boolean isSalePriceCorrect(Query query, CsvData data){
        if(query.getSalePrice() >= 0){
            String csvPrice = data.getSale_price();
            double qPrice = query.getSalePrice();
            if(csvPrice != null){
                double cPrice = Double.parseDouble(csvPrice);
                if(query.isSalePriceGreaterThan() && qPrice > cPrice){
                    return true;
                }else if(query.isSalePriceLessThan() && qPrice < cPrice){
                    return true;
                }else if(qPrice == cPrice){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return true;
        }
    }

    /**
     * Check if the wholesale cost is correct.
     *
     * @param query The query to run
     * @param data  The csv data
     * @return  Whether the quantities match
     */
    public static boolean isWholesaleCostCorrect(Query query, CsvData data){
        if(query.getWholesaleCost() >= 0){
            double qCost = query.getWholesaleCost();
            String csvCost = data.getWholesale_cost();
            if(csvCost != null){
                double cCost = Double.parseDouble(csvCost);
                if(query.isWholesaleCostGreaterThan() && cCost > qCost){
                    return true;
                }else if(query.isWholesaleCostLessThan() && cCost < qCost){
                    return true;
                }else if(cCost == qCost){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return true;
        }
    }

    /**
     * Checks that the quantity matches the target quantity if in the query.
     * If not in the query returns true.
     *
     * @param query The query
     * @param data  The data
     * @return  Whether the quantities match
     */
    public static boolean isQuantityCorrect(Query query, CsvData data){
        if(query.getQuantity()  >= 0){
            Integer qQuantity = query.getQuantity();
            String csvQuantity = data.getQuantity();
            if(csvQuantity != null){
                Integer csvInt = Integer.parseInt(csvQuantity);
                if(query.isQuantityGreaterThan() && csvInt > qQuantity){
                    return true;
                }else if(query.isQuantityLessThan() && csvInt < qQuantity){
                    return true;
                }else if(csvInt == qQuantity){
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return true;
        }
    }

    /**
     * Checks the product ID if set in a query. If not in the query
     * returns true. Otherwise, returns whether this part succeeds.
     * Nulls return false if not in the query.
     *
     * @param query The query object
     * @param data  The dta to check
     * @return Whether the product is equal
     */
    public static boolean isProductIdEquals(Query query, CsvData data){
        if(query.getProductId() != null){
            String targetProductId = query.getProductId();
            String productId = data.getProduct_id();
            if(productId != null) {
                if (productId.equals(targetProductId)) {
                    return true;
                } else {
                    return false;
                }
            }else{
                return false;
            }
        }else{
            return true;
        }
    }

    /**
     * The filter for the search. Calls the individual filters
     * to ensure that each piece of data is correct in one loop.
     *
     * @param query The query
     * @return  Anothe arraylist of matching CSV Data.
     */
    public static ArrayList<CsvData> filter(Query query){
        ArrayList<CsvData> outputData = new ArrayList<>();
        for(CsvData data : CSV.CsvDataArrayList){
            if(isProductIdEquals(query, data)
                    && isQuantityCorrect(query, data)
                    && isSupplierIdCorrect(query, data)
                    && isWholesaleCostCorrect(query, data)
                    && isSalePriceCorrect(query, data)){
                outputData.add(data);
            }
        }
        return outputData;
    }

    /**
     * Performs a select operation. Takes in a query operation and
     * returns a new array list of values.
     *
     * @param query The query to check against
     * @return  The array list of matching data
     */
    public static ArrayList<CsvData> select(Query query){
        ArrayList<CsvData> outputData = filter(query);
        return outputData;
    }
}
