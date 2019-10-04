package com.bamdule.example.dao;

import com.bamdule.example.model.VO.MemberVO;
import java.util.List;

/**
 *
 * @author MW
 */
public interface MemberDao {

    List<MemberVO> selectList();

}
