/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proj.service;


import com.mycompany.proj.dao.IWebDao;
import com.mycompany.proj.entity.WebInOutTrx;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Ultimate
 */
@Service
@Transactional
public class WebService 
{
    @Autowired
    private IWebDao webRep;

    public IWebDao getWebRep() {
        return webRep;
    }

    public void setGenRep(IWebDao webRep) {
        this.webRep = webRep;
    }
    
    public List<WebInOutTrx> getAllCity()
    {
        if(this.getWebRep()==null)
        {
            return null;
        }
        return this.getWebRep().getAll();
    }
    
}
