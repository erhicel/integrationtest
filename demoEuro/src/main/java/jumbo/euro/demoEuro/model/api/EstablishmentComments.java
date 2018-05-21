package jumbo.euro.demoEuro.model.api;

import java.util.List;

public class EstablishmentComments {
	
	private Address address;
    private String categoryCode;
    private String categoryName;
    private String id;
    private String imageUrl;
    private String name;
    private String shortDescription;
    private Integer weight;
    private List<CommentsRS> commentList;
	
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public String getCategoryCode() {
		return categoryCode;
	}
	
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}
	
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public Integer getWeight() {
		return weight;
	}
	
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	public List<CommentsRS> getCommentList() {
		return commentList;
	}
	
	public void setCommentList(List<CommentsRS> commentList) {
		this.commentList = commentList;
	}
    
    
    

}
