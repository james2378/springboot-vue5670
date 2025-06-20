package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 课程资料：(CourseMaterials)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CourseMaterials")
public class CourseMaterials implements Serializable {

    // CourseMaterials编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_materials_id")
    private Integer course_materials_id;

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
    // 资料文件
    @Basic
    private String information_documents;
    // 课程总结
    @Basic
    private String course_summary;













    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
