package com.sgr.meijia.service.impl;

import com.sgr.meijia.bean.Title;
import com.sgr.meijia.repository.ITitleRepository;
import com.sgr.meijia.service.TitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TitleServiceImp implements TitleService {

    @Autowired
    ITitleRepository iTitleRepository;

    @Override
    public Title InsertTitle(Title title) {
        return iTitleRepository.save(title);
    }

    @Override
    public Title findTitle(int id) {
        return iTitleRepository.findById(id).get();
    }

    @Override
    public Title UpdateTitle(Title title) {
        return iTitleRepository.save(title);
    }

    @Override
    public int DelTitle(int id) {
         iTitleRepository.deleteById(id);
        return 0;
    }
}
