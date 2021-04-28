package com.sjm.repository;

import com.sjm.entity.Student;

import java.util.Collection;

/**
 * @author sjm5858
 * @date 2021/4/27 15:42
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
