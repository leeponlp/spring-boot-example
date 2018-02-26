package cn.leepon.mapper;

import cn.leepon.entity.ChinaCity;
import java.util.List;

public interface ChinaCityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ChinaCity record);

    ChinaCity selectByPrimaryKey(Integer id);

    List<ChinaCity> selectAll();

    int updateByPrimaryKey(ChinaCity record);
}