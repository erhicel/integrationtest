package jumbo.euro.demoEuro.model.extern;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class EuroplayasResponse extends EuroplayasRequest {
	
	@JacksonXmlProperty(localName="coderr")
	private String	coderr;

	@JacksonXmlProperty(localName="txterr")
	private String	txterr;

	
	public String getCoderr() {
		return coderr;
	}

	
	public void setCoderr(String coderr) {
		this.coderr = coderr;
	}

	
	public String getTxterr() {
		return txterr;
	}

	
	public void setTxterr(String txterr) {
		this.txterr = txterr;
	}
	
	

}
