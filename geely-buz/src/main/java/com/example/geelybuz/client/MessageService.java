package com.example.geelybuz.client;

import com.geely.business.train.ticketcommon.approval.request.SendMessageRequest;
import com.geely.business.train.ticketcommon.approval.response.SendMessageResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author caizhenya
 * @Date 2020/9/3
 * @Descrition
 **/
@FeignClient("")
public interface MessageService {

    /**
     * 发送短息接口
     * @param request
     * @return
     */
    @GetMapping("/sms/send")
    SendMessageResponse sendMsm(@RequestBody SendMessageRequest request);

}
