package com.bpzj.web.service;

import com.bpzj.web.dao.StudentMapper;
import com.bpzj.web.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public List<Student> listStudents() {
        return studentMapper.listAll();
    }

}
