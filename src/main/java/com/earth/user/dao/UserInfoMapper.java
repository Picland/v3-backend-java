package com.earth.user.dao;

import com.earth.user.bean.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {
	UserBean getUser(String userId);

	List<UserBean> getAll();

	void deleteUser(String userId);
}
