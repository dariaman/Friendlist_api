package com.friendlist.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class FriendService {
    @Autowired
    private FriendRepo friendRepo;

    public List<Friend> getFriends() {
        return friendRepo.findAll();
    }

    public void addFriends(Friend friend) {
        log.info("===========================================================================");
        log.info(friend.toString());
        friendRepo.save(friend);
    }

    public void updateFriends(Friend friend) {
        friendRepo.save(friend);
    }

    public void deleteFriends(Long id) {
        friendRepo.deleteById(id);
    }
}
