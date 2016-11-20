package com.ws.spring.controller;

import com.ws.spring.model.*;
import com.ws.spring.service.*;
import com.ws.spring.control.RequestLimit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import javax.validation.Valid;
import java.util.List;

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

    @RequestLimit(count = 10,time = 60000)
    @RequestMapping(value = "/search",method = RequestMethod.GET)
    public String test(Model model){
        if(!model.containsAttribute("dataQuery")){
            model.addAttribute("dataQuery",new DataQuery());
        }

        return "search";
    }

    @RequestMapping(value = "/search",method = RequestMethod.POST)
    public String testValidate(ModelMap modelMap, @Valid @ModelAttribute("dataQuery") DataQuery dataQuery, BindingResult bindingResult){
        if(bindingResult.getErrorCount() > 0){
            System.out.println("wrong");
            return "error";
        }
        if(dataQuery.getDataSbdsno()!=null){
            System.out.println(dataQuery.getDataSbdsno());
            SDBSCollectionModel sdbsCollectionModel = (SDBSCollectionModel) service.findDataBySdbsno(dataQuery.getDataSbdsno(),"sdbs_collection");
            if(sdbsCollectionModel == null){
                return "error";
            }else{
                modelMap.addAttribute("sdbsno",sdbsCollectionModel);
                return "getmessage";
            }
//            if(!sdbsCollectionModel.getMs().equals("N")){
//                sdbsCollectionModel.setMs("ms.jsp");
//            }

        }
        if(dataQuery.getDataFormula()!=null){
            System.out.println(dataQuery.getDataFormula());
            if(dataQuery.getDataFormula()==null || dataQuery.getDataFormula().length()==0)
                return "error";
            else if(dataQuery.getDataFormula().length()==1 && dataQuery.getDataFormula().equals("%")){

            }else if(dataQuery.getDataFormula().length()>1 && dataQuery.getDataFormula().contains("%")){
                List<SDBSCollectionModel> fuzzyLists = service.findDataByFuzzyFormula(dataQuery.getDataFormula().trim().toUpperCase(),"sdbs_collection");
                if(fuzzyLists==null || fuzzyLists.size()==0)
                    return "error";
                modelMap.addAttribute("formula",fuzzyLists);
                return "fuzzy";
            }
            List<SDBSCollectionModel> lists = service.findDataByFormula(dataQuery.getDataFormula().trim().toUpperCase(),"sdbs_collection");
            if(lists==null || lists.size()==0)
                return "error";
            modelMap.addAttribute("formula",lists);
            return "formula";
        }
       return "error";
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
        System.out.println("invoke ms");
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
        System.out.println("invoke cnmr");
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
        System.out.println("invoke esr");
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
        System.out.println("invoke hnmr");
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
            System.out.print("invoke ir2");
            return "ir2";
        }
        modelMap.addAttribute("ir",irCollectionModel);
        System.out.println("invoke ir");
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
        System.out.println("invoke raman");
        return "raman";
    }

    @RequestMapping(value = "/raman",method = RequestMethod.GET)
    public String getRamanData(@RequestParam("sdbsno") String sdbsno){

        return "raman";
    }
}
