package com.example.demo.controller;

import com.example.demo.dao.MemberMapper;
import com.example.demo.model.Member;
import com.example.demo.model.MemberExample;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private MemberMapper memberMapper;
    private static final Logger logger = LogManager.getLogger(UserController.class);
    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "User's name", required = true, dataType = "Long", paramType = "path"),
    })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "Pet not found")
    })
    @RequestMapping(method=RequestMethod.GET, path="/{username}")
    public List<Member> Hello( @PathVariable Long username){
        MemberExample example= new MemberExample();
        example.createCriteria().andMemberIdBetween(120L,200L);
        System.out .println(memberMapper.selectByExample(example).size());
        PageHelper.startPage(1,5);
        List<Member> member1 = memberMapper.selectByExample(example);
        return member1;
    }
}

