package com.genspark.RESTfulAPIDemo1.Repo;

import com.genspark.RESTfulAPIDemo1.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {


}
