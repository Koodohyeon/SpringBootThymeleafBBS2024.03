package com.example.abbs.service;

import com.example.abbs.entity.Board;

import java.util.List;

public interface BoardService {
    public static final int LIST_PER_PAGE= 10;      // 페이지 당 글 목록 개수
    public  static final int PAGE_PER_SCREEN = 10;  // 한 화면에 보이는 페이지 개수

    Board getBoard(int bid);

    int getBoardCount(String field, String query);

    List<Board> getBoardList(int page, String filed, String query);

    void insertBoard(Board board);

    void updateBoard(Board board);

    void delete(int bid);

    void increaseViewCount(int bid);

    void increaseReplyCount(int bid);

    void increaseLikeCount(int bid);
}
