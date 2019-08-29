package com.jk.service;

import com.jk.dao.TeacherDao;
import com.jk.pojo.Fenrun;
import com.jk.pojo.Lecturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDao teacherDao;




    @Override
    public HashMap<String, Object> findLecturer(Lecturer lecturer) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("lecturer",lecturer);
        int count = teacherDao.findLecturerCount(hashMap);
        List<Lecturer> list = teacherDao.findLecturerList((lecturer.getPage()-1)*lecturer.getRows(),lecturer.getRows(),lecturer);
        hashMap.put("total", count);
        hashMap.put("rows", list);
        return hashMap;
    }

    @Override
    public HashMap<String, Object> findFenRun(Fenrun fenrun) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("fenrun",fenrun);
        int count = teacherDao.findFenRunCount(hashMap);
        List<Fenrun> list = teacherDao.findFenRunList((fenrun.getPage()-1)*fenrun.getRows(),fenrun.getRows(),fenrun);
        hashMap.put("total", count);
        hashMap.put("rows", list);
        return hashMap;
    }

    @Override
    public void saveLect(Lecturer lecturer) {

        teacherDao.saveLect(lecturer);
    }


}
