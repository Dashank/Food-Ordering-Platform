package com.Dashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Dashank.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
