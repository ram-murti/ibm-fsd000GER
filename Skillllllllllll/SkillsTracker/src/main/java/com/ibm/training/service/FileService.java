package com.ibm.training.service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.annotation.Resource;

import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileService 
{
	 private final Path rootLocation = Paths.get("ProfilePictureStore");
	 
	 public void store(MultipartFile file) {
	  try {
	   System.out.println(file.getOriginalFilename());
	   System.out.println(rootLocation.toUri());
	   System.out.println(file.getInputStream());
	   Files.copy(file.getInputStream(), this.rootLocation.resolve(file.getOriginalFilename()));
	   System.out.println("stored");
	  } catch (Exception e) {
		  System.out.println("Exception "+e);
	   throw new RuntimeException("FAIL!");
	  }
	 }
	 public UrlResource loadFile(String filename) {
		    try {
		      Path file = rootLocation.resolve(filename);
		      UrlResource resource = new UrlResource(rootLocation.toUri());
		      if (resource.exists() || resource.isReadable()) {
		        return resource;
		      } else {
		        throw new RuntimeException("FAIL!");
		      }
		    } catch (MalformedURLException e) {
		      throw new RuntimeException("FAIL!");
		    }
		  }
	 public void init() {
		    try {
		      Files.createDirectory(rootLocation);
		    } catch (IOException e) {
		      throw new RuntimeException("Could not initialize storage!");
		    }
}
}