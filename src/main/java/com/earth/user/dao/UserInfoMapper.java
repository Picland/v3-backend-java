package com.earth.user.dao;

import com.earth.user.bean.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {
	public UserBean getUser(String userId);

	public List<UserBean> getAll();
}
