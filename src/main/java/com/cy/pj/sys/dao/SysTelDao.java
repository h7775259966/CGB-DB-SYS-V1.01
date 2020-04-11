package com.cy.pj.sys.dao;

import com.cy.pj.sys.entity.SysTel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysTelDao {
    List<SysTel> doFindTel();
}
