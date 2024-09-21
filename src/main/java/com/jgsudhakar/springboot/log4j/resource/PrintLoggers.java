package com.jgsudhakar.springboot.log4j.resource;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*************************************
 * This Class is used to 
 * Author  : Sudhakar Tangellapalli
 * File    : com.jgsudhakar.springboot.log4j.resource.PrintLoggers
 * Date    : 21-09-2024
 * Version : 1.0
 **************************************/
@RestController
@RequestMapping("api/loggers")
@Log4j2
public class PrintLoggers {

    @GetMapping("")
    public void printAllLogLevels() {
        log.debug("This is a debug message");
        log.info("This is an info message");
        log.warn("This is a warn message");
        log.error("This is an error message");
        log.fatal("This is a fatal message");
    }
}
