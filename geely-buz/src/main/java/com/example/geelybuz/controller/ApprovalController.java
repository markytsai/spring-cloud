package com.example.geelybuz.controller;

import com.example.geelybuz.client.ApprovalService;
import com.geely.business.train.ticketcommon.approval.request.ApplyApprovalRequest;
import com.geely.business.train.ticketcommon.approval.response.ApplyApprovalResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author caizhenya
 * @Date 2020/9/3
 * @Descrition
 **/
@RestController
public class ApprovalController {

    @Autowired
    private ApprovalService approvalService;

    @PostMapping("/approval/startApproval")
    ApplyApprovalResponse startApproval(ApplyApprovalRequest applyApprovalRequest) {
        return new ApplyApprovalResponse();
    }
}
