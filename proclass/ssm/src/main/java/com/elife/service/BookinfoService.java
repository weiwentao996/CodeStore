package com.elife.service;

import com.elife.pojo.Bookinfo;

import java.util.List;

public interface BookinfoService {
    List<Bookinfo> selectAllBooks();
    List<Bookinfo> orderByDate();
    List<Bookinfo> orderByPrice();
}
