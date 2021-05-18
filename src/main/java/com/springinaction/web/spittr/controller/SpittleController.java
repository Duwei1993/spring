package com.springinaction.web.spittr.controller;

import com.springinaction.web.spittr.component.Spittle;
import com.springinaction.web.spittr.data.SpittleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author DW
 * @version 1.0
 * @date 2021/5/12 23:03
 **/
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private SpittleRepository spittleRepository;
    private static final String MAX_DEFAULTVALUE = "1000";
    private static final String COUNT_DEFAULTVALUE = "10";

    @Autowired
    public SpittleController(SpittleRepository spittleRepository) {
        this.spittleRepository = spittleRepository;
    }

    /**
     * 使用spring的model返回
     *
     * @param model
     * @return
     */
    @RequestMapping(value = {"", "/", "/getByModel"}, method = RequestMethod.GET)
    public String spittles(Model model) {
        model.addAttribute(spittleRepository.findSpittles(Long.MAX_VALUE, 20));
        return "spittles";
    }

    /**
     * 使用Map
     *
     * @param model
     * @return
     */
    @RequestMapping(value = {"/getBymap"}, method = RequestMethod.GET)
    public String spittles(Map model) {
        model.put("spittleList", spittleRepository.findSpittles(Long.MAX_VALUE, 20));
        return "spittles";
    }

    /**
     * 没有返回视图名称，也没有显式地设定模型，这个方法返回的是Spittle
     * 列表。当处理器方法像这样返回对象或集合时，这个值会放到模型中，模型的key会根据其类型推断得出
     *
     * @return
     */
    @RequestMapping(value = {"/getByList"}, method = RequestMethod.GET)
    public List<Spittle> spittles() {
        return spittleRepository.findSpittles(Long.MAX_VALUE, 20);
    }

    /**
     * 处理带有参数的请求
     * @param max
     * @param count
     * @return
     */
    @RequestMapping(value = {"/getPagination"}, method = RequestMethod.GET)
    public List<Spittle> spittles(@RequestParam(value = "max", defaultValue = MAX_DEFAULTVALUE) long max,
                                  @RequestParam(value = "count", defaultValue = COUNT_DEFAULTVALUE) int count) {
        return spittleRepository.findSpittles(max, count);
    }

}
