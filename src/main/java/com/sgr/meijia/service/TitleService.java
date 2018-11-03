package com.sgr.meijia.service;

import com.sgr.meijia.bean.Title;

public interface TitleService {
   // 插入title
   Title InsertTitle(Title title);

   //查询title
   Title findTitle(int id);

   //更新title
   Title UpdateTitle(Title title);

    //删除title
   int DelTitle(int id);


}
