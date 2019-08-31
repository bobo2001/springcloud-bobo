package com.jk.service;

import com.jk.pojo.Fenrun;
import com.jk.pojo.Lecturer;
import java.util.HashMap;

public interface TeacherService {

    HashMap<String, Object> findLecturer(Lecturer lecturer);

    HashMap<String, Object> findFenRun(Fenrun fenrun);

    void saveLect(Lecturer lecturer);

    Lecturer findAudById(Integer id);


    void updateAudit(Lecturer lecturer);

    HashMap<String, Object> findLecturer2(Lecturer lecturer);

    void stop(Integer id);
}
