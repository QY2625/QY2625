package com.hspedu.furn.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hspedu.furn.bean.Furn;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ZhouYu
 * @version 1.0
 * 如果是mybatis-plus 我们Mapper接口可以通过extends 接口BaseMapper
 * ，扩展功能
 */
//@Mapper
public interface FurnMapper extends BaseMapper<Furn>{
    // 如果有其它的方法，可以在该接口声明
    // 并在对应的Mapper.xml进行配置实现
}
