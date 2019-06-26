package wcci.reviewssite;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Tag {

	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToMany (mappedBy = "tags")
	
	private Collection<Review> reviews;
	
	
	private String name;


	public Tag() {
		
	}
	public Tag(String name) {
		this.name = name;
	}

	public String getName() {

		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Tag other = (Tag) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
