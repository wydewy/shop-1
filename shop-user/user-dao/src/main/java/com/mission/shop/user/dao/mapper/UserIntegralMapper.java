package com.mission.shop.user.dao.mapper;

import com.mission.shop.user.dao.model.UserIntegral;
import com.mission.shop.user.dao.model.UserIntegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserIntegralMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_integral
	 * @mbggenerated  Mon Jun 16 13:12:54 CST 2014
	 */
	int countByExample(UserIntegralExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_integral
	 * @mbggenerated  Mon Jun 16 13:12:54 CST 2014
	 */
	int deleteByExample(UserIntegralExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_integral
	 * @mbggenerated  Mon Jun 16 13:12:54 CST 2014
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_integral
	 * @mbggenerated  Mon Jun 16 13:12:54 CST 2014
	 */
	int insert(UserIntegral record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_integral
	 * @mbggenerated  Mon Jun 16 13:12:54 CST 2014
	 */
	int insertSelective(UserIntegral record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_integral
	 * @mbggenerated  Mon Jun 16 13:12:54 CST 2014
	 */
	List<UserIntegral> selectByExample(UserIntegralExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_integral
	 * @mbggenerated  Mon Jun 16 13:12:54 CST 2014
	 */
	UserIntegral selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_integral
	 * @mbggenerated  Mon Jun 16 13:12:54 CST 2014
	 */
	int updateByExampleSelective(@Param("record") UserIntegral record,
			@Param("example") UserIntegralExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_integral
	 * @mbggenerated  Mon Jun 16 13:12:54 CST 2014
	 */
	int updateByExample(@Param("record") UserIntegral record,
			@Param("example") UserIntegralExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_integral
	 * @mbggenerated  Mon Jun 16 13:12:54 CST 2014
	 */
	int updateByPrimaryKeySelective(UserIntegral record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table user_integral
	 * @mbggenerated  Mon Jun 16 13:12:54 CST 2014
	 */
	int updateByPrimaryKey(UserIntegral record);
}