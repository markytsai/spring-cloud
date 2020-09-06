package com.example.geelybuz.service;

import com.example.geelybuz.client.ApprovalService;
import com.geely.business.train.ticketcommon.approval.HandleApprovalBody;
import com.geely.business.train.ticketcommon.approval.request.ApplyApprovalRequest;
import com.geely.business.train.ticketcommon.approval.response.ApplyApprovalResponse;
import com.geely.business.train.ticketcommon.approval.response.CheckApprovalResponse;
import com.geely.business.train.ticketcommon.approval.response.Response;
import org.springframework.stereotype.Service;

/**
 * @Author caizhenya
 * @Date 2020/9/3
 * @Descrition
 **/
@Service
public class ApprovalServiceImpl implements ApprovalService {

    @Override
    public ApplyApprovalResponse startApproval(ApplyApprovalRequest applyApprovalRequest) {
        return null;
    }

    @Override
    public CheckApprovalResponse checkApprovalFlow(Integer approvalId) {
        return null;
    }

    @Override
    public Response handleApprovalManually(Integer approvalId, HandleApprovalBody approvalBody) {
        return null;
    }

    @Override
    public Response urgeApproval(Integer approvalId) {
        return null;
    }

    @Override
    public Response closeApproval(Integer approvalId) {
        return null;
    }
}
