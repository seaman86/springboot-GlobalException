package com.seaman.globalexception.controller;

import com.seaman.globalexception.exception.CustomException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * 版权：    上海云砺信息科技有限公司
 * 创建者:   wangqiuhua
 * 创建时间:  2019-01-24 10:26
 * 功能描述:
 * 修改历史:
 */

@Controller
public class TestController {

    @GetMapping("/test1")
    public String test1() {
        int i = 10 / 0;
        return "hello world!";
    }


    @GetMapping("/test2")
    public String test2() {
        throw new CustomException(400, "num不能为空");
    }

    @GetMapping("/test3")
    public Map<String, String> test3() {
        Map<String, String> result = new HashMap<>(16);
        // TODO 直接捕获所有代码块，然后在 cache
        try {
            int i = 10 / 0;
            result.put("code", "200");
            result.put("data", "具体返回的结果集");
        } catch (Exception e) {
            //result.put("code", "500");
            //result.put("message", "请求错误");
        }

        return result;
    }

}
