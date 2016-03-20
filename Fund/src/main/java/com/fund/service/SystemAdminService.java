package com.fund.service;

import java.util.List;

import com.fund.po.Fundtype;
import com.fund.po.Projecttype;
import com.fund.po.ScholarshipAppCustom;
import com.fund.po.StipendAppCustom;
import com.fund.po.User;
import com.fund.po.UserCustom;
import com.fund.po.custom.ProjectCustom;
import com.fund.utils.Page;


public interface SystemAdminService {

	void deleteUser(Integer userId)throws Exception;
	User findUser(Integer userId)throws Exception;
	int updateUser(User user)throws Exception;
	int insertUser(User user)throws Exception;
	void insertProjectType(Projecttype projecttype)throws Exception;
	List<Projecttype> selectAllProjectType()throws Exception;
	void insertFundType(Fundtype fundtype)throws Exception;
	void deleteFundType(Fundtype fundtype)throws Exception;
	void deleteNewsLink(Integer newsurlId)throws Exception;
	
	void updateScApp(ScholarshipAppCustom scApp)throws Exception;
	void updateStApp(StipendAppCustom stApp)throws Exception;
	int getUserCountByLevel(Integer level)throws Exception;
	List<UserCustom> findUsersByLevel(Integer level,Page page)throws Exception;
	boolean IsUserNameExist(String username)throws Exception;
	boolean IsProjectTypeNameExist(String PTypeName)throws Exception;
	boolean IsFundTypeNameExist(Fundtype fundType)throws Exception;
	int linkDonationUser(String donationUsername,Integer projectId)throws Exception;
}
