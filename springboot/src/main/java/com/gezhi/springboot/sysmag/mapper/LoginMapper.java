package com.gezhi.springboot.sysmag.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import com.gezhi.springboot.bean.UserBean;
/**
 * @Mapper 表示将该接口  交给ClassPathMapperScanner去产生代理实例
 * @author Administrator
 *
 */
@Mapper
public interface LoginMapper {

	/**
	 * 登录方法
	 * @param user
	 * @return
	 */
	@ResultType(UserBean.class)
	@Select("select id,user_name as userName from t_user where login_name = #{u.loginName} and user_pwd = #{u.password}")
	UserBean login(@Param("u") UserBean user);
}
