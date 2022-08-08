package com.bbl.repository;


import com.bbl.domain.admin.AdminAccountVO;
import com.bbl.domain.user.EmailVO;
import com.bbl.domain.user.SearchListVO;

import java.util.List;

public interface AdminRepository {

    /* Admin계정 유무 체크 */
	boolean checkAdmin(AdminAccountVO adminAccountVO);

}
