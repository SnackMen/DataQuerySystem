package com.ws.spring.controller;

import com.ws.spring.model.DataQuery;
import com.ws.spring.model.SDBSCollectionModel;
import com.ws.spring.service.FindDataSDBSServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.validation.Valid;

/**
 * Created by laowang on 16-10-22.
 */
@Controller
public class DataQueryController {

    @Autowired
    FindDataSDBSServiceImpl service;

//    @RequestMapping(value = "/getMessage",method = RequestMethod.GET)
//    public String getMessage(ModelMap modelMap){
//        SDBSCollectionModel sdbsCollectionModel = (SDBSCollectionModel) service.findDataBySdbsno(1,"sdbs_collection");
//        modelMap.addAttribute("sdbsno",sdbsCollectionModel);
//
//        return "getmessage";
//    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
   public String test(Model model){
        if(!model.containsAttribute("dataQuery")){
            model.addAttribute("dataQuery",new DataQuery());
        }

        return "test";
    }

    @RequestMapping(value = "/test",method = RequestMethod.POST)
    public String testValidate(ModelMap modelMap, @Valid @ModelAttribute("dataQuery") DataQuery dataQuery, BindingResult bindingResult){
        if(bindingResult.getErrorCount() > 0){
            System.out.println("wrong");
            return "error";
        }
        SDBSCollectionModel sdbsCollectionModel = (SDBSCollectionModel) service.findDataBySdbsno(dataQuery.getDataSbdsno(),"sdbs_collection");

        modelMap.addAttribute("sdbsno",sdbsCollectionModel);

        return "getmessage";
    }

}
