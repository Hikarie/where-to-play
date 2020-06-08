package com.example.boot.dao;

import com.example.boot.po.Ratings;
import com.example.boot.po.RatingsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface RatingsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratings
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    long countByExample(RatingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratings
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    int deleteByExample(RatingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratings
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratings
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    int insert(Ratings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratings
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    int insertSelective(Ratings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratings
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    List<Ratings> selectByExampleWithRowbounds(RatingsExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratings
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    List<Ratings> selectByExample(RatingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratings
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    Ratings selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratings
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    int updateByExampleSelective(@Param("record") Ratings record, @Param("example") RatingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratings
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    int updateByExample(@Param("record") Ratings record, @Param("example") RatingsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratings
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    int updateByPrimaryKeySelective(Ratings record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ratings
     *
     * @mbg.generated Tue Jun 09 01:34:10 CST 2020
     */
    int updateByPrimaryKey(Ratings record);
}