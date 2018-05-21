package jumbo.euro.demoEuro.model.extern;

import java.util.List;

public class EuroplayasRequest {
	
	private String			ideses;

	private String			codtou;

	private List<String>	traduc;

	
	public String getIdeses() {
		return ideses;
	}

	
	public void setIdeses(String ideses) {
		this.ideses = ideses;
	}

	
	public String getCodtou() {
		return codtou;
	}

	
	public void setCodtou(String codtou) {
		this.codtou = codtou;
	}

	
	public List<String> getTraduc() {
		return traduc;
	}

	
	public void setTraduc(List<String> traduc) {
		this.traduc = traduc;
	}
	
	

}
