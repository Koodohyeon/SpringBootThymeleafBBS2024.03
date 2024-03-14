package com.example.abbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.abbs.entity.Anniversary;

@Mapper
public interface AnniversaryDao {

    @Select("select * from anniversary where (uid=#{uid} or uid='admin') and"
            + " between adate #{startDay} and #{endDay} order by adate")
    List<Anniversary> getAnnivList(String uid, String startDay, String endDay);

    @Insert("insert into anniversary values(default, #{uid}, #{aname}, #{adate}, #{isHoliday})")
    void insertAnniv(Anniversary anniv);

}