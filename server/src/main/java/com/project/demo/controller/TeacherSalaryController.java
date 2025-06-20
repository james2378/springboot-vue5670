package com.project.demo.controller;

import com.project.demo.entity.TeacherSalary;
import com.project.demo.service.TeacherSalaryService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 教师工资：(TeacherSalary)表控制层
 *
 */
@RestController
@RequestMapping("/teacher_salary")
public class TeacherSalaryController extends BaseController<TeacherSalary, TeacherSalaryService> {

    /**
     * 教师工资对象
     */
    @Autowired
    public TeacherSalaryController(TeacherSalaryService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
