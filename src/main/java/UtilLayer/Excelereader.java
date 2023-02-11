package UtilLayer;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import BaseLayer.Baseclass;

public class Excelereader extends Baseclass {
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public Excelereader() {
		try {
			fis = new FileInputStream("C:\\Excel Files\\Data2.xlsx");
			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public int rowcount(int sheetindex)
	{
		sheet=wb.getSheetAt(sheetindex);
		return sheet.getLastRowNum();
	}
	public String cellvalue(int sheetindex, int rowindex,int cellindex)
	{
		sheet=wb.getSheetAt(sheetindex);
		return sheet.getRow(rowindex).getCell(cellindex).getStringCellValue();
	}

}
