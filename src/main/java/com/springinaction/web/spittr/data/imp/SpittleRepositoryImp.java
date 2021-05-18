package com.springinaction.web.spittr.data.imp;

import com.springinaction.web.spittr.component.Spitter;
import com.springinaction.web.spittr.component.Spittle;
import com.springinaction.web.spittr.data.SpittleRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author DW
 * @version 1.0
 * @date 2021/5/12 23:08
 **/
@Component
public class SpittleRepositoryImp implements SpittleRepository {

    private List<Spittle> spittleList = new ArrayList<>(20);

    public SpittleRepositoryImp() {
        for (int i = 0; i < 20; i++) {
            Spittle spittle = new Spittle("good day" + i, new Date());
            spittleList.add(spittle);
        }
    }

    @Override
    public List<Spittle> findSpittles(long max, int count) {
        return spittleList.subList(0, 0 + count);
    }

}
