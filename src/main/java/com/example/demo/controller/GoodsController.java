package com.example.demo.controller;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.dao.GoodsMapper;
import com.example.demo.model.GoodsExample;
import com.example.demo.model.Goods;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Resource
    private GoodsMapper goodsMapper;
    @ApiOperation(value="查询商品信息", notes="根据商品类型查询商品信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type", value = "Goods's ID", required = true, dataType = "Long", paramType = "path"),
    })
    @ApiResponses(value = {
            @ApiResponse(code = 400, message = "Invalid ID supplied"),
            @ApiResponse(code = 404, message = "html not found")
    })
    @RequestMapping(method=RequestMethod.GET, path="/{type}")
    public List<Goods> getGoodsBuType(@PathVariable String type){
        GoodsExample example= new GoodsExample();
        example.createCriteria().andGoodsTypeEqualTo(type);
        List<Goods> goods = goodsMapper.selectByExample(example);
        return goods;
    }
}
