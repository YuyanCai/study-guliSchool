package com.study.eduservice.controller;

import com.alibaba.excel.EasyExcel;
import com.study.R;
import com.study.eduservice.entity.excel.DownloadData;
import com.study.eduservice.entity.subject.OneSubject;
import com.study.eduservice.service.EduSubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;


/**
 * @author: xiaocai
 * @since: 2022/12/15/16:44
 */
@Api(tags = "上传课程")
@RestController
@RequestMapping("/eduService/subject")
public class EduSubjectController {
    @Autowired
    private EduSubjectService subjectService;

    //添加课程分类
    //获取上传过来的文件，把文件内容读取出来
    @ApiOperation(value = "excel导入")
    @PostMapping("addSubject")
    //mutipart可以让controller获取上传的文件
    public R addSubject(MultipartFile file){
        //mp中没有这个保存方法，所以我们可以自己在接口中进行扩展
        subjectService.saveSubject(file,subjectService);
        return R.ok();
    }

    @ApiOperation(value = "嵌套数据列表")
    @GetMapping("getAllSubject")
    //课程分类列表(树形)
    public R getAllSubject(){
        //list集合泛型是一级分类，因为一级分类有他本身和二级分类的集合
        List<OneSubject> list= subjectService.getAllOneTwoSubject();
        return R.ok().data("list",list);
    }
}

