package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Document")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Document {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
    private String name;
    private String trackId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTrackId() {
		return trackId;
	}
	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}
	public Document(Integer id, String name, String trackId) {
	
		this.id = id;
		this.name = name;
		this.trackId = trackId;
	}
	public Document() {
		
	}
    
    

}
