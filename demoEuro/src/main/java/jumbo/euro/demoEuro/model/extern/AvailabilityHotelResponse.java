package jumbo.euro.demoEuro.model.extern;

import java.util.List;

public class AvailabilityHotelResponse extends EuroplayasResponse{
	
	private List<AvailableHotel> availableHotels;

	public List<AvailableHotel> getAvailableHotels() {
		return availableHotels;
	}

	public void setAvailableHotels(List<AvailableHotel> availableHotels) {
		this.availableHotels = availableHotels;
	}

}
