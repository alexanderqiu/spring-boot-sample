package org.springboot.sample.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author long
 * @date 2016/10/27
 */
@Entity
@Table(name = "score")
public class Score implements Serializable{

    private static final long serialVersionUID = 8127035730921338189L;

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "student_id",nullable = false)
    private int studentId;

    @Column(name = "subject_name",nullable = false)
    private String subjectName;

    @Column(name = "score",nullable = false)
    private float score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
