package com.bbl.repository;

import com.bbl.mapper.MapperPt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class PtRepositoryImpl implements PtRepository{
    Logger logger = LoggerFactory.getLogger(PtRepositoryImpl.class);

    private final MapperPt mapperPt;

    public PtRepositoryImpl(MapperPt mapperPt) {
        this.mapperPt = mapperPt;
    }
}
