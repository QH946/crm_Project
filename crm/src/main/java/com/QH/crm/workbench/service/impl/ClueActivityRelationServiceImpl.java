package com.QH.crm.workbench.service.impl;

import com.QH.crm.workbench.mapper.ClueActivityRelationMapper;
import com.QH.crm.workbench.model.ClueActivityRelation;
import com.QH.crm.workbench.service.ClueActivityRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service.impl
 * @date 2022/8/14 16:42
 */
@Service("clueActivityRelationService")
public class ClueActivityRelationServiceImpl implements ClueActivityRelationService {
    @Autowired
    ClueActivityRelationMapper clueActivityRelationMapper;

    @Override
    public int saveCreateClueActivityRelationByList(List<ClueActivityRelation> clueActivityRelationList) {
        return clueActivityRelationMapper.insertCreateClueActivityRelationByList(clueActivityRelationList);
    }

    @Override
    public int deleteClueActivityRelationByClueIdAndActivityId(ClueActivityRelation clueActivityRelation) {
        return clueActivityRelationMapper.deleteClueActivityRelationByClueIdAndActivityId(clueActivityRelation);
    }
}
