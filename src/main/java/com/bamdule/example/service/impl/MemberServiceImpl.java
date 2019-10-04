package com.bamdule.example.service.impl;

import com.bamdule.example.dao.MemberDao;
import com.bamdule.example.model.VO.MemberVO;
import com.bamdule.example.service.MemberService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author MW
 */
@Service
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;

    @Override
    public List<MemberVO> selectList() {
        return memberDao.selectList();
    }

}
