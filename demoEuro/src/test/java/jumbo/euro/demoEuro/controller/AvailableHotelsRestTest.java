package jumbo.euro.demoEuro.controller;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import jumbo.euro.demoEuro.model.extern.SesionAbrirPeticion;
import jumbo.euro.demoEuro.model.extern.SesionAbrirRespuesta;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AvailableHotelsRestTest {

    @Autowired
    private AvailableHotelsRest availableHotelsRest;

    @Autowired
    private XmlMapper xmlMapper;

    @Test
    public void verifyOpenSession() {
        SesionAbrirRespuesta openSessionResponse = availableHotelsRest.OpenSessionResponse();
    }

    @Test
    public void printObjectToXml() throws IOException {
        SesionAbrirPeticion sesionAbrirPeticion = new SesionAbrirPeticion();
        sesionAbrirPeticion.setCodage("aa");
        sesionAbrirPeticion.setCodidi("ee");
        sesionAbrirPeticion.setCodsys("iii");
        sesionAbrirPeticion.setIdtusu("oooo");
        sesionAbrirPeticion.setPasusu("uuu");
        String xml = xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(sesionAbrirPeticion);
        System.out.println(xml);
        SesionAbrirPeticion sesionAbrirPeticionFromXml = xmlMapper.readValue(xml, SesionAbrirPeticion.class);
        System.out.println(xmlMapper.writerWithDefaultPrettyPrinter().writeValueAsString(sesionAbrirPeticionFromXml));
    }
}
