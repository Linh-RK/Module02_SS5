package ra.entity;

import java.util.Scanner;

public class Categories {
        int catalogId;
        String catalogName;
        String descriptions;
        Boolean catalogStatus;
    public Categories() {
    }

    public Categories(int catalogId, String catalogName, String descriptions, Boolean catalogStatus) {
        this.catalogId = catalogId;
        this.catalogName = catalogName;
        this.descriptions = descriptions;
        this.catalogStatus = catalogStatus;
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Boolean getCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(Boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }
//    --------------
    public static void inputData(Scanner scanner, Categories[] arrCategories, int currentCate){

    }
//    --------------
    public static void displayData(){

    }

}
