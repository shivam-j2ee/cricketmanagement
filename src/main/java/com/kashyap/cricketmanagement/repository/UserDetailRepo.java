package com.kashyap.cricketmanagement.repository;

import com.kashyap.cricketmanagement.domain.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailRepo  extends JpaRepository<UserDetail, Long> {

    UserDetail findByUserName(String username);

}
