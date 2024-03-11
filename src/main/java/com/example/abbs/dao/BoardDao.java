package com.example.abbs.dao;

import com.example.abbs.entity.Board;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BoardDao {

    @Select(" select b.*, u.uname from board b" +
            " join users u on b.uid=u.uid" +
            " where b.bid=#{bid}")
    Board getBoard(int bid);

    @Select("select count(bid) from board where isdeleted=0 and ${field} like #{query}")
    int getBoardCount(String filed, String query);

    @Select("select b.*, u.uname from board b" +
            "join users u on b.uid=u.uid" +
            "    where b.isdeleted=0 and ${field} like #{query}" +
            "    order by b.modtime desc" +
            "    limit #{count} offset #{offset};")
    List<Board> getBoardList( String filed, String query, int count, int offset);

    @Insert("insert into board values(default, #{title}, #{content}, #{uid}, "
            + " default, default, default, default, default, #{files})")
    void insertBoard(Board board);

    @Update("update board set title=#{title}, content=#{content}, modTime=#{now},"
            + " files=#{files} where bid=#{bid}")
    void updateBoard(Board board);

    @Update("update board set isDeleted=1 where bid=#{bid}")
    void delete(int bid);

    @Update("update board set ${field}=${field}+1 where bid=${bid}")
    void increaseCount(String filed, int bid);

    @Select("")
    void increaseReplyCount(int bid);

    @Select("")
    void increaseLikeCount(int bid);
}

