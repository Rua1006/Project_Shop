package com.bandaimall.shop.service;

import com.bandaimall.shop.mapper.SampleMapper;
import com.bandaimall.shop.dto.SampleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleServiceImpl implements SampleService {

   @Autowired
   SampleMapper sampleDAO;

    @Override
    public List<SampleDTO> sampleList(){
        return sampleDAO.sampleList();
    }
}
