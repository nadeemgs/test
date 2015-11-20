/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proj.managedBean;
import com.mycompany.proj.entity.WebInOutTrx;
import com.mycompany.proj.service.WebService;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Ultimate
 */
@ManagedBean
@SessionScoped
public class WebMB 
{
    @ManagedProperty(value="#{webService}")
    private WebService webService;

     
    public WebService getWebService() {
        return webService;
    }

    public void setWebService(WebService webService) {
        this.webService = webService;
    }
    
    List<WebInOutTrx> webList=null;
    
    public List<WebInOutTrx> getWebList()
    {
        if(webList==null || webList.isEmpty())
            if(this.getWebService()!=null)
                webList=this.getWebService().getAllCity();
        return webList;
    }
}
