package com.uniubi.cloud.luna.sdk.message.receive.example.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.uniubi.cloud.luna.sdk.message.receive.example.benas.MsgContentDTO;
import com.uniubi.cloud.luna.sdk.message.receive.example.benas.MsgResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * receive UStar Cloud service pushed message
 * @author 井木
 * @since 2022/02/24
 */
@Slf4j
@RestController
@RequestMapping
public class LunaMessageSubscribeController {

    @PostMapping("/athena/sdk/msg/receive/test")
    public MsgResult test(@RequestBody MsgContentDTO msgContentDTO) {
        log.info("收到回调消息消息 ==> {}", JSON.toJSONString(msgContentDTO));
        Byte type = msgContentDTO.getType();
        switch (type) {
            case 1:
                JSONObject jsonObject = JSON.parseObject(msgContentDTO.getContent());
                Long recTime = jsonObject.getLong("recTime");
                Date date = new Date(recTime);
                log.info("Recognition time: [{}], receive message time: [{}]", date, new Date());
                break;
            case 2:
                log.info("receive luna message which type is 2");
                break;
            case 3:
                log.info("receive luna message which type is 3");
                break;
            case 4:
                log.info("receive luna message which type is 4");
                break;
            case 5:
                log.info("receive luna message which type is 5");
                break;
            case 6:
                log.info("receive luna message which type is 6");
                break;
            case 7:
                log.info("receive luna message which type is 7");
                break;
            default:
                log.info("receive luna incorrect message,type is {} ", type);
        }
        return new MsgResult(true);
    }

}
