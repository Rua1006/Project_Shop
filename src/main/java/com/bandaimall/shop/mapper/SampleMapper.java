package com.bandaimall.shop.mapper;

import com.bandaimall.shop.dto.SampleDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface SampleMapper {
    public List<SampleDTO> sampleList();
}
