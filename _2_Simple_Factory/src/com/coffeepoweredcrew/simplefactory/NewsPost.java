package com.coffeepoweredcrew.simplefactory;

import java.time.LocalDate;

/**
 * Represents a news post.
 *
 */
public class NewsPost extends Post{

	private String headline;
	
	private LocalDate newsTime;

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public LocalDate getNewsTime() {
		return newsTime;
	}

	public void setNewsTime(LocalDate newsTime) {
		this.newsTime = newsTime;
	}

	@Override
	public String toString() {
		return "Post [id=" + getId() + ", title=" + getTitle()+ ", content=" + getContent() + ", createdOn=" + getCreatedOn()
		+ ", publishedOn=" + getPublishedOn() + "]"+" NewsPost [headline=" + headline + ", newsTime=" + newsTime + "]";
	}
	
	
}
