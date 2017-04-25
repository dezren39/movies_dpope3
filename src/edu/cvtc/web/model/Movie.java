package edu.cvtc.web.model;
/**
 * 
 */


import java.io.Serializable;

/**
 * @author Drewry Pope
 *
 */
public class Movie implements Serializable {
	private static final long serialVersionUID = 1114313090628034086L;
	/**
	 * 
	 */
	private String title;
	private String director;
	private int lengthInMinutes;
	
	public Movie() {
	}

	public Movie(String title, String director, int lengthInMinutes) {
		super();
		this.title = title;
		this.director = director;
		this.lengthInMinutes = lengthInMinutes;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLengthInMinutes() {
		return lengthInMinutes;
	}

	public void setLengthInMinutes(int lengthInMinutes) {
		this.lengthInMinutes = lengthInMinutes;
	}
	
}
