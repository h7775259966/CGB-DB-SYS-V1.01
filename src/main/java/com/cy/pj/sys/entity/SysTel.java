package com.cy.pj.sys.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
public class SysTel implements Serializable {

    private static final long serialVersionUID = 7844183517075129877L;

    private Integer id;
    private String name;
    private Long tel;
    private Integer telType;
    private Double pay;
    private String pid;
    private Date completeTime;
    private String remark;
}
