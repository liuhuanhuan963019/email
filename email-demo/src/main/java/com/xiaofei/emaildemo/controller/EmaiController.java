package com.xiaofei.emaildemo.controller;

import com.xiaofei.emaildemo.constant.MailConst;
import com.xiaofei.emaildemo.entity.EmailEntity;
import com.xiaofei.emaildemo.pojo.Email;
import com.xiaofei.emaildemo.util.EmailUtil;
import com.xiaofei.emaildemo.util.MailSenderUtil;
import com.xiaofei.emaildemo.util.Result;
import com.xiaofei.emaildemo.util.StatusCode;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;

@RestController
@RequestMapping("email")
@CrossOrigin
public class EmaiController {

    @RequestMapping
    public Result tests(){
        return new Result(true, StatusCode.OK,"成功！");
    }

    @RequestMapping(method = RequestMethod.POST)
    public Result test(@RequestBody Map<String,String> map){
        try{
            EmailEntity emailEntity = new EmailEntity();
            ArrayList<String> emailArray = new ArrayList<>();
            //测试，收取邮件的邮箱，可以填写自己的发送邮件的邮箱
            emailArray.add(map.get("email"));
            emailEntity.setToList(emailArray);
            emailEntity.setSubject(map.get("title"));
            emailEntity.setContext(map.get("content"));
            emailEntity.setUserName(MailConst.USER_NAME);
            emailEntity.setAuth(MailConst.MAIL_SMTP_AUTH);
            emailEntity.setPassword(MailConst.PWD_CODE);
            emailEntity.setHost(MailConst.MAIL_HOST);
            MailSenderUtil.sendMailToUserArray(emailEntity);
            return new Result(true, StatusCode.OK,"发送成功！");
        }catch (Exception e){
            return new Result(false,StatusCode.ERROR,"发送失败！");
        }


    }
}
