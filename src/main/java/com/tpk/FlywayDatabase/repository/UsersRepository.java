package com.tpk.FlywayDatabase.repository;

import com.tpk.FlywayDatabase.dao.UsersDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersDao,Long> {
    UsersDao findByUsername(String user);
}
