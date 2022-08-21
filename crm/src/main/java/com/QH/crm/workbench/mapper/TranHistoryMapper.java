package com.QH.crm.workbench.mapper;

import com.QH.crm.workbench.model.TranHistory;

import java.util.List;

public interface TranHistoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_history
     *
     * @mbggenerated Mon Aug 15 11:54:34 CST 2022
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_history
     *
     * @mbggenerated Mon Aug 15 11:54:34 CST 2022
     */
    int insert(TranHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_history
     *
     * @mbggenerated Mon Aug 15 11:54:34 CST 2022
     */
    int insertSelective(TranHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_history
     *
     * @mbggenerated Mon Aug 15 11:54:34 CST 2022
     */
    TranHistory selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_history
     *
     * @mbggenerated Mon Aug 15 11:54:34 CST 2022
     */
    int updateByPrimaryKeySelective(TranHistory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_tran_history
     *
     * @mbggenerated Mon Aug 15 11:54:34 CST 2022
     */
    int updateByPrimaryKey(TranHistory record);
    /**
     * 新增交易历史记录
     * @param tranHistory 交易历史记录
     * @return 新增条数
     */
    int insertTransactionHistory(TranHistory tranHistory);

    List<TranHistory> selectTranHistoryForDetailByTranId(String id);

    int deleteTranHistoryByTranIds(String[] tranId);
}
