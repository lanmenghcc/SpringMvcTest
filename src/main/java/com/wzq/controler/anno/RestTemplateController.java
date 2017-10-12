package com.wzq.controler.anno;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wzq.controler.vo.FavUser;
  
@RestController  
public class RestTemplateController {  
  
	@RequestMapping("/doget")  
    public FavUser doget(@RequestParam(value="name") String name) {  
    	RestTemplate restTemplate = new RestTemplate();
    	//通过restTemplate调用restful的接口，
    	FavUser u = restTemplate.getForObject("http://localhost:8080/SpringMvcTest/getFavUser.do?userName=" + name, FavUser.class);  
        System.out.println(u);  
        return u;  
    }
	
	@RequestMapping("/dopost")  
    public FavUser dopost(@RequestParam(value="name") String name) {  
    	RestTemplate restTemplate = new RestTemplate();
    	//通过restTemplate调用restful的接口，
    	FavUser u = restTemplate.getForObject("http://localhost:8080/SpringMvcTest/getFavUser.do?userName=" + name, FavUser.class);  
        System.out.println(u);  
        return u;  
    }
 
} 