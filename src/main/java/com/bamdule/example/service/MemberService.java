package com.bamdule.example.service;

import com.bamdule.example.model.VO.MemberVO;
import java.util.List;

/**
 *
 * @author MW
 */
public interface MemberService {

    List<MemberVO> selectList();
}
