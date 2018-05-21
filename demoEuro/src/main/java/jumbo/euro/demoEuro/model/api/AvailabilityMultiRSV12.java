package jumbo.euro.demoEuro.model.api;

import java.util.List;

public class AvailabilityMultiRSV12 {
	
	private Integer fromRow;
    private Integer numRows;
    private Integer totalRows;
    private List<AvailableHotelSaleComments> availableHotelList;
	
	public Integer getFromRow() {
		return fromRow;
	}
	
	public void setFromRow(Integer fromRow) {
		this.fromRow = fromRow;
	}
	
	public Integer getNumRows() {
		return numRows;
	}
	
	public void setNumRows(Integer numRows) {
		this.numRows = numRows;
	}
	
	public Integer getTotalRows() {
		return totalRows;
	}
	
	public void setTotalRows(Integer totalRows) {
		this.totalRows = totalRows;
	}
	
	public List<AvailableHotelSaleComments> getAvailableHotelList() {
		return availableHotelList;
	}
	
	public void setAvailableHotelList(List<AvailableHotelSaleComments> availableHotelList) {
		this.availableHotelList = availableHotelList;
	}
    
    

}
