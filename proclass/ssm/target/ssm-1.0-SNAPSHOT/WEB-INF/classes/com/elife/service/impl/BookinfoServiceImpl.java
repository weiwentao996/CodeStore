package com.elife.service.impl;

import com.elife.mapper.BookinfoMapper;
import com.elife.pojo.Bookinfo;
import com.elife.pojo.BookinfoExample;
import com.elife.service.BookinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookinfoServiceImpl implements BookinfoService {
    @Autowired
    BookinfoMapper bookinfoMapper;
    @Autowired
    BookinfoExample bookinfoExample;
    public List<Bookinfo> orderByDate() {

        bookinfoExample.setOrderByClause("book_publish_date");
        System.out.println(bookinfoExample);
        return bookinfoMapper.selectByExample(bookinfoExample);
    }

    public List<Bookinfo> orderByPrice() {
        bookinfoExample.clear();
        bookinfoExample.setOrderByClause("book_now_price");
        return bookinfoMapper.selectByExample(bookinfoExample);
    }

    public List<Bookinfo> selectAllBooks() {
        return bookinfoMapper.selectByExample(null);
    }
}
