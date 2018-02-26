package cn.leepon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 苏小城
 * @date 2018/2/26
 */
@SpringBootApplication
@MapperScan("cn.leepon.mapper")
public class SpringBootExampleApplication {
	
    public static void main(String[] args) {
    	SpringApplication.run(SpringBootExampleApplication.class, args);
    }
    
 }
