package com.ldzy.yiban.service.impl;

import com.ldzy.yiban.mapper.BulletinMapper;
import com.ldzy.yiban.model.Bulletin;
import com.ldzy.yiban.service.BulletinService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auction:XWD
 * @Data:2022/6/1
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */
@Service
public class BulletinServiceImpl implements BulletinService{

    @Resource
    private BulletinMapper bulletinMapper;

    @Override
    public Bulletin findBulletin(Bulletin bulletin) {
        return bulletinMapper.findBulletin(bulletin);
    }

    @Override
    public void insertBulletin(Bulletin bulletin) {
        bulletinMapper.insertBulletin(bulletin);
    }

    @Override
    public void updateBulletin(Bulletin bulletin) {
        bulletinMapper.updateBulletin(bulletin);
    }

    @Override
    public void deleteBulletin(Bulletin bulletin) {
        bulletinMapper.deleteBulletin(bulletin);
    }

    @Override
    public Bulletin findBulletinPictures(Bulletin bulletin) {
        return bulletinMapper.findBulletinPictures(bulletin);
    }
}
