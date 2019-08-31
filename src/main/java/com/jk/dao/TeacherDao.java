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
    void saveLect( Lecturer lecturer);

    @Select("select * from t_lecturer where id=#{id}")
    Lecturer findAudById(@Param("id") Integer id);

    @Update("update t_lecturer set teacheName=#{teacheName},lecturership=#{lecturership},phone=#{phone},email=#{email},sorting=#{sorting},info=#{email},blankName=#{blankName},creditNumber=#{creditNumber},accountName=#{accountName},identity=#{identity},branch=#{branch} where id=#{id}")
    void updateAudit(Lecturer lecturer);

    int findLecturerCount2(HashMap<String, Object> hashMap);

    List<Lecturer> findLecturerList2(@Param("page")int page, @Param("rows") Integer rows,@Param("lecturer") Lecturer lecturer);

    @Update("update t_lecturer set status=2 where id=#{id}")
    void stop(@Param("id") Integer id);
}
