package com.ldzy.yiban.service;

import com.github.pagehelper.PageInfo;
import com.ldzy.yiban.model.Bulletin;
import com.ldzy.yiban.model.Picture;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auction:XWD
 * @Data:2022/6/1
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */
@Service
public interface BulletinService {

    default Bulletin findBulletin(Bulletin bulletin){
        return null;
    }

    default void insertBulletin(Bulletin bulletin){}

    default void updateBulletin(Bulletin bulletin){}

    default void deleteBulletin(Bulletin bulletin){
    }

    default Bulletin findBulletinPictures(Bulletin bulletin){
        return null;
    }

    default Bulletin findBulletinReplies(Bulletin bulletin){
        return null;
    }

    default PageInfo<Bulletin> findBulletinState(Bulletin bulletin ,int pageNum, int pageSize){
        return null;
    }
}
