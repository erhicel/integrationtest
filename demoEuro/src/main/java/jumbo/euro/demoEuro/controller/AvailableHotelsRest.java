package jumbo.euro.demoEuro.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import jumbo.euro.demoEuro.model.extern.AvailabilityHotelResponse;
import jumbo.euro.demoEuro.model.extern.SesionAbrirPeticion;
import jumbo.euro.demoEuro.model.extern.SesionAbrirRespuesta;
import jumbo.euro.demoEuro.service.AvailabilityService;

import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.hal.Jackson2HalModule;
import org.springframework.hateoas.mvc.TypeConstrainedMappingJackson2HttpMessageConverter;

import org.springframework.web.client.RestTemplate;



@RestController
@RequestMapping(value = "/rest")
public class AvailableHotelsRest {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
//    private RestTemplate restTemplate = restTemplate();
//    private String baseurl = "http://localhost";
//    private int port = 8081;
	
	@Autowired
	private AvailabilityService availabilityService;
	
//	@GetMapping("/availability")
//	public AlbumApiResponse albums() {
//		AlbumApiResponse result = albumService.albumResponseList();
//		logger.info(result.toString());
//		return result;
//}
	
	@PostMapping("/posts")
    public SesionAbrirRespuesta OpenSessionResponse() {
		
		System.out.println("Entra al controller");
		
		jumbo.euro.demoEuro.model.extern.SesionAbrirRespuesta response = availabilityService.getOpenSessionResponse();

        
        
        return response;
}

//	   private RestTemplate restTemplate() {
//	        if (restTemplate == null) {
//	            restTemplate = new RestTemplate();
//	            List<HttpMessageConverter<?>> existingConverters = restTemplate.getMessageConverters();
//	            List<HttpMessageConverter<?>> newConverters = new ArrayList<>();
//	            newConverters.add(getHalMessageConverter());
//	            newConverters.addAll(existingConverters);
//	            restTemplate.setMessageConverters(newConverters);
//	        }
//	        return restTemplate;
//	}
//	   
//	    private static HttpMessageConverter getHalMessageConverter() {
//	        ObjectMapper objectMapper = new ObjectMapper();
//	        objectMapper.registerModule(new Jackson2HalModule());
//	        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//	        MappingJackson2HttpMessageConverter halConverter = new TypeConstrainedMappingJackson2HttpMessageConverter(ResourceSupport.class);
//	        halConverter.setSupportedMediaTypes(Arrays.asList(MediaTypes.HAL_JSON));
//	        halConverter.setObjectMapper(objectMapper);
//	        return halConverter;
//	}
	
	
	
	
//	@PostMapping("/posts")
//	public PostApiResponse savePost(@RequestBody PostApiResponse postApiResponse) {
//		postApiResponse.setMessage("create." + postApiResponse.getMessage().toUpperCase());
//
//		return postService.savePostApiResponse(postApiResponse);
//}
	
	

}
