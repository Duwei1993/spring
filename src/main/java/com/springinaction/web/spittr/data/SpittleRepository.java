package com.springinaction.web.spittr.data;

import com.springinaction.web.spittr.component.Spittle;

import java.util.List;

/**
 * @author DW
 * @version 1.0
 * @date 2021/5/12 22:30
 **/
public interface SpittleRepository {
    /**
     * spittles查询方法
     * @param max
     * @param count
     * @return
     */
    List<Spittle> findSpittles(long max,int count);

}
