package com.bpzj.web.controller;

import com.bpzj.web.domain.Student;
import com.bpzj.web.service.StudentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value = "/students",method = RequestMethod.GET)
    public String getStudents(
            @RequestParam(value = "pn",defaultValue = "1") Integer pn,
            Model model) {
        // 引入 pageHelper 分页，startPage参数(第几页，每页几条数据)
        // 紧跟的这句就会分页查询，结果保存在pageInfo
        PageHelper.startPage(pn, 5);
        List<Student> list = studentService.getAll();
        // pageInfo 封装了查询后的结果，注意后面的 navigatePages，默认为 8，这里指定为5
        PageInfo page = new PageInfo(list,5);
        model.addAttribute("pageInfo", page);
        return "list";
    }
}
