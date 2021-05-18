package com.springinaction.web.spittr.data;

import com.springinaction.web.spittr.component.Spitter;
import com.springinaction.web.spittr.component.Spittle;

import java.util.List;

/**
 * @author DW
 * @version 1.0
 * @date 2021/5/12 22:30
 **/
public interface SpitterRepository {
    /**
     * spittles查询方法
     * @param index
     * @return
     */
    Spitter findSpitters(int index);

    void register(Spitter spitter);
    
}
