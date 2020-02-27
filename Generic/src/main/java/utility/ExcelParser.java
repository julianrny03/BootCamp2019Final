package utility;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
public class ExcelParser {

    private Workbook workbook;
    private Sheet sheet;

    public ExcelParser(String fileName, String sheetName) {
        System.out.println(fileName);
        try {
            File file = new File(fileName);
            System.out.println(file.getAbsolutePath());
            if (fileName.indexOf("xlsx") < 0) {
                workbook = new HSSFWorkbook(new FileInputStream(file));
                sheet = workbook.getSheet(sheetName);
            } else {
                workbook = new XSSFWorkbook(fileName);
                sheet = (XSSFSheet) workbook.getSheet(sheetName);
            }
        } catch (IOException io) {
            throw new Error(
                    "Invalid file '" + fileName + "' or incorrect sheet '" + sheetName + "', enter a valid one");
        }
    }
    public String getCell(int rowIndex, int columnIndex) {
        String cellValue = null;
        try {
            cellValue = workbook.getSheetAt(columnIndex).getRow(rowIndex).toString();

        } catch (Exception e) {
            throw new Error(
                    "The cell with row '" + rowIndex + "' and column '" + columnIndex + "' doesn't exist in the sheet");
        }
        return cellValue;
    }

    public static void main(String[] args) {
        ExcelParser parsingExcel = new ExcelParser("testFile.xlsx","Items");
        String value = parsingExcel.getCell(0,1);
        System.out.println(value);
    }
}
