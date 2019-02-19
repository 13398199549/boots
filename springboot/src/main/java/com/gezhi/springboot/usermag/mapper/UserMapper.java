package com.gezhi.springboot.usermag.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.gezhi.springboot.bean.UserBean;

@Mapper
public interface UserMapper {

	@Insert("insert into t_user (user_name,login_name,user_pwd) values (#{u.userName},#{u.loginName},#{u.password})")
	@Options(useGeneratedKeys=true,keyProperty="u.id")
	void saveUserBean(@Param("u")UserBean user);
	
	@Update("update t_user set user_name = #{u.userName},login_name = #{u.loginName},user_pwd = #{u.password} where id = #{u.id}")
	void updateUserBean(@Param("u")UserBean user);
	
	@Delete("delete from t_user where id = #{u.id}")
	void deleteUserBean(@Param("u")UserBean user);
	
	@ResultType(UserBean.class)
	@Select("select id,user_name as userName,login_name as loginName,user_pwd as password from t_user where id = #{id}")
	UserBean getUserBeanById(@Param("id")Long id);
	
	
}
