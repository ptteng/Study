package com.bpzj.SMUseXML;

import java.util.List;

//@Component
public interface StudentDao {

    void add(Student student);

    //删除
    void deleteById(int id);

    //修改
    void updateById(Student student);

    //获取
    Student getById(int id);

    //查询
    List<Student> findAll();

    //分页查询
//    List<Student> findAll(int start, int count);

}
