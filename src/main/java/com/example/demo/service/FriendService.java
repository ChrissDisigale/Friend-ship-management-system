package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.demo.model.Friend;
import com.example.demo.repository.FriendRepository;

@Service
public class FriendService {
	@Autowired
	private FriendRepository friendRepository;
	
	//get all friends
	public List<Friend> getAllFriends() {
		return friendRepository.findAll();
	}
	
	//create a new friend
	public Friend createFriend(Friend friend) {
		return friendRepository.save(friend);
		
	}
	
	//get data of single friend
	public ResponseEntity<Friend> getFriend(Long id) {
		Friend friend = friendRepository.findById(id).orElseThrow();
		return ResponseEntity.ok(friend);
	}
	
	//update friend status
	public ResponseEntity<Friend> updateFriend(Long id, Friend friendDetail) {
		Friend friend = friendRepository.findById(id).orElseThrow();
		friend.setFriendName(friendDetail.getFriendName());
		friend.setFriendLocation(friendDetail.getFriendLocation());
		friend.setFriendDescription(friendDetail.getFriendDescription());
		
		Friend updatedFriend = friendRepository.save(friend);
		
		return ResponseEntity.ok(updatedFriend);
		
	}
	
	//delete a bad friend
	public void deleteFriend(Long id) {
		Friend friend = friendRepository.findById(id).orElseThrow();
		friendRepository.delete(friend);
	}
	

}
