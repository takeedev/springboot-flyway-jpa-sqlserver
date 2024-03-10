package com.tpk.FlywayDatabase.repository;

import com.tpk.FlywayDatabase.dao.AddressDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<AddressDao,Long> {
}
