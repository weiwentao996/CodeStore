package com.elife.controller;

import com.elife.pojo.Bookinfo;
import com.elife.service.BookinfoService;
import com.elife.vo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Iterator;
import java.util.List;

@Controller
@RequestMapping("book")
public class BookinfoController {

    @Autowired
    BookinfoService bookinfoService;

    @RequestMapping("showallbook")
    @ResponseBody
    public ResultData selectAllBook(){
        List<Bookinfo> bookinfoList = bookinfoService.selectAllBooks();
        ResultData resultData = new ResultData();
        if(null == bookinfoList || bookinfoList.size() ==0) {
            resultData.setCode(3);
            resultData.setMessage("查无数据");
        } else {
            resultData.setCode(0);
            resultData.setData(bookinfoList);
        }
        return resultData;
    }

    @RequestMapping("orderbyprice")
    @ResponseBody
    public ResultData selectAllBookOrderByPrice(){
        List<Bookinfo> bookinfoList = bookinfoService.orderByPrice();
        ResultData resultData = new ResultData();
        if(null == bookinfoList || bookinfoList.size() ==0) {
            resultData.setCode(3);
            resultData.setMessage("查无数据");
        } else {
            resultData.setCode(0);
            resultData.setData(bookinfoList);
        }
        Iterator iterator = bookinfoList.listIterator();
        Bookinfo bookinfo = null;
        while (iterator.hasNext()){
            bookinfo = (Bookinfo) iterator.next();
            System.out.println(bookinfo.getBookNowPrice());
        }
        return resultData;
    }


}
