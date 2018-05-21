package jumbo.euro.demoEuro.model.api;

import java.util.List;

public class AvailableHotelSaleComments {
	
	private boolean moreCombinations;
	private EstablishmentComments establishment;
	private List<RoomCombinationSaleOffers> roomCombinationList;
	
	public boolean isMoreCombinations() {
		return moreCombinations;
	}
	
	public void setMoreCombinations(boolean moreCombinations) {
		this.moreCombinations = moreCombinations;
	}
	
	public EstablishmentComments getEstablishment() {
		return establishment;
	}
	
	public void setEstablishment(EstablishmentComments establishment) {
		this.establishment = establishment;
	}
	
	public List<RoomCombinationSaleOffers> getRoomCombinationList() {
		return roomCombinationList;
	}
	
	public void setRoomCombinationList(List<RoomCombinationSaleOffers> roomCombinationList) {
		this.roomCombinationList = roomCombinationList;
	}
	
	

}
