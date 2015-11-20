/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proj.dao;



import com.mycompany.proj.entity.WebInOutTrx;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ultimate
 */
public interface IWebDao extends CrudRepository<WebInOutTrx, Long>
{
    @Query
    List<WebInOutTrx> getAll();
}