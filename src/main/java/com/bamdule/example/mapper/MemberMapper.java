package com.bamdule.example.mapper;

import com.bamdule.example.model.VO.MemberVO;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * @author MW
 */
@Mapper
public interface MemberMapper {

    List<MemberVO> selectList();

}
