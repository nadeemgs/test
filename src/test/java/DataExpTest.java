/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.proj.dataExport.DataExp;
import com.mycompany.proj.dataExport.DataExpTmplt;
import com.mycompany.proj.dataExport.DataExpTmpltBuilder;
import com.mycompany.proj.entity.WebInOutTrx;
import com.mycompany.proj.service.WebService;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ultimate
 */
public class DataExpTest {

    public DataExpTest() {
    }
    private static WebService webService;
    private static List<WebInOutTrx> webInOutList;
    private DataExp dataExp = new DataExp();
    private DataExpTmplt dataTmplt = new DataExpTmplt();
    private List<DataExpTmplt> dataTmpltList = new ArrayList<DataExpTmplt>();

    @BeforeClass
    public static void setUpClass() {
        webInOutList = new ArrayList<>();
//        webInOutList.add(new WebInOutTrx(new BigDecimal("thousand")));
        
    
        
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        webInOutList.add(new WebInOutTrx(BigDecimal.ZERO, 1, 2, 2010, 3, 4, BigInteger.ZERO, BigInteger.ZERO, BigInteger.ZERO, 2, 1, 4, 44, BigDecimal.ZERO, 1, 2, 1, null, BigInteger.ONE, 3, 1, 3, 2, 2, 2, null, null));
        dataTmpltList.add(new DataExpTmplt(1, "sndrAdd", "String"));
        dataTmpltList.add(new DataExpTmplt(2, "noteToBnf", "String"));
        dataTmpltList.add(new DataExpTmplt(3, "sndrPhone", "String"));
        dataTmpltList.add(new DataExpTmplt(4, "entryUser", "String"));
        dataTmpltList.add(new DataExpTmplt(5, "sndrAdd", "String"));
        dataTmplt.setImportTemplate(dataTmpltList);
        
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getGenList method, of class DataExp.
     */
    @Test
    public void testGetWebService() {
        assertNotNull(webService);
    }

    @Test
    public void testGetWebList() {
        assertFalse(webInOutList.isEmpty());

    }

    @Test
    public void testCSVExport() throws IOException {
        assertNotNull(DataExp.exportToCsv(webInOutList,dataTmplt));
    }

    @Test
    public void testXLSExport() throws IOException, SQLException {
        assertNotNull(DataExp.exportToXLS(webInOutList,dataTmplt));
    }

    @Test
    public void testXLSXExport() throws IOException, SQLException, ClassNotFoundException {
        assertNotNull(DataExp.exportToXLSX(webInOutList,dataTmplt));
    }
}
