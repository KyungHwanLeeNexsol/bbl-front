package com.bbl.mapper;


import com.bbl.domain.admin.AdminAccountVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MapperAdmin {

    /* Admin계정 유무 체크 */
    boolean checkAdmin(AdminAccountVO adminAccountVO);

}
