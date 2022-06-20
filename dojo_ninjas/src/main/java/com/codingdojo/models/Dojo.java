package com.codingdojo.models;


@Entity
public class Dojo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY){
		private Long id;
		
		
		@Size(min=1,max=255,message="Dojo name must be between 1-255 characters")
		private String name;
		
		public Long getId() {
			return id;
		}
		
		
		public Dojo() {
			
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public void setId(Long id) {
			this.id = id;
		}
	
	
	
	
	
	
	
	
	
	
	}
}
