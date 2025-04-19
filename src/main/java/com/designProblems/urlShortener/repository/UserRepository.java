package com.designProblems.urlShortener.repository;

import com.designProblems.urlShortener.entity.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserTable, Long> {
    public UserTable findById(long id);
}