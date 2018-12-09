package com.lw.cloud.repository;

import com.lw.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by WYluo on 2018/4/7.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
}
