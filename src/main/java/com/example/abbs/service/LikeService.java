package com.example.abbs.service;

import java.util.List;

import com.example.abbs.entity.Like;

public interface LikeService {

    Like getLike(int bid, String uid);

    Like getLikeByLid(int lid);

    List<Like> getLikeList(int bid);

    void insertLike(Like like);

    int toggleLike(Like like);		// value가 0 이면 1로 바꾸고, 1 이면 0으로 바꿈, value를 반환

    int getLikeCount(int bid);

}