package com.cy.pj.sys.controller;

import com.cy.pj.common.vo.JsonResult;
import com.cy.pj.sys.service.SysTelServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tel/")
public class SysTelController {

    @Autowired
    private SysTelServcie sysTelService;


    @RequestMapping("doFindTel")
    public JsonResult doFindTel(){
        return new JsonResult(sysTelService.doFindTel());}
}
