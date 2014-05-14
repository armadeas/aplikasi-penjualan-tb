/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.smktarunabhakti.penjualan.service.impl;

import net.smktarunabhakti.penjualan.dao.BarangDao;
import net.smktarunabhakti.penjualan.domain.Barang;
import net.smktarunabhakti.penjualan.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author armadeas
 */
@SuppressWarnings("unchecked")
@Service("appService")
@Transactional
public class AppServiceImpl implements AppService{

    @Autowired
    public BarangDao barangDao;
    @Override
    public void simpanBarang(Barang b) {
        barangDao.save(b);
    }
    
    @Override
    public void hapusBarang(Barang b) {

    }

    @Override
    public Page<Barang> cariSemuaBarang(Pageable p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Barang cariBarangById(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Long countSemuaBarang() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
