package com.bamdule.example.dao.impl;

import com.bamdule.example.dao.MemberDao;
import com.bamdule.example.mapper.MemberMapper;
import com.bamdule.example.model.VO.MemberVO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author MW
 */
@Repository
public class MemberDaoImpl implements MemberDao {

    @Autowired
    private MemberMapper memberMapper;

    @Override
    public List<MemberVO> selectList() {
        return memberMapper.selectList();
    }

}
