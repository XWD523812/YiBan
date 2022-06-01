package com.ldzy.yiban.service.impl;

import com.ldzy.yiban.mapper.PictureMapper;
import com.ldzy.yiban.model.Picture;
import com.ldzy.yiban.service.PictureService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @Auction:XWD
 * @Data:2022/6/1
 * @Description: ${向文定_测试版本}
 * @version:1.0
 */
@Service
public class PictureServiceImpl implements PictureService {
    @Resource
    private PictureMapper pictureMapper;

    @Override
    public Picture findPicture(Picture picture) {
        return pictureMapper.findPicture(picture);
    }

    @Override
    public void insertPicture(Picture picture) {
        pictureMapper.insertPicture(picture);
    }

    @Override
    public void updatePicture(Picture picture) {
        pictureMapper.updatePicture(picture);
    }

    @Override
    public void deletePicture(Picture picture) {
        pictureMapper.deletePicture(picture);
    }
}
