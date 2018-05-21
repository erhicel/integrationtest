package jumbo.euro.demoEuro.model.api;

import java.util.List;

public class Room {
	
	private Integer adults;
    private Integer children;
    private List<Integer> childrenAgeList;
    private Amount priceOfFirstNight;
    private Integer quantity;
    private String typeCode;
    private String typeName;
	
	public Integer getAdults() {
		return adults;
	}
	
	public void setAdults(Integer adults) {
		this.adults = adults;
	}
	
	public Integer getChildren() {
		return children;
	}
	
	public void setChildren(Integer children) {
		this.children = children;
	}
	
	public List<Integer> getChildrenAgeList() {
		return childrenAgeList;
	}
	
	public void setChildrenAgeList(List<Integer> childrenAgeList) {
		this.childrenAgeList = childrenAgeList;
	}
	
	public Amount getPriceOfFirstNight() {
		return priceOfFirstNight;
	}
	
	public void setPriceOfFirstNight(Amount priceOfFirstNight) {
		this.priceOfFirstNight = priceOfFirstNight;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public String getTypeCode() {
		return typeCode;
	}
	
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	
	public String getTypeName() {
		return typeName;
	}
	
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
    
    

}
