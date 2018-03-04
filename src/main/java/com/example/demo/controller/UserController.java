package com.example.demo.controller;

import com.example.demo.dao.MemberMapper;
import com.example.demo.model.Member;
import com.example.demo.model.MemberExample;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private MemberMapper memberMapper;
    
    @ApiOperation(value="查询用户信息", notes="根据用户ID查询用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userID", value = "User's ID", required = true, dataType = "Long", paramType = "path"),
    })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "html not found")
    })
    @RequestMapping(method=RequestMethod.GET, path="/{userID}")
    public List<Member> getUserInfoByID( @PathVariable Long userID){
        MemberExample example= new MemberExample();
        example.createCriteria().andMemberIdEqualTo(userID);
        List<Member> member = memberMapper.selectByExample(example);
        return member;
    }
}

