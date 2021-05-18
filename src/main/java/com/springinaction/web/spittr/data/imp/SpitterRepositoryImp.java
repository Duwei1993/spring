package com.springinaction.web.spittr.data.imp;

import com.springinaction.web.spittr.component.Spitter;
import com.springinaction.web.spittr.component.Spittle;
import com.springinaction.web.spittr.data.SpitterRepository;
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
public class SpitterRepositoryImp implements SpitterRepository {

    private List<Spitter> spitterList = new ArrayList<>(20);

    public SpitterRepositoryImp() {
    }

    @Override
    public Spitter findSpitters(int index) {
        return spitterList.get(index);
    }

    @Override
    public void register(Spitter spitter) {
        spitterList.add(spitter);
    }
}
