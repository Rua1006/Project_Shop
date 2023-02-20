package com.bandaimall.shop.dao;

import com.bandaimall.shop.dto.SampleDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SampleDAOImpl implements SampleDAO{

    @Autowired
    SqlSession sqlSession;

    @Override
    public List<SampleDTO> sampleList() throws Exception {
        return sqlSession.selectList("sample.sampleList");
    }
}
