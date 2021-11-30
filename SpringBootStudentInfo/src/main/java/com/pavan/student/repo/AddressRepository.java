package com.pavan.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pavan.student.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
