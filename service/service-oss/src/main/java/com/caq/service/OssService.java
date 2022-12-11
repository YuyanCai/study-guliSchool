package com.caq.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author: xiaocai
 * @since: 2022/12/11/20:30
 */
public interface OssService {
    //上传头像
    String uploadFileAvatar(MultipartFile file);
}
