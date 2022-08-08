package com.bbl.service;

import com.bbl.repository.PtRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PtServiceImpl implements PtService{
    Logger logger = LoggerFactory.getLogger(PtServiceImpl.class);

    private final PtRepository ptRepository;

    public PtServiceImpl(PtRepository ptRepository) {
        this.ptRepository = ptRepository;
    }
}
