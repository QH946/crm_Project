package com.QH.crm.workbench.service.impl;

import com.QH.crm.workbench.mapper.ContactsRemarkMapper;
import com.QH.crm.workbench.model.ContactsRemark;
import com.QH.crm.workbench.service.ContactsRemarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author QH
 * @version V1.0.1
 * @Package com.QH.crm.workbench.service.impl
 * @date 2022/8/15 12:13
 */
@Service("contactsRemarkService")
public class ContactsRemarkServiceImpl implements ContactsRemarkService {
    @Autowired
    private ContactsRemarkMapper contactsRemarkMapper;

    @Override
    public List<ContactsRemark> queryContactsRemarkForDetailByContactsId(String contactsId) {
        return contactsRemarkMapper.selectContactsRemarkForDetailByContactsId(contactsId);
    }

    @Override
    public int saveCreateContactsRemark(ContactsRemark contactsRemark) {
        return contactsRemarkMapper.insertContactsRemark(contactsRemark);
    }

    @Override
    public int deleteContactsRemarkById(String id) {
        return contactsRemarkMapper.deleteContactsRemarkById(id);
    }

    @Override
    public int saveEditContactsRemark(ContactsRemark contactsRemark) {
        return contactsRemarkMapper.updateContactsRemark(contactsRemark);
    }
}
