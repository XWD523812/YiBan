package com.ldzy.yiban.service;

import com.github.pagehelper.PageInfo;
import com.ldzy.yiban.model.Force;
import org.springframework.stereotype.Service;

/**
 * @Auction:XWD
 * @Data:2022/5/26
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */
@Service
public interface ForceService {

    default PageInfo<Force> findForce(int pageNum, int pageSize){
        return null;
    }

    default void addForce(int memberid, Double forceindex, String forceadddata){}

    default void upForce(int forceid, int memberid, Double forceindex, String forceadddata){}

    default void deleteForce(int forceid){
    }

}
