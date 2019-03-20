package com.suke.communitymanage.controller;

import com.suke.communitymanage.bean.Member;
import com.suke.communitymanage.service.MemberService;
import com.suke.communitymanage.utils.Msg;
import com.suke.communitymanage.utils.UploadUtil;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/users")
public class MemberController {
    @Autowired
    MemberService memberService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ResponseBody
    public Msg insertPicture(@Valid Member member, BindingResult bindingResult,HttpServletRequest request, Model model) throws IOException{

        // pictureURL是数据库里picture_url的值，这里用到一个封装的工具类UploadUtil
        String pictureURL= UploadUtil.imageUpload(member.getFile(), request);
        System.out.println("pictureURL:" + pictureURL);
        //获取上传时的文件名
        String pictureName = FilenameUtils.getName(member.getFile().getOriginalFilename());
        System.out.println("pictureName:" + pictureName);
        // 把图片数据保存到数据库
//        Picture picture = new Picture();
//        picture.setPictureName(pictureName);
//        picture.setPictureUrl(pictureURL);
//        picture.setPictureOwner(pOwner);

       // int insert = pictureService.insert(picture);


        memberService.save_member(member);
        model.addAttribute("member", member);
        return Msg.success();
    }









//
//    //用户注册
//    @RequestMapping(value = "/save",method = RequestMethod.POST)
//    @ResponseBody
//    public Msg saveMember(@Valid Member member, BindingResult bindingResult,HttpServletRequest request, Model model) throws IOException {
//
//
//        Map<String,Object> map=new HashMap<String, Object>();
//        if (bindingResult.hasErrors()){
//            List<FieldError> list= bindingResult.getFieldErrors();
//            for (FieldError fError:list
//                    ) {
////               fError.getField();
////               fError.getDefaultMessage();
//                map.put(fError.getField(),fError.getDefaultMessage());
//            }
//            return Msg.fail().add("errorFields",map);
//        }else {
//
//
//
//
//            //保存数据库的路径
//            String sqlPath = null;
//            //定义文件保存的本地路径
//            String localPath="D:\\File\\";
//            //定义 文件名
//            String filename=null;
//            System.out.print(member.getFile());
//            if(!member.getFile().isEmpty()){
//                //生成uuid作为文件名称
//                String uuid = member.getMemberId();
//                //获得文件类型（可以判断如果不是图片，禁止上传）
//                String contentType=member.getFile().getContentType();
//                //获得文件后缀名
//                String suffixName=contentType.substring(contentType.indexOf("/")+1);
//                //得到 文件名
//                filename=uuid+"."+suffixName;
//                //文件保存路径
//                member.getFile().transferTo(new File(localPath+filename));
//            }
//            //把图片的相对路径保存至数据库
//            sqlPath = "/images/"+filename;
//            System.out.println(sqlPath);
//            member.setHeadImg(sqlPath);
//
//            memberService.save_member(member);
//            model.addAttribute("member", member);
//
//
//
//
//            return Msg.success();
//        }
//
//    }

//用户注册id审核
@RequestMapping(value = "/check/{memberId}",method = RequestMethod.GET)
@ResponseBody
public Msg checkId(@PathVariable String memberId){
    String regId="^(1)(\\d{11})$";
    if (!memberId.matches(regId)){
        return Msg.fail().add("info","用户学号不符合规则");
    }
    boolean b=memberService.checkId(memberId);
    if (b){
        return Msg.success().add("info","此用户Id可以使用");
    }else {
        return Msg.fail().add("info","用户Id已经被使用");
    }
}
   //社团成员登陆
    @RequestMapping(value = "/login/{memberId}/{memberPassword}",method = RequestMethod.GET)
    @ResponseBody
    public Msg login(@PathVariable String memberId, @PathVariable String memberPassword, HttpSession session){
        //如果用户id不存在告知
Member member=memberService.hasMember(memberId);
        if (member==null){

            return    Msg.fail().add("info","账户不存在");
        }else {
            if (  !member.getMemberPassword().equals(memberPassword)){
                return    Msg.fail().add("info","密码错误");
            }else {
                session.setAttribute("member",member);
                return  Msg.success();
            }

        }

    }
    //从index进入登陆页面
    @RequestMapping("/loginjsp")
    public String loginjsp(){
        return "memberLogin";
    }
}
