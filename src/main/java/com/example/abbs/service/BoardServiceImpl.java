package com.example.abbs.service;

import com.example.abbs.entity.Board;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Override
    public Board getBoard(int bid) {
        return null;
    }

    @Override
    public int getBoardCount(String field, String query) {
        return 0;
    }

    @Override
    public List<Board> getBoardList(int page, String filed, String query) {
        return null;
    }

    @Override
    public void insertBoard(Board board) {

    }

    @Override
    public void updateBoard(Board board) {

    }

    @Override
    public void delete(int bid) {

    }

    @Override
    public void increaseViewCount(int bid) {

    }

    @Override
    public void increaseReplyCount(int bid) {

    }

    @Override
    public void increaseLikeCount(int bid) {

    }
}
