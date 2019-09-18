package com.example.demo.service;

import java.awt.Image;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "image-service",url="http://localhost:8761/eureka")

public interface ImageFreignClient {

	@RequestMapping("/images")
	public List<?> getImages();

}
