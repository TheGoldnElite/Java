package com.codingdojo.models;

import javax.persistence.Entity;


import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;

@Entity
public class Book {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long id;
		
		@NotEmpty(message="Title is required.")
		private String title;
		
		@NotEmpty(message="Author is required.")
		private String author;
		
		@NotEmpty(message="Description is required.")
		private String description;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="user_id")
		private User user;
		
//		@DateTimeFormat(pattern="yyyy-MM-dd")
//		private Date createdAt;
//		
//		private Date updatedAt;
//		
//		@PrePersist
//		public void onCreate() {
//			createdAt=new Date();
//		}
//		
//		@PreUpdate
//		public void onUpdate() {
//			updatedAt=new Date();
//		}
//		
		
		public Book() {
			
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

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}
};
