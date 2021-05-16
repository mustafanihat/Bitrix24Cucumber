package com.nextbasecrm.utilities;

public class ExcelRowCreator {
    public static void main(String[] args) {
        com.nextbasecrm.utilities.ExcelUtil excelUtil = new com.nextbasecrm.utilities.ExcelUtil("src/test/resources/Vytracktestdata.xlsx","QA1-all");
        excelUtil.printCucumberRowIndex();
    }
}
