package controller;

import org.junit.Test;

import jumbo.euro.demoEuro.model.extern.SesionAbrirRespuesta;

public class AvailableHotelsRestTest {
	
	
	
	private AvailableHotelsRest availableHotelsRest = new AvailableHotelsRest();
	
	@Test
	public void verifyOpenSession(){
		
		SesionAbrirRespuesta openSessionResponse = availableHotelsRest.OpenSessionResponse();
		
	}

}
