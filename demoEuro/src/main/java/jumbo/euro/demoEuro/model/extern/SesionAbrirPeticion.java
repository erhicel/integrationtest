package jumbo.euro.demoEuro.model.extern;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName="SesionAbrirPeticion")
public class SesionAbrirPeticion {
	
	@JacksonXmlProperty(localName="codsys")
	private String	codsys;

	@JacksonXmlProperty(localName="codage")
	private String	codage;

	@JacksonXmlProperty(localName="idtusu")
	private String	idtusu;

	@JacksonXmlProperty(localName="pasusu")
	private String	pasusu;

	@JacksonXmlProperty(localName="codidi")
	private String	codidi;

	
	public String getCodsys() {
		return codsys;
	}

	
	public void setCodsys(String codsys) {
		this.codsys = codsys;
	}

	
	public String getCodage() {
		return codage;
	}

	
	public void setCodage(String codage) {
		this.codage = codage;
	}

	
	public String getIdtusu() {
		return idtusu;
	}

	
	public void setIdtusu(String idtusu) {
		this.idtusu = idtusu;
	}

	
	public String getPasusu() {
		return pasusu;
	}

	
	public void setPasusu(String pasusu) {
		this.pasusu = pasusu;
	}

	
	public String getCodidi() {
		return codidi;
	}

	
	public void setCodidi(String codidi) {
		this.codidi = codidi;
	}
	
	


}
