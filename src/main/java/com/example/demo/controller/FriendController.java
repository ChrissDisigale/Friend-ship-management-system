package com.example.demo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Friend;
import com.example.demo.service.FriendService;

@RestController
@RequestMapping("/api")
public class FriendController {

	@Autowired
	private FriendService friendService;
	
	
	//get all friends
	@GetMapping("/friends")
	public List<Friend> getAllFriends() {
	   return friendService.getAllFriends();
	}
	
	//create a new friend
	@PostMapping("/friends")
	public Friend createFriend(@RequestBody Friend friend) {
		return friendService.createFriend(friend);
	}
	
	//get single friend
	@GetMapping("/friends/{id}")
	public ResponseEntity<Friend> getFriend(@PathVariable Long id) {
		return friendService.getFriend(id);
	}
	
	//update friend details
	@PutMapping("/friends/{id}")
	public ResponseEntity<Friend> updateFriend(@PathVariable Long id,@RequestBody Friend friendDetail) {
	
	return friendService.updateFriend(id, friendDetail);
	
	}
	
	//delete bad friend
	@DeleteMapping("/friends/{id}")
	public void deleteFriend(@PathVariable Long id) {
		friendService.deleteFriend(id);
	}	
	
}

