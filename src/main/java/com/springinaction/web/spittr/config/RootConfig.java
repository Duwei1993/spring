package com.springinaction.web.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author DW
 * @version 1.0
 * @date 2021/5/11 21:51
 **/

@Configuration
@ComponentScan(basePackages = {"com.springinaction.web.spittr"},
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)})
public class RootConfig {
}
