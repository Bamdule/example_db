package com.bamdule.example.controller;

import com.bamdule.example.model.VO.MemberVO;
import com.bamdule.example.service.MemberService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author MW
 */
@RestController
@RequestMapping(value = "/member")
public class MemberController {
    
    @Autowired
    private MemberService memberService;
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @GetMapping(value = "/list", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<MemberVO> getMemberList() throws Exception {
        logger.info("[MYTEST] getMemberList request");
        return memberService.selectList();
    }
    
}
