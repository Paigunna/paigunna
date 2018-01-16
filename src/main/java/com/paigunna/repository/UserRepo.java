/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paigunna.repository;

import com.paigunna.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author jittagornp &lt;http://jittagornp.me&gt; create : 2018/01/16
 */
public interface UserRepo extends JpaRepository<User, Long> {

}
