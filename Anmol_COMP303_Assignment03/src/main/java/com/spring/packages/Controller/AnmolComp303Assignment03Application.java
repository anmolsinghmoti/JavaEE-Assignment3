//Anmol Singh 301145362
package com.spring.packages.Controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.spring.packages.Entities.AccountEntity;
import com.spring.packages.Entities.AccountTypeEntity;
import com.spring.packages.Entities.CustomerEntity;
import com.spring.packages.Services.AccountService;
import com.spring.packages.Services.AccountTypeService;
import com.spring.packages.Services.CustomerService;

@SpringBootApplication
@ComponentScan(basePackageClasses=AccountEntity.class)
@ComponentScan(basePackageClasses=AccountTypeEntity.class)
@ComponentScan(basePackageClasses=CustomerEntity.class)
@ComponentScan(basePackageClasses=AccountService.class)
@ComponentScan(basePackageClasses=AccountTypeService.class)
@ComponentScan(basePackageClasses=CustomerService.class)
public class AnmolComp303Assignment03Application {

	public static void main(String[] args) {
		SpringApplication.run(AnmolComp303Assignment03Application.class, args);
	}

}
