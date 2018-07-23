package com.mitsubishi.pesb.dao;

import com.mitsubishi.pesb.model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserDao extends CrudRepository<UserModel, String>{
    List<UserModel> findByName(String name);
    List<UserModel> findByNameAndAge(String name,int age);
}