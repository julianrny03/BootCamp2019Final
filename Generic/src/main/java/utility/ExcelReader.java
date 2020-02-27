package utility;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ExcelReader {

    Cell cell = null;
    FileOutputStream fio = null;
    int numberOfRows, numberOfCol, rowNum;
    XSSFWorkbook wb;
    XSSFSheet sheet1;

    public ExcelReader(String xlsxfilepath){
        try{
            File src = new File(xlsxfilepath);
            FileInputStream fis =new FileInputStream(src);
            wb = new XSSFWorkbook(fis);
            sheet1 = wb.getSheetAt(0);
            wb.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public String getData(int sheetIndex,int rownIndex,int colIndex){
        sheet1 = wb.getSheetAt(sheetIndex);
        String data = sheet1.getRow(rownIndex).getCell(colIndex).getStringCellValue();
        System.out.println(data);
        return data;
    }
    public int getRowCount(int sheetIndex){
        int row=  wb.getSheetAt(sheetIndex).getLastRowNum();
        row = row +1;
        System.out.println(row);
        return row;
    }
}
