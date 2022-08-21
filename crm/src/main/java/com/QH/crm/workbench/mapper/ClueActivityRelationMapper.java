package com.QH.crm.workbench.mapper;

import com.QH.crm.workbench.model.ClueActivityRelation;

import java.util.List;

public interface ClueActivityRelationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Mon Aug 15 11:54:34 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Mon Aug 15 11:54:34 CST 2022
     */
    int insert(ClueActivityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Mon Aug 15 11:54:34 CST 2022
     */
    int insertSelective(ClueActivityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Mon Aug 15 11:54:34 CST 2022
     */
    ClueActivityRelation selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Mon Aug 15 11:54:34 CST 2022
     */
    int updateByPrimaryKeySelective(ClueActivityRelation record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_clue_activity_relation
     *
     * @mbggenerated Mon Aug 15 11:54:34 CST 2022
     */
    int updateByPrimaryKey(ClueActivityRelation record);
    /**
     * 线索新增关联的市场活动
     * @param clueActivityRelationList 线索和市场活动的关联关系集合
     * @return 新增条数
     */
    int insertCreateClueActivityRelationByList(List<ClueActivityRelation> clueActivityRelationList);

    /**
     * 通过市场活动id和线索id删除两者间的关系（绑定的市场活动）
     * @param clueActivityRelation 线索和市场活动的关联关系
     * @return 删除条数
     */
    int deleteClueActivityRelationByClueIdAndActivityId(ClueActivityRelation clueActivityRelation);

    /**
     * 通过线索id数组（因为可能删除多个线索）删除对应线索的关联关系
     * @param clueIds 线索id数组
     * @return 删除的条数
     */
    int deleteClueActivityRelationByClueIds(String[] clueIds);

    /**
     * 通过线索id查询所有对应线索和市场活动关联关系
     * @param clueId 线索id
     * @return 关联关系集合
     */
    List<ClueActivityRelation> selectClueActivityRelationByClueId(String clueId);
}