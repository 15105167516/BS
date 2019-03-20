package com.suke.communitymanage.utils;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class UploadUtil {
    public static String imageUpload(@RequestParam(value="file") MultipartFile file,HttpServletRequest req,String memId){
        // 获取要上传的目标位置，即是项目的upload文件夹所在的绝对路径
        //如果添加了tomcat的虚拟映射路径，需要先新建一个upload文件夹
        String path = "D:/user/headimage";
        // 获取文件的扩展名
        String ext = FilenameUtils.getExtension(file.getOriginalFilename());
        String filename = memId+"."+ ext;
        // 写入文件成功之后，返回的数据，也就是数据库里要存的文件的url
        String src="/userheadimg/"+filename;
        File targetFile= new File(path,filename);
        try {
            if(!targetFile.exists()){
                //写入文件
                file.transferTo(targetFile);
            }
            return src;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //写入文件失败，则返回空字符串
        return "";
    }
}

