package jumbo.euro.demoEuro.model.extern;

import java.util.List;

public class BaseRoom {
	
	private String				id;

	private String				refdis;

	private String				codcon;

	private String				codcha;

	private String				codprv;

	private String				codral;

	private String				codsmo;

	private String				codtrf;

	private String				codtts;

	private String				cupest;

	private Double				impcom;

	private Double				impnoc;

	private Double				porage;

	private Double				pvpobl;

	private List<CancelTerm>	cancelTerms;

	private List<Note>			notes;

	
	public String getId() {
		return id;
	}

	
	public void setId(String id) {
		this.id = id;
	}

	
	public String getRefdis() {
		return refdis;
	}

	
	public void setRefdis(String refdis) {
		this.refdis = refdis;
	}

	
	public String getCodcon() {
		return codcon;
	}

	
	public void setCodcon(String codcon) {
		this.codcon = codcon;
	}

	
	public String getCodcha() {
		return codcha;
	}

	
	public void setCodcha(String codcha) {
		this.codcha = codcha;
	}

	
	public String getCodprv() {
		return codprv;
	}

	
	public void setCodprv(String codprv) {
		this.codprv = codprv;
	}

	
	public String getCodral() {
		return codral;
	}

	
	public void setCodral(String codral) {
		this.codral = codral;
	}

	
	public String getCodsmo() {
		return codsmo;
	}

	
	public void setCodsmo(String codsmo) {
		this.codsmo = codsmo;
	}

	
	public String getCodtrf() {
		return codtrf;
	}

	
	public void setCodtrf(String codtrf) {
		this.codtrf = codtrf;
	}

	
	public String getCodtts() {
		return codtts;
	}

	
	public void setCodtts(String codtts) {
		this.codtts = codtts;
	}

	
	public String getCupest() {
		return cupest;
	}

	
	public void setCupest(String cupest) {
		this.cupest = cupest;
	}

	
	public Double getImpcom() {
		return impcom;
	}

	
	public void setImpcom(Double impcom) {
		this.impcom = impcom;
	}

	
	public Double getImpnoc() {
		return impnoc;
	}

	
	public void setImpnoc(Double impnoc) {
		this.impnoc = impnoc;
	}

	
	public Double getPorage() {
		return porage;
	}

	
	public void setPorage(Double porage) {
		this.porage = porage;
	}

	
	public Double getPvpobl() {
		return pvpobl;
	}

	
	public void setPvpobl(Double pvpobl) {
		this.pvpobl = pvpobl;
	}

	
	public List<CancelTerm> getCancelTerms() {
		return cancelTerms;
	}

	
	public void setCancelTerms(List<CancelTerm> cancelTerms) {
		this.cancelTerms = cancelTerms;
	}

	
	public List<Note> getNotes() {
		return notes;
	}

	
	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}
	
	

}
