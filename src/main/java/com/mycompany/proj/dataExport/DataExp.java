/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proj.dataExport;

import au.com.bytecode.opencsv.CSVWriter;
import com.mycompany.proj.entity.WebInOutTrx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Ultimate
 */
@ManagedBean
@SessionScoped
public class DataExp implements Serializable {

    public static File exportToCsv(List<WebInOutTrx> givenList) throws IOException {
        String url = "D:\\";
        File file = new File(url); 
//        StringWriter writer = new StringWriter();
        String csv="D:\\Output.csv";
        CSVWriter csvWriter = new CSVWriter(new FileWriter(csv),',');
        List<String[]> data  = toStringArray(givenList);
        csvWriter.writeAll(data);
        csvWriter.close();
        System.out.println(csv);
        return file;       
    }
     private static List<String[]> toStringArray(List<WebInOutTrx> givenList)
     {
         List<String[]> records = new ArrayList<String[]>();
        
        records.add(new String[]{"TrxSer","frmAgentType","frmAgentNo"});
        Iterator<WebInOutTrx> it = givenList.iterator();
        while(it.hasNext()){
            WebInOutTrx trx = it.next();
            
            BigDecimal a=(BigDecimal)trx.getTrxSer();
            String str;
            str=String.valueOf(a);
            
            Long a1=(Long)trx.getFrmAgentType();
            String str1;
            str1=String.valueOf(a1);
            
            Long a2=(Long)trx.getFrmAgentNo();
            String str2;
            str2=String.valueOf(a2);
            
            Long a3=(Long)trx.getFrmAgentBrnNo();
            String str3;
            str3=String.valueOf(a3);
            
            Long a4=(Long)trx.getTrxYear();
            String str4;
            str4=String.valueOf(a4);
            
            Long a5=(Long)trx.getPymtMthd();
            String str5;
            str5=String.valueOf(a5);
            
            Long a6=(Long)trx.getTrxCurrNo();
            String str6;
            str6=String.valueOf(a6);
            
            BigInteger a7=(BigInteger)trx.getTrxAmt();
            String str7;
            str7=String.valueOf(a7);
            
            records.add(new String[]{str,str1,str2,str3,str4,trx.getRemNo(),str5,str6});
        }
        return records;
    }
    
    public static File exportToXLS(List<WebInOutTrx> givenList) throws IOException, SQLException {
        String url = "D:\\";
        File file = new File(url);
        HSSFWorkbook wb = new HSSFWorkbook();
        HSSFSheet sheet = wb.createSheet("Sample sheet");
        int rowCount = 0;
        for (WebInOutTrx trx : givenList) {
            Row row = sheet.createRow(rowCount++);
            writeBook(trx, row);
        }

        FileOutputStream out = new FileOutputStream(new File("D:\\Result.xls"));
        {
            wb.write(out);
            out.close();
        }
        return file;
    }

    private static void writeBook(WebInOutTrx trx, Row row) throws FileNotFoundException, IOException {
        Cell cell = row.createCell(0);
        cell.setCellValue(trx.getFrmAgentType());
        cell = row.createCell(1);
        cell.setCellValue(trx.getFrmAgentNo());
        cell = row.createCell(2);
        cell.setCellValue(trx.getAmendFlag());
        cell=row.createCell(3);
        cell.setCellValue(trx.getTrxSer().toString());
    }

    public static File exportToXLSX(List<WebInOutTrx> givenList ) throws FileNotFoundException, IOException {
        String url = "D:\\";
        File file = new File(url);
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet("new sheet");
        int rowCount = 0;
        for (WebInOutTrx trx : givenList) {
            Row row = sheet.createRow(rowCount++);
            writeBook(trx, row);
        }

        FileOutputStream out = new FileOutputStream(new File("D:\\print.xlsx"));
        {
            wb.write(out);
            out.close();
        }
        return file;
    }

}
        
   

        

       
    


   

