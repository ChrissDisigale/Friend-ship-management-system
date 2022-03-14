package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="friends")
public class Friend {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="friend_name")
	private String friendName;
	
	@Column(name="friend_location")
	private String friendLocation;
	
	@Column(name="friend_description")
	private String friendDescription;
	
	public Friend() {
		
	}
	
	public Friend(String friendName, String friendLocation, String friendDescription) {
		super();
		this.friendName = friendName;
		this.friendLocation = friendLocation;
		this.friendDescription = friendDescription;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFriendName() {
		return friendName;
	}
	public void setFriendName(String friendName) {
		this.friendName = friendName;
	}
	public String getFriendLocation() {
		return friendLocation;
	}
	public void setFriendLocation(String friendLocation) {
		this.friendLocation = friendLocation;
	}
	public String getFriendDescription() {
		return friendDescription;
	}
	public void setFriendDescription(String friendDescription) {
		this.friendDescription = friendDescription;
	}
}
