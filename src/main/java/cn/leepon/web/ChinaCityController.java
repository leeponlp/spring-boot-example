package cn.leepon.web;

import cn.leepon.entity.ChinaCity;
import cn.leepon.mapper.ChinaCityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @task:
 * @discrption:
 * @author: 苏小城
 * @date: 18/2/26
 * @version: 1.0.0
 */
@RequestMapping("/config")
@RestController
public class ChinaCityController {

    @Autowired
    ChinaCityMapper  chinaCityMapper;

    @RequestMapping("/cities")
    public List<ChinaCity> getCities(){

        return chinaCityMapper.selectAll();
    }
}
