package wcci.reviewssite;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	
	@ManyToMany (mappedBy = "reviews")
	
	private Collection<Tag> tags;
	
	@ManyToOne
	private Category category;
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	private String imageUrl;
	private String content;
	
	protected Review () {
		
	}
	
	public Review(String title, String imageUrl, Category category, String content) {
		this.title = title;
		this.imageUrl = imageUrl;
		this.category = category;
		this.content = content;

	}

	public Long getId() {

		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public Category getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		if (id != other.id)
			return false;
		return true;
	}
	

}
