package jumbo.euro.demoEuro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import jumbo.euro.demoEuro.converter.AvailabilityConverter;
import jumbo.euro.demoEuro.model.extern.SesionAbrirPeticion;
import jumbo.euro.demoEuro.model.extern.SesionAbrirRespuesta;

@Service
public class AvailabilityService {

    @Autowired
    public AvailabilityConverter availabilityConverter;

    @Autowired
    public XmlMapper xmlMapper;

    @Autowired
    public RestTemplate restTemplate;

    private String baseurl = "http://localhost";

    private int port = 8081;

    public SesionAbrirRespuesta getOpenSessionResponse() {
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
        headers.add("Content-Type", "text/xml");
        // headers.add("Content-Type", "application/json");
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
        SesionAbrirRespuesta response = restTemplate.postForObject("url", request, SesionAbrirRespuesta.class);
        System.out.println("Ha pasado después del response");
        return response;
    }

    @Bean
    public RestTemplate restTemplate() {
        if (restTemplate == null) {
            restTemplate = new RestTemplate();
        }
        return restTemplate;
    }
}
