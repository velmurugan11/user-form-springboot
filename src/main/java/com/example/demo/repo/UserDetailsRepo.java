//package com.example.demo.repo;
//
//public class UserDetailsRepo {
//
//}
//package com.example.demo.repo;
//
//import com.example.demo.model.userdetails;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//
//@RepositoryRestResource
//public interface PersonRepo extends JpaRepository<userdetails, Long> {
//
//}
package com.example.demo.repo;

import com.example.demo.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<UserDetails, Long> {
}
