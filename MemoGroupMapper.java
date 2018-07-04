package com.jason.mybatis.mapper;

import com.jason.mybatis.entity.MemoGroup;

import java.sql.ResultSet;

/**
 * author: jason
 */
public interface MemoGroupMapper {

    int insertMemoGroup(MemoGroup memoGroup);

    MemoGroup selectMemoGroup(int id);
}
