package com.jgsudhakar.springboot.log4j.iface.impl;

import com.jgsudhakar.springboot.log4j.entity.EmpEntity;
import com.jgsudhakar.springboot.log4j.iface.EmpIFace;
import com.jgsudhakar.springboot.log4j.repository.EmplRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*************************************
 * This Class is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.log4j.iface.impl.EmplServiceImpl
 * Date    : 14-08-2024
 * Version : 1.0
 **************************************/
@Service
@Log4j2
public class EmplServiceImpl implements EmpIFace {

    private EmplRepository emplRepository;

    public EmplServiceImpl(EmplRepository emplRepository) {
        this.emplRepository = emplRepository;
    }

    @Override
    public EmpEntity fetchById(Long id) {
        Optional<EmpEntity> byId = emplRepository.findById(id);
        return byId.isPresent() ? byId.get() : null;
    }

    @Override
    public List<EmpEntity> fetchAll() {
        log.info("Start Fetching all employees from Repository ");
        List<EmpEntity> all = emplRepository.findAll();
        log.info("End Fetching all employees from Repository ");
        return all;
    }
}
