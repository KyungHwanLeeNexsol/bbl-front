package com.bbl.service;

import com.bbl.domain.admin.AdminAccountVO;

public interface AdminService {

    /* Admin 계정 유무 체크 */
    String checkAdmin(AdminAccountVO adminAccountVO);
}
