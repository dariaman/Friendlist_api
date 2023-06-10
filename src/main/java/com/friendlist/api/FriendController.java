package com.friendlist.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class FriendController {

    @Autowired
    private FriendService friendService;

    @GetMapping("/friends")
    public List<Friend> GetFriends(){
        return friendService.getFriends();
    }

    @PostMapping("/friends/addnew")
    public void addFriend(@RequestBody Friend newFriend){
        friendService.addFriends(newFriend);
    }

    @PutMapping("/friends/{id}/edit")
    public void updateFriend(@PathVariable("id") Integer id, @RequestBody Friend friend){
        friendService.updateFriends(friend);
    }

    @DeleteMapping("/friends/{id}/delete")
    public void deleteFriend(@PathVariable("id") Long id){
        friendService.deleteFriends(id);
    }

}
