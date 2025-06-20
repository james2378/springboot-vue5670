package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 教师工资：(TeacherSalary)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "TeacherSalary")
public class TeacherSalary implements Serializable {

    // TeacherSalary编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_salary_id")
    private Integer teacher_salary_id;

    // 标题名称
    @Basic
    private String title_name;
    // 教师信息
    @Basic
    private Integer teacher_information;
    // 教师姓名
    @Basic
    private String teachers_name;
    // 教师学历
    @Basic
    private String teacher_education;
    // 学历工资
    @Basic
    private String academic_salary;
    // 教师职称
    @Basic
    private String teacher_title;
    // 职称工资
    @Basic
    private String title_salary;
    // 课程数量
    @Basic
    private Integer number_of_courses;
    // 评教等级
    @Basic
    private String teaching_evaluation_grade;
    // 评教奖金
    @Basic
    private String teaching_evaluation_bonus;
    // 年度工资
    @Basic
    private String annual_salary;
    // 工资详情
    @Basic
    private String salary_details;













    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
