package wcci.reviewssite;

public class Review {
	
	private long id;
	private String title;
	private String imageUrl;
	//remove review from variables below
	private String reviewCategory;
	private String reviewContent;

	public Review(long id, String title, String imageUrl, String reviewCategory, String reviewContent) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.reviewCategory = reviewCategory;
		this.reviewContent = reviewContent;
		
	}

	public long getID() {
		
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public String getReviewCategory() {
		return reviewCategory;
	}
	
	public String getReviewContent() {
		return reviewContent;
	}
	

}
