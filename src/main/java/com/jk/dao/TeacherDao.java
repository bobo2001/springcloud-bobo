package com.jk.dao;

import com.jk.pojo.Fenrun;
import com.jk.pojo.Lecturer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

public interface TeacherDao {



    int findLecturerCount(HashMap<String, Object> hashMap);


    List<Lecturer> findLecturerList(@Param("page") int page, @Param("rows") Integer rows, @Param("lecturer") Lecturer lecturer);

    int findFenRunCount(HashMap<String, Object> hashMap);

    List<Fenrun> findFenRunList(@Param("page") int page, @Param("rows") Integer rows, @Param("fenrun") Fenrun fenrun);

    @Insert("insert into t_lecturer (teacheName,phone,email) values(#{teacheName},#{phone},#{email})")
    void saveLect(Lecturer lecturer);
}
