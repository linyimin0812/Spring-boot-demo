package com.example.demo.dao;

import com.example.demo.model.Member;
import com.example.demo.model.MemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper {
    long countByExample(MemberExample example);

    int deleteByExample(MemberExample example);

    int deleteByPrimaryKey(Long memberId);

    int insert(Member record);

    int insertSelective(Member record);

    List<Member> selectByExample(MemberExample example);

    Member selectByPrimaryKey(Long memberId);

    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    int updateByPrimaryKeySelective(Member record);

    int updateByPrimaryKey(Member record);
}