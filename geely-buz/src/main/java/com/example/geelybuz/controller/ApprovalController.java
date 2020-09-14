package com.example.geelybuz.controller;

import com.geely.business.train.ticketapproval.client.ApprovalService;
import com.geely.business.train.ticketcommon.approval.HandleApprovalBody;
import com.geely.business.train.ticketcommon.approval.request.ApplyApprovalRequest;
import com.geely.business.train.ticketcommon.approval.response.ApplyApprovalResponse;
import com.geely.business.train.ticketcommon.approval.response.CheckApprovalResponse;
import com.geely.business.train.ticketcommon.approval.response.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        return approvalService.startApproval(applyApprovalRequest);
    }

    /**
     * 查看审批流接口
     * @param approvalId
     * @return
     */
    @GetMapping("/approval/getApprovalFlow/{approvalId}")
    CheckApprovalResponse checkApprovalFlow(@PathVariable Integer approvalId) {
        return approvalService.checkApprovalFlow(approvalId);
    }

    /**
     * 人工审批操作接口
     * @param approvalId
     * @param approvalBody
     * @return
     */
    @PutMapping("/approvalTmc/serviceHandleApproval/{approvalId}")
    Response handleApprovalManually(@PathVariable Integer approvalId, @RequestBody HandleApprovalBody approvalBody) {
        return approvalService.handleApprovalManually(approvalId, approvalBody);
    }

    /**
     * 催审接口
     * @param approvalId
     * @return
     */
    @GetMapping("/approval/urgeApproval/{approvalId}")
    Response urgeApproval(@PathVariable Integer approvalId) {
        return approvalService.urgeApproval(approvalId);
    }

    /**
     * 关闭审批接口
     * @param approvalId
     * @return
     */
    @GetMapping("/approval/closeApproval/{approvalId}")
    Response closeApproval(@PathVariable Integer approvalId) {
        return approvalService.closeApproval(approvalId);
    }



}
