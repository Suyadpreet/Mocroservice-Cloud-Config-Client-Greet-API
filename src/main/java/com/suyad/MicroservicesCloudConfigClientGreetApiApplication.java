package com.suyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroservicesCloudConfigClientGreetApiApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(MicroservicesCloudConfigClientGreetApiApplication.class, args);
		System.out.println("Cloud-Config-Client-API- has been started successfully...........");
	}

}
