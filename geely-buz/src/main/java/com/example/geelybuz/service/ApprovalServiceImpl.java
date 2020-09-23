package com.example.geelybuz.service;

import com.example.geelybuz.aspect.LogAspect;
import com.geely.business.train.ticketapproval.client.ApprovalService;
import com.geely.business.train.ticketcommon.approval.HandleApprovalBody;
import com.geely.business.train.ticketcommon.approval.msg.ApprovalEvent;
import com.geely.business.train.ticketcommon.approval.request.ApplyApprovalRequest;
import com.geely.business.train.ticketcommon.approval.request.ApprovalLevelDataRequest;
import com.geely.business.train.ticketcommon.approval.response.ApplyApprovalResponse;
import com.geely.business.train.ticketcommon.approval.response.CheckApprovalResponse;
import com.geely.business.train.ticketcommon.approval.response.GeelyResponse;
import com.geely.business.train.ticketcommon.approval.result.ApplyApprovalResult;
import com.geely.business.train.ticketcommon.enums.geely.ApprovalTypeEnum;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @Author caizhenya
 * @Date 2020/9/3
 * @Descrition
 **/
@Service
public class ApprovalServiceImpl implements ApprovalService {

    private static final Logger logger = LoggerFactory.getLogger(ApprovalServiceImpl.class);

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    private final String topicName = "approval-topic";
    private final int delayLevel = 4;
    private Random r = new Random(10);

    @Override
    public ApplyApprovalResponse startApproval(ApplyApprovalRequest applyApprovalRequest) {
        ApplyApprovalResponse response = new ApplyApprovalResponse();
        ApplyApprovalResult result = new ApplyApprovalResult();
        int approvalId = r.nextInt(99999999);
        result.setId(approvalId);
        response.setResult(result);

        ApprovalEvent event = new ApprovalEvent();
        event.setApplyType(ApprovalTypeEnum.NEED_APPROVAL.getCode());
        event.setApprovalId(approvalId + "");
        event.setApprovalStatus("2");
        event.setUsername("蔡振亚");

        Message<ApprovalEvent> message = MessageBuilder.withPayload(event).build();

        rocketMQTemplate.asyncSend(topicName, message, new SendCallback() {
            @Override
            public void onSuccess(SendResult sendResult) {
                logger.info("发送消息成功, {}, {}", event, sendResult);
            }

            @Override
            public void onException(Throwable throwable) {
                logger.info("发送消息失败, {}, {}", event, throwable);
            }
        }, 3000, delayLevel);
        return response;
    }

    @Override
    public CheckApprovalResponse checkApprovalFlow(Integer approvalId) {
        CheckApprovalResponse response = new CheckApprovalResponse();
        return response;
    }

    @Override
    public GeelyResponse handleApprovalManually(Integer approvalId, HandleApprovalBody approvalBody) {
        GeelyResponse response = new GeelyResponse<>();
        return response;
    }

    @Override
    public GeelyResponse urgeApproval(Integer approvalId) {
        GeelyResponse response = new GeelyResponse<>();
        return response;
    }

    @Override
    public GeelyResponse closeApproval(Integer approvalId) {
        GeelyResponse response = new GeelyResponse();
        return response;
    }
}
