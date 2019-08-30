package com.jk.dao;

import com.jk.pojo.Fenrun;
import com.jk.pojo.Lecturer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.HashMap;
import java.util.List;

public interface TeacherDao {



    int findLecturerCount(HashMap<String, Object> hashMap);


    List<Lecturer> findLecturerList(@Param("page") int page, @Param("rows") Integer rows, @Param("lecturer") Lecturer lecturer);

    int findFenRunCount(HashMap<String, Object> hashMap);

    List<Fenrun> findFenRunList(@Param("page") int page, @Param("rows") Integer rows, @Param("fenrun") Fenrun fenrun);

    @Insert("insert into t_lecturer (teacheName,phone,email) values(#{teacheName},#{phone},#{email})")
    void saveLect(@Param("lecturer") Lecturer lecturer);

    @Select("select * from t_lecturer where id=#{id}")
    Lecturer findAudById(@Param("id") Integer id);

    @Update("update t_lecturer set phone=#{phone},teacheName=#{teacheName},email=#{email},info=#{email},creditNumber=#{creditNumber} where id=#{id}")
    void updateAudit(@Param("id") Integer id);
}
