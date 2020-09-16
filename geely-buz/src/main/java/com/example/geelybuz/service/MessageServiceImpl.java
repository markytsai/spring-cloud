package com.example.geelybuz.service;

import com.geely.business.train.ticketapproval.client.MessageService;
import com.geely.business.train.ticketcommon.approval.request.MessagePushRequest;
import com.geely.business.train.ticketcommon.approval.request.SendMessageRequest;
import com.geely.business.train.ticketcommon.approval.response.GeelyResponse;
import com.geely.business.train.ticketcommon.approval.response.SendMessageResponse;
import org.springframework.stereotype.Service;

/**
 * @Author caizhenya
 * @Date 2020/9/10
 * @Descrition
 **/
@Service
public class MessageServiceImpl implements MessageService {
    @Override
    public SendMessageResponse sendMsm(SendMessageRequest request) {
        return null;
    }

    @Override
    public GeelyResponse messagePush(MessagePushRequest messagePushRequest) {
        return null;
    }
}
