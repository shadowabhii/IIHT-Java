package com.reader.model;

public class ReaderBook {
	
	private String title;
	private String author;
	private String publisher;
	private String releasedDate;
	@Override
	public String toString() {
		return "ReaderBook [title=" + title + ", author=" + author + ", publisher=" + publisher + ", releasedDate="
				+ releasedDate + "]";
	}
	public ReaderBook() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReaderBook(String title, String author, String publisher, String releasedDate) {
		super();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.releasedDate = releasedDate;
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
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getReleasedDate() {
		return releasedDate;
	}
	public void setReleasedDate(String releasedDate) {
		this.releasedDate = releasedDate;
	}

}
