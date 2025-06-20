package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 课程信息：(CourseInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CourseInformation")
public class CourseInformation implements Serializable {

    // CourseInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_information_id")
    private Integer course_information_id;

    // 课程编号
    @Basic
    private String course_no;
    // 课程名称
    @Basic
    private String course_name;
    // 授课教师
    @Basic
    private Integer lecturer;
    // 教师姓名
    @Basic
    private String teachers_name;
    // 授课时间
    @Basic
    private Timestamp teaching_time;
    // 授课课节
    @Basic
    private String lecture_section;
    // 备注信息
    @Basic
    private String remarks;













    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
