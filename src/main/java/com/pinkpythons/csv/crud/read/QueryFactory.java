package com.pinkpythons.csv.crud.read;

/**
 * Basic Query Factory
 */
public class QueryFactory {
    /**
     * Constructor from string
     *
     * @param qstring   input string
     */
    public static Query buildQuery(String qstring){
        return parseQuery(qstring);
    }

    /**
     * Set the query element
     *
     * @param query The query object
     * @param element   The element to query
     * @param operator  The operator to query against
     * @param value The value to query against
     * @return The updated query element
     */
    public static Query setQueryElement(Query query, String element, String operator, String value) throws IllegalArgumentException{
        if(element.equals("product_id")){
            query.setProductId(value);
        }else if(element.equals("quantity")){
            query.setQuantity(Integer.parseInt(value));
            if(operator.equals(">=")){
                query.setQuantityGreaterThan(true);
            }else if(operator.equals("<=")){
                query.setQuantityLessThan(true);
            }
        }else if(element.equals("wholesale_cost")){
            query.setWholesaleCost(Double.parseDouble(value));
            if(operator.equals(">=")){
                query.setWholesaleCostGreaterThan(true);
            }else if(operator.equals("<=")){
                query.setWholesaleCostLessThan(true);
            }
        }else if(element.equals("sale_price")){
            query.setSalePrice(Double.parseDouble(value));
            if(operator.equals(">=")){
                query.setSalePriceGreaterThan(true);
            }else if(operator.equals("<=")){
                query.setSalePriceLessThan(true);
            }
        }else if(element.equals("supplier_id")){
            query.setSupplierId(value);
        }else{
            throw new IllegalArgumentException("Parameter does not exist! Provide product_id, quantity, wholesale_cost, sale_price, or supplier_id");
        }
        return query;
    }

    /**
     * Parse the query string
     *
     * @param qstring   The query string
     * @return  A query object
     */
    public static Query parseQuery(String qstring) throws IllegalArgumentException{
       Query query = new Query();
       String[] queries = qstring.split(",");
       if(queries.length > 0){
           for(String qpart : queries){
               String[] qels = qpart.split("\s+");
               if(qels.length == 3){
                   String item = qels[0];
                   String operation = qels[1];
                   String value = qels[2];
                   query = setQueryElement(query, item, operation, value);
               }
           }
       }
       return query;
    }
}
