package com.organicproduct.proxy;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient
public interface ServiceProxy {
	
	   public String greeting();
}