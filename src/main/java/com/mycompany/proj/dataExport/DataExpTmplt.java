/*
 * Copyright (c) 2013 YemenSoft. All rights reserved.
 * YemenSoft PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */


package com.mycompany.proj.dataExport;

import java.io.Serializable;
import java.util.List;

/**
 * @author Nadeem Shukoor
 * @copyright YemenSoft
 */
public class DataExpTmplt implements Serializable {
    
 // Following is the vesion of the Class, currently it is first version.
//  Note that any feild or Methods changes made should be incremented with version
//  Once the version is incremented all previously serialized objects will be invalid
    public static final long serialVersionUID = 1L;
    
    private Integer coloumnIndex;
    private String fieldName;
    private String fieldType;
  

    List<DataExpTmplt> importTemplate;

    public List<DataExpTmplt> getImportTemplate() {
        return importTemplate;
    }

    public void setImportTemplate(List<DataExpTmplt> importTemplate) {
        this.importTemplate = importTemplate;
    }
    public DataExpTmplt(){
         
     }
    public DataExpTmplt(Integer cIndex,String fName,String fType){
        this.coloumnIndex=cIndex;
        this.fieldName=fName;
        this.fieldType=fType;
    }
    
    public Integer getColoumnIndex() {
        return coloumnIndex;
    }
//    Apache POI Index is 0 based Index, But the remittanceAdmin UI the Index is started at 1
//    so reduce the column value fed at Remittance Admin by 1
    public Integer getPOIColumnIndex(){
        int temp=coloumnIndex-1;
        return temp;
    }

    public void setColoumnIndex(Integer coloumnIndex) {
        this.coloumnIndex = coloumnIndex;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }
    
    public DataExpTmplt getTypesAtColumnIndex(Integer colIndex){
        if(importTemplate==null||importTemplate.isEmpty()){
            return null;
        }
        for (DataExpTmplt currentTemplateVO : importTemplate) {
            if(currentTemplateVO.getPOIColumnIndex().equals(colIndex)){
                return currentTemplateVO;
            }
        }
        return null;
    }

  
    
    

}
