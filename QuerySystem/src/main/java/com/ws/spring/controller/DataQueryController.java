package com.ws.spring.controller;

import com.ws.spring.model.*;
import com.ws.spring.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import javax.validation.Valid;

/**
 * Created by laowang on 16-10-22.
 */
@Controller
public class DataQueryController {

    @Autowired
    FindDataSDBSServiceImpl service;

    @Autowired
    FindDataMsServiceImpl msService;

    @Autowired
    FindDataCnmrServiceImpl cnmrService;

    @Autowired
    FindDataEsrServiceImpl esrService;

    @Autowired
    FindDataHnmrServiceImpl hnmrService;

    @Autowired
    FindDataRanmanServiceImpl ranmanService;

    @Autowired
    FindDataIrServiceImpl irService;

    @Autowired
    FindDataIrServiceImpl2 irServiceImpl2;

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
        if(sdbsCollectionModel==null){
            return "error";
        }
        if(!sdbsCollectionModel.getMs().equals("N")){
            sdbsCollectionModel.setMs("ms.jsp");
        }
        modelMap.addAttribute("sdbsno",sdbsCollectionModel);

        return "getmessage";

    }

    @RequestMapping(value = "/ms",method = RequestMethod.POST)
    public String postMsData(String sdbsno,ModelMap modelMap){
        int number = Integer.valueOf(sdbsno.trim());
        MSColledtionModel msColledtionModel = (MSColledtionModel)msService.findDataBySdbsno(number,"ms_table");
        if(msColledtionModel==null){
            return "error";
        }
        System.out.println(msColledtionModel.getPicUrl());
        modelMap.addAttribute("ms",msColledtionModel);
        System.out.println("调用ms");
       return "ms";
    }

    @RequestMapping(value = "/ms",method = RequestMethod.GET)
    public String getMsData(@RequestParam("sdbsno") String sdbsno){

        return "ms";
    }

    @RequestMapping(value = "/cnmr",method = RequestMethod.POST)
    public String postCnmrData(String sdbsno,ModelMap modelMap){
        int number = Integer.valueOf(sdbsno.trim());
        CNMRCollectionModel cnmrColledtionModel = cnmrService.findDataBySdbsno(number,"cnmr_table");
        if(cnmrColledtionModel==null){
            return "error";
        }
        System.out.println(cnmrColledtionModel.getFirstPicUrl());
        modelMap.addAttribute("cnmr",cnmrColledtionModel);
        System.out.println("调用cnmr");
        return "cnmr";
    }

    @RequestMapping(value = "/cnmr",method = RequestMethod.GET)
    public String getCnmrData(@RequestParam("sdbsno") String sdbsno){

        return "cnmr";
    }

    @RequestMapping(value = "/esr",method = RequestMethod.POST)
    public String postEsrData(String sdbsno,ModelMap modelMap){
        int number = Integer.valueOf(sdbsno.trim());
        ESRCollectionModel esrCollectionModel = (ESRCollectionModel) esrService.findDataBySdbsno(number,"esr_table");
        if(esrCollectionModel==null){
            return "error";
        }
        System.out.println(esrCollectionModel.getPicUrl());
        modelMap.addAttribute("esr",esrCollectionModel);
        System.out.println("调用esr");
        return "esr";
    }

    @RequestMapping(value = "/esr",method = RequestMethod.GET)
    public String getEsrData(@RequestParam("sdbsno") String sdbsno){

        return "esr";
    }

    @RequestMapping(value = "/hnmr",method = RequestMethod.POST)
    public String postHnmrData(String sdbsno,ModelMap modelMap){
        int number = Integer.valueOf(sdbsno.trim());
        HNMRCollectionModel hnmrCollectionModel = (HNMRCollectionModel) hnmrService.findDataBySdbsno(number,"hnmr_table");
        if(hnmrCollectionModel==null){
            return "error";
        }
        System.out.println(hnmrCollectionModel.getFirstPicUrl());
        modelMap.addAttribute("hnmr",hnmrCollectionModel);
        System.out.println("调用hnmr");
        return "hnmr";
    }

    @RequestMapping(value = "/hnmr",method = RequestMethod.GET)
    public String getHnmrData(@RequestParam("sdbsno") String sdbsno){

        return "hnmr";
    }

    @RequestMapping(value = "/ir",method = RequestMethod.POST)
    public String postIrData(String sdbsno,ModelMap modelMap){
        int number = Integer.valueOf(sdbsno.trim());
        IRCollectionModel irCollectionModel = (IRCollectionModel) irService.findDataBySdbsno(number,"ir_table");
        IRCollectionModel2 irCollectionModel2 = (IRCollectionModel2)irServiceImpl2.findDataBySdbsno(number,"ir_table");
        if(irCollectionModel==null && irCollectionModel2==null){
            return "error";
        }
        if(irCollectionModel2.getSecondPicUrl()!=null){
            modelMap.addAttribute("ir2",irCollectionModel2);
            System.out.print("调用ir2");
            return "ir2";
        }
        modelMap.addAttribute("ir",irCollectionModel);
        System.out.println("调用ir");
        return "ir";
    }

    @RequestMapping(value = "/ir",method = RequestMethod.GET)
    public String getIrData(@RequestParam("sdbsno") String sdbsno){

        return "ir";
    }

    @RequestMapping(value = "/raman",method = RequestMethod.POST)
    public String postRamanData(String sdbsno,ModelMap modelMap){
        int number = Integer.valueOf(sdbsno.trim());
        RAMANCollectionModel ramanCollectionModel = (RAMANCollectionModel) ranmanService.findDataBySdbsno(number,"raman_table");
        if(ramanCollectionModel==null){
            return "error";
        }
        System.out.println(ramanCollectionModel.getPicUrl());
        modelMap.addAttribute("raman",ramanCollectionModel);
        System.out.println("调用raman");
        return "raman";
    }

    @RequestMapping(value = "/raman",method = RequestMethod.GET)
    public String getRamanData(@RequestParam("sdbsno") String sdbsno){

        return "raman";
    }
}
