package com.bbl.service;

import com.bbl.domain.admin.AdminAccountVO;
import com.bbl.domain.user.EmailVO;
import com.bbl.repository.AdminRepository;
import com.bbl.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
    Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }


    /* Admin 계정 유무 체크 */
    @Override
    public String checkAdmin(AdminAccountVO adminAccountVO) {
        if (adminRepository.checkAdmin(adminAccountVO)) {
            return "adminLogined";
        } else {
            return "adminNotLogined";
        }
    }
}
