package com.hero.repository;

import com.hero.entity.Invoice;

public interface InvoiceMapper {
    int deleteByPrimaryKey(Integer inId);

    int insert(Invoice record);

    int insertSelective(Invoice record);

    Invoice selectByPrimaryKey(Integer inId);

    int updateByPrimaryKeySelective(Invoice record);

    int updateByPrimaryKey(Invoice record);
}