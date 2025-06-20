package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 教师工作量：(TeacherWorkload)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "TeacherWorkload")
public class TeacherWorkload implements Serializable {

    // TeacherWorkload编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "teacher_workload_id")
    private Integer teacher_workload_id;

    // 标题名称
    @Basic
    private String title_name;
    // 教师信息
    @Basic
    private Integer teacher_information;
    // 教师姓名
    @Basic
    private String teachers_name;
    // 学生数量
    @Basic
    private Integer number_of_students;
    // 学生学时
    @Basic
    private String student_hours;
    // 总工作量
    @Basic
    private String total_workload;













    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
