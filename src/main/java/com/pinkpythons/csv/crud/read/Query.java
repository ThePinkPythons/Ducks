package com.pinkpythons.csv.crud.read;

/**
 * Query class for the select operation
 */
public class Query {
    private String productId;
    private boolean quantityGreaterThan;
    private boolean quantityLessThan;
    private Integer quantity;
    private boolean wholesaleCostGreaterThan;
    private boolean wholesaleCostLessThan;
    private Double wholesaleCost;
    private boolean salePriceGreaterThan;
    private boolean salePriceLessThan;
    private Double salePrice;
    private String supplierId;

    /**
     * Constructor
     */
    public Query(){
        this.wholesaleCost = -1.0;
        this.salePrice = -1.0;
        this.quantity = -1;
    }

    /**
     * Get the product id
     *
     * @return  The product id
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Set the product id
     *
     * @param productId The product id
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Get the quantity
     *
     * @return The quantity
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Set the quantity
     *
     * @param quantity  The quantity
     */
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Get the wholesale cost
     *
     * @return  The wholesale cost
     */
    public Double getWholesaleCost() {
        return wholesaleCost;
    }

    /**
     * Set the wholesale cost
     *
     * @param wholesaleCost The wholesale cost
     */
    public void setWholesaleCost(Double wholesaleCost) {
        this.wholesaleCost = wholesaleCost;
    }

    /**
     * Check if the quantity is greater than
     *
     * @return  If the quantity is greater than
     */
    public boolean isQuantityGreaterThan() {
        return quantityGreaterThan;
    }

    /**
     * Set the quantity.
     *
     * @param quantityGreaterThan   Whether the quantity is greater
     */
    public void setQuantityGreaterThan(boolean quantityGreaterThan) {
        this.quantityGreaterThan = quantityGreaterThan;
    }

    /**
     * Check whether the quantity is less than
     *
     * @return  If the quantity is less than
     */
    public boolean isQuantityLessThan() {
        return quantityLessThan;
    }

    /**
     * Set whether the quantity is less than
     *
     * @param quantityLessThan  The quantity to be less than
     */
    public void setQuantityLessThan(boolean quantityLessThan) {
        this.quantityLessThan = quantityLessThan;
    }

    /**
     * Check if hte wholesale price is greater than
     *
     * @return  If the wholesale price is to be grater than
     */
    public boolean isWholesaleCostGreaterThan() {
        return wholesaleCostGreaterThan;
    }

    /**
     * Set whether the wholesale cost is greater than
     *
     * @param wholesaleCostGreaterThan  Whether the wholesle cost is greater than
     */
    public void setWholesaleCostGreaterThan(boolean wholesaleCostGreaterThan) {
        this.wholesaleCostGreaterThan = wholesaleCostGreaterThan;
    }

    /**
     * Whther the wholesale cost is less than
     *
     * @return  Whether the wholesale cost is less than
     */
    public boolean isWholesaleCostLessThan() {
        return wholesaleCostLessThan;
    }

    /**
     * Set whether the wholesle cost is less than
     *
     * @param wholesaleCostLessThan Whether the wholesale cost is less than
     */
    public void setWholesaleCostLessThan(boolean wholesaleCostLessThan) {
        this.wholesaleCostLessThan = wholesaleCostLessThan;
    }

    /**
     * Wehther the wholesale price is greater than
     *
     * @return  Whether the wholesale price is greater than
     */
    public boolean isSalePriceGreaterThan() {
        return salePriceGreaterThan;
    }

    /**
     * Whether the sale price is less than
     *
     * @param salePriceGreaterThan  Set whether the sale price is less than
     */
    public void setSalePriceGreaterThan(boolean salePriceGreaterThan) {
        this.salePriceGreaterThan = salePriceGreaterThan;
    }

    public boolean isSalePriceLessThan() {
        return salePriceLessThan;
    }

    public void setSalePriceLessThan(boolean salePriceLessThan) {
        this.salePriceLessThan = salePriceLessThan;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }
}
