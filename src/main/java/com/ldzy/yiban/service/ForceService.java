package com.ldzy.yiban.service;

import com.github.pagehelper.PageInfo;
import com.ldzy.yiban.model.Force;

/**
 * @Auction:XWD
 * @Data:2022/5/26
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */

public interface ForceService {

    default PageInfo<Force> findForce(int pageNum, int pageSize){
        return null;
    }

    default void addForce(Integer memberid, Integer forceindex, String forceadddata){}
}
