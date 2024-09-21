package com.jgsudhakar.springboot.log4j.resource;

import com.jgsudhakar.springboot.log4j.entity.EmpEntity;
import com.jgsudhakar.springboot.log4j.iface.EmpIFace;
import com.jgsudhakar.springboot.log4j.iface.impl.EmplServiceImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*************************************
 * This Class is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.log4j.resource.EmpResource
 * Date    : 20-09-2024
 * Version : 1.0
 **************************************/
@RestController
@RequestMapping("api/emp")
@Log4j2
public class EmpResource {

    public EmpIFace empIFace;

    public EmpResource(EmplServiceImpl emplService) {
        this.empIFace = emplService;
    }

    @GetMapping("")
    public List<EmpEntity> fetchAllEmps() {
        log.info("Started Fetching All Employees");
        List<EmpEntity> empEntities = this.empIFace.fetchAll();
        log.info("ENd Fetching All Employees. Total Employees Size :: {} ",empEntities.size());
        return empEntities;
    }
}
