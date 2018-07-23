package com.mitsubishi.pesb.dao;

import com.mitsubishi.pesb.model.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public interface CommonDao extends Repository<UserModel, String> {

    @Query(value = "select new map(u.name as name) from UserModel u ")
    List<Map<String,Object>> findByName();
}
