package jumbo.euro.demoEuro.model.api;


public class Amount {
	
	private String currencyCode;
    private Double value;
    private Double commissionSalePercent;
    private Double commissionSaleValue;
    private Boolean binding;
	
	public String getCurrencyCode() {
		return currencyCode;
	}
	
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	public Double getValue() {
		return value;
	}
	
	public void setValue(Double value) {
		this.value = value;
	}
	
	public Double getCommissionSalePercent() {
		return commissionSalePercent;
	}
	
	public void setCommissionSalePercent(Double commissionSalePercent) {
		this.commissionSalePercent = commissionSalePercent;
	}
	
	public Double getCommissionSaleValue() {
		return commissionSaleValue;
	}
	
	public void setCommissionSaleValue(Double commissionSaleValue) {
		this.commissionSaleValue = commissionSaleValue;
	}
	
	public Boolean getBinding() {
		return binding;
	}
	
	public void setBinding(Boolean binding) {
		this.binding = binding;
	}
    
    

}
