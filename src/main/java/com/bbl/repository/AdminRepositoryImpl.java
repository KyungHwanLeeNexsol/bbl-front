package com.bbl.repository;

import com.bbl.domain.admin.AdminAccountVO;
import com.bbl.mapper.MapperAdmin;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepositoryImpl implements AdminRepository{
    Logger logger = LoggerFactory.getLogger(AdminRepositoryImpl.class);

    private final MapperAdmin mapperAdmin;

    public AdminRepositoryImpl(MapperAdmin mapperAdmin) {
        this.mapperAdmin = mapperAdmin;
    }


    @Override
    public boolean checkAdmin(AdminAccountVO adminAccountVO) {
        logger.info("adminrepo - checkAdmin");
        return mapperAdmin.checkAdmin(adminAccountVO);
    }
}
