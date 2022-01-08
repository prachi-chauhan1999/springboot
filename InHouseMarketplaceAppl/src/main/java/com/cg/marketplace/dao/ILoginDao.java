package com.cg.marketplace.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.marketplace.dto.UserDetails;
public interface ILoginDao extends JpaRepository<UserDetails, String> {

}


