package com.study.eduservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.eduservice.entity.subject.EduSubject;
import com.study.eduservice.entity.subject.OneSubject;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author: xiaocai
 * @since: 2022/12/15/16:45
 */
public interface EduSubjectService extends IService<EduSubject> {

    void saveSubject(MultipartFile file, EduSubjectService subjectService);

    List<OneSubject> getAllOneTwoSubject();

}
