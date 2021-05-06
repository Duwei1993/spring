package com.springinaction.soundsystem.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan 默认扫描配置类相同的包及其子包
//@ComponentScan(basePackages = {"com.springinaction.soundsystem","com.springinaction.knights"})
@ComponentScan(basePackageClasses = {com.springinaction.soundsystem.CompactDisc.class})
public class CDPlayerConfig {
}
