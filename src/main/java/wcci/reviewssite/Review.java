package wcci.reviewssite;

public class Review {
	
	private long id;
	private String title;
	private String imageUrl;
	private String category;
	private String content;

	public Review(long id, String title, String imageUrl, String category, String content) {
		this.id = id;
		this.title = title;
		this.imageUrl = imageUrl;
		this.category = category;
		this.content = content;
		
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
		return category;
	}
	
	public String getReviewContent() {
		return content;
	}
	

}
