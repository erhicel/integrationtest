package jumbo.euro.demoEuro.model.api;

import org.joda.time.DateTime;

public class CommentsRS {
	
	private DateTime from;
    private String text;
    private DateTime to;
    private String type;
	
	public DateTime getFrom() {
		return from;
	}
	
	public void setFrom(DateTime from) {
		this.from = from;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public DateTime getTo() {
		return to;
	}
	
	public void setTo(DateTime to) {
		this.to = to;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
    
    

}
