package com.codingdojo;


@Entity
public class User {
	
	@Id
	@GenerateValue(strategy=GenererationType.IDENTITY)
	private Long id;
	
	@Size(min=1,max=255,message="Name must be between 1=255 characters.")
	private String name;
	
	 @OneToMany(mappedBy="user",fetch=FetchType.LAZY)
	 private List<Food> foods;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public User() {
		
	}

};
