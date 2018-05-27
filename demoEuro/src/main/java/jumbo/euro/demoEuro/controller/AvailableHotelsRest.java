package jumbo.euro.demoEuro.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jumbo.euro.demoEuro.model.api.AvailabilityMultiRSV12;
import jumbo.euro.demoEuro.model.extern.SesionAbrirRespuesta;
import jumbo.euro.demoEuro.service.AvailabilityService;

@RestController
@RequestMapping(value = "/rest")
public class AvailableHotelsRest {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    // private RestTemplate restTemplate = restTemplate();
    // private String baseurl = "http://localhost";
    // private int port = 8081;
    @Autowired
    private AvailabilityService availabilityService;

    // @GetMapping("/availability")
    // public AlbumApiResponse albums() {
    // AlbumApiResponse result = albumService.albumResponseList();
    // logger.info(result.toString());
    // return result;
    // }
    @PostMapping("/posts")
    public SesionAbrirRespuesta OpenSessionResponse() {
        System.out.println("Entra al controller");
        jumbo.euro.demoEuro.model.extern.SesionAbrirRespuesta response = availabilityService.getOpenSessionResponse();
        return response;
    }

    @PostMapping("/availabilityMultiRSV12")
    public AvailabilityMultiRSV12 availabilityMultiRSV12(@RequestBody MiRequest request) {
        System.out.println("Entra al controller");
        jumbo.euro.demoEuro.model.extern.SesionAbrirRespuesta sesionAbrirRespuesta = availabilityService.getOpenSessionResponse();
        // TODO CONVERTIR EN SERVICE REQUEST AL OBJETO DE REQUEST DEL PROVEEDOR CON UN CONVERTER
        // TODO LLAMAR A METODO DE LA CLASE availabilityService CON EL OBJETO CREADO DEL PROVEEDOR QUE DEVUELVE LA RESPUESTA DEL PROVEEDOR
        // AvailabilityHotelResponse.java
        // TODO CONVERTIR EN SERVICE AvailabilityHotelResponse A AvailabilityMultiRSV12
        AvailabilityMultiRSV12 response = null;// TODO CREAR CON UN CONVERTER
        return response;
    }
    // private RestTemplate restTemplate() {
    // if (restTemplate == null) {
    // restTemplate = new RestTemplate();
    // List<HttpMessageConverter<?>> existingConverters = restTemplate.getMessageConverters();
    // List<HttpMessageConverter<?>> newConverters = new ArrayList<>();
    // newConverters.add(getHalMessageConverter());
    // newConverters.addAll(existingConverters);
    // restTemplate.setMessageConverters(newConverters);
    // }
    // return restTemplate;
    // }
    //
    // private static HttpMessageConverter getHalMessageConverter() {
    // ObjectMapper objectMapper = new ObjectMapper();
    // objectMapper.registerModule(new Jackson2HalModule());
    // objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    // MappingJackson2HttpMessageConverter halConverter = new TypeConstrainedMappingJackson2HttpMessageConverter(ResourceSupport.class);
    // halConverter.setSupportedMediaTypes(Arrays.asList(MediaTypes.HAL_JSON));
    // halConverter.setObjectMapper(objectMapper);
    // return halConverter;
    // }
    // @PostMapping("/posts")
    // public PostApiResponse savePost(@RequestBody PostApiResponse postApiResponse) {
    // postApiResponse.setMessage("create." + postApiResponse.getMessage().toUpperCase());
    //
    // return postService.savePostApiResponse(postApiResponse);
    // }
}
