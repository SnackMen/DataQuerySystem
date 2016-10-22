package com.ws.spring.controller;

import com.ws.spring.model.SDBSCollectionModel;
import com.ws.spring.service.FindDataSDBSServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by laowang on 16-10-22.
 */
@Controller
public class DataQueryController {

    @Autowired
    FindDataSDBSServiceImpl service;

    @RequestMapping(value = "/getMessage",method = RequestMethod.GET)
    public String getMessage(ModelMap modelMap){
        SDBSCollectionModel sdbsCollectionModel = (SDBSCollectionModel) service.findDataBySdbsno(1,"sdbs_collection");
        modelMap.addAttribute("sdbsno",sdbsCollectionModel);

        return "getmessage";
    }

}
