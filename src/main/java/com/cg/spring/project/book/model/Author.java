package com.cg.spring.project.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class Author {

	@Id
	@GeneratedValue
	@Column(name = "book_name")
	private String bookName;

	@Column(name = "author_name")
	private String authorName;

	@Column(name = "category")
	private String category;

	public Author() {
		super();
	}

	public Author(String bookName, String authorName, String category) {
		super();

		this.bookName = bookName;
		this.authorName = authorName;
		this.category = category;

	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Author [bookName = " + bookName + ", authorName = " + authorName + ", Category = " + category + "]";
	}

}
