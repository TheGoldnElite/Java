package com.codingdojo.models;


@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="Title is required")
	@Size(min=1,max=255,message="Movie title must be between 9-255 characters.")
	private String title;
	
	@NotNull(message="Genre is required")
	@Size(min=8,max=255,message="Movie genre must be between 9-255 characters.")
	private String genre;
	
	@NotNull(message="Release Date is required")
	@Min(value=1850,message="Year must be after 1850")
	@Max(value=2022,message="Year must be before 2022")
	private Integer release_date;
	
	
	@NotNull(message="Rating is required")
	@Min(value=1,message="Rating must be between 1-5.")
	@Max(value=5,message="Rating must be between 1-5.")
	private Integer rating;
	
	
	public Movie() {
		
	}
	
	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getRelease_date() {
		return release_date;
	}

	public void setRelease_date(Integer release_date) {
		this.release_date = release_date;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}


}


