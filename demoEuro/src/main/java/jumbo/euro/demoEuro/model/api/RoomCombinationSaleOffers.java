package jumbo.euro.demoEuro.model.api;

import java.util.List;

public class RoomCombinationSaleOffers {
	
	private List<Room> roomList;
    private List<PriceSaleExtends> priceList;
	
	public List<Room> getRoomList() {
		return roomList;
	}
	
	public void setRoomList(List<Room> roomList) {
		this.roomList = roomList;
	}
	
	public List<PriceSaleExtends> getPriceList() {
		return priceList;
	}
	
	public void setPriceList(List<PriceSaleExtends> priceList) {
		this.priceList = priceList;
	}
    
    

}
