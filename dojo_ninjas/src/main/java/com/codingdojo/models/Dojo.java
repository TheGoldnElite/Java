package com.codingdojo.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

@Entity
public class Dojo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		
		
		@Size(min=1,max=255,message="Dojo name must be between 1-255 characters")
		private String name;
		
		
		//mappedby has to be the private Dojo dojo, the dojo
		@OneToMany(mappedBy="dojo",fetch=FetchType.LAZY)
				
		//<Ninja> has to be from the folder Ninja
		private List<Ninja> ninjas;
		
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
	
};

