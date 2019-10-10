package com.client.repository;

import com.client.entity.student;

import java.util.Collection;

public interface StudentRepository {
 public Collection<student> findAll();
 public student findById(Long id);
 public void averOrUpdate(student student);
 public void deleteById(long id);

}
