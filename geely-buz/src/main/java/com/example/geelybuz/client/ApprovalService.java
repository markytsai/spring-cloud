package com.example.geelybuz.client;

import com.geely.business.train.ticketcommon.approval.HandleApprovalBody;
import com.geely.business.train.ticketcommon.approval.request.ApplyApprovalRequest;
import com.geely.business.train.ticketcommon.approval.response.ApplyApprovalResponse;
import com.geely.business.train.ticketcommon.approval.response.CheckApprovalResponse;
import com.geely.business.train.ticketcommon.approval.response.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @Author caizhenya
 * @Date 2020/9/1
 * @Descrition 审批模块
 **/
public interface ApprovalService {

    /**
     * 发起审批
     * @param applyApprovalRequest
     * @return
     */

    ApplyApprovalResponse startApproval(ApplyApprovalRequest applyApprovalRequest);


    /**
     * 查看审批流接口
     * @param approvalId
     * @return
     */
    @GetMapping("/approval/getApprovalFlow/{approvalId}")
    CheckApprovalResponse checkApprovalFlow(@PathVariable Integer approvalId);

    /**
     * 人工审批操作接口
     * @param approvalId
     * @param approvalBody
     * @return
     */
    @PutMapping("/approvalTmc/serviceHandleApproval/{approvalId}")
    Response handleApprovalManually(@PathVariable Integer approvalId, @RequestBody HandleApprovalBody approvalBody);

    /**
     * 催审接口
     * @param approvalId
     * @return
     */
    @GetMapping("/approval/urgeApproval/{approvalId}")
    Response urgeApproval(@PathVariable Integer approvalId);

    /**
     * 关闭审批接口
     * @param approvalId
     * @return
     */
    @GetMapping("/approval/closeApproval/{approvalId}")
    Response closeApproval(@PathVariable Integer approvalId);

}
