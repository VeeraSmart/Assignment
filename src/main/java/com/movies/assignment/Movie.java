package com.movies.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
	
	@Id
	private String id;
	private String movieName;
	private String heroName;
	
	public Movie() {
		
	}
	
	public Movie(String id, String movieName, String heroName) {
		super();
		this.id = id;
		this.movieName = movieName;
		this.heroName = heroName;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	
	
	

}
