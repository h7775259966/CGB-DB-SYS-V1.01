package com.cy.pj.sys.service.impl;

import com.cy.pj.sys.dao.SysTelDao;
import com.cy.pj.sys.entity.SysTel;
import com.cy.pj.sys.service.SysTelServcie;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class SysTelServiceImpl implements SysTelServcie {


    @Autowired
    private SysTelDao sysTelDao;


    @Override
    public List<SysTel> doFindTel() {
        List<SysTel> list = sysTelDao.doFindTel();
        return list;
    }
}
