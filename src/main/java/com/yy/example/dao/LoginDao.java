package com.yy.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.yy.example.bean.Logincontrol;
import com.yy.example.bean.Mail;

public interface LoginDao {
	@Select("select * from \"login control\"")  
	List<Logincontrol> getall();
}  
