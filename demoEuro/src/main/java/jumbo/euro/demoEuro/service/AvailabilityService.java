package jumbo.euro.demoEuro.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.MediaTypes;
import org.springframework.hateoas.ResourceSupport;
import org.springframework.hateoas.hal.Jackson2HalModule;
import org.springframework.hateoas.mvc.TypeConstrainedMappingJackson2HttpMessageConverter;
import org.springframework.http.HttpEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import jumbo.euro.demoEuro.converter.AvailabilityConverter;
import jumbo.euro.demoEuro.model.api.AvailabilityMultiRSV12;
import jumbo.euro.demoEuro.model.extern.SesionAbrirPeticion;
import jumbo.euro.demoEuro.model.extern.SesionAbrirRespuesta;

@Service
public class AvailabilityService {
	
	@Autowired
	public AvailabilityConverter availabilityConverter;
	
    private RestTemplate restTemplate = restTemplate();
    private String baseurl = "http://localhost";
    private int port = 8081;
	
	public SesionAbrirRespuesta getOpenSessionResponse() {
		
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
        headers.add("Content-Type", "text/xml");
        
//        headers.add("Content-Type", "application/json");
        
		RestTemplate restTemplate = new RestTemplate();
		
System.out.println("Ha pasado antes del seteo");
        
        SesionAbrirPeticion openSessionRequest = new SesionAbrirPeticion();
        openSessionRequest.setCodage("codigo");
        openSessionRequest.setCodidi("idioma");
        openSessionRequest.setCodsys("sistema");
        openSessionRequest.setIdtusu("usuario");
        openSessionRequest.setPasusu("clave");
        
        System.out.println("Ha pasado después del seteo");
        
        HttpEntity<SesionAbrirPeticion> request = new HttpEntity<SesionAbrirPeticion>(openSessionRequest, headers);

        System.out.println("Ha pasado después del HttpEntity");
        SesionAbrirRespuesta response = restTemplate().postForObject("url", request, SesionAbrirRespuesta.class);
        
        System.out.println("Ha pasado después del response");
		
		return response;
		
	}
	
	private RestTemplate restTemplate() {
        if (restTemplate == null) {
            restTemplate = new RestTemplate();
            List<HttpMessageConverter<?>> existingConverters = restTemplate.getMessageConverters();
            List<HttpMessageConverter<?>> newConverters = new ArrayList<>();
            newConverters.add(getHalMessageConverter());
            newConverters.addAll(existingConverters);
            restTemplate.setMessageConverters(newConverters);
        }
        return restTemplate;
}
   
    private static HttpMessageConverter getHalMessageConverter() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new Jackson2HalModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        MappingJackson2HttpMessageConverter halConverter = new TypeConstrainedMappingJackson2HttpMessageConverter(ResourceSupport.class);
        halConverter.setSupportedMediaTypes(Arrays.asList(MediaTypes.HAL_JSON));
        halConverter.setObjectMapper(objectMapper);
        return halConverter;
}

}
