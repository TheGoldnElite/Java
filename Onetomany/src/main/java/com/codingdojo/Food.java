package com.codingdojo;


@Entity
public class Food {
	
	@Id
	@GenerationValue(strategy=GenerationType.IDENTITY) //auto-incrementing
	private Long id;
	
	@Size(min=1,max=255,message="Food must be between 1-255 characters.")
	private String name;
	
	@Min(value=1,message="Rating must be between 1 to 5")
	@Max(value=1,message="Rating must be between 1 to 5")
	private Integer rating;
	
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dojo_id") //foreign key
	private User user;
	
	
	
	
	public Food() {
		
	}

}
