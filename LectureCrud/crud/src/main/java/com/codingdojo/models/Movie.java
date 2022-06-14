package com.codingdojo.models;


@Entity
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message="Title is required")
	@Size(min=8,max=255,message="Movie title must be between 9-255 characters.")
	private String title;
	
	private String genre;
	
	@Min(value=1850,message="Year must be after 1850")
	@Max(value=2022,message="Year must be before 2022")
	private Integer release_date;
	
	private Integer ratings;
	
	public Movie() {
		
	}
}


