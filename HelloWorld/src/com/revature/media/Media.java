package com.revature.media;

public abstract class Media {
	
	public Media() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Media(String author, String title, int yearPublished, String genre) {
		super();
		this.author = author;
		this.title = title;
		this.yearPublished = yearPublished;
		this.genre = genre;
	}

	protected String author;
	
	protected String title;
	
	protected int yearPublished;
	
	protected String genre;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Media [author=" + author + ", title=" + title + ", yearPublished=" + yearPublished + ", genre=" + genre
				+ "]";
	}
	
	

}
