package com.example.geelybuz.service;

import com.geely.business.train.ticketapproval.client.ApprovalService;
import com.geely.business.train.ticketcommon.approval.HandleApprovalBody;
import com.geely.business.train.ticketcommon.approval.request.ApplyApprovalRequest;
import com.geely.business.train.ticketcommon.approval.response.ApplyApprovalResponse;
import com.geely.business.train.ticketcommon.approval.response.CheckApprovalResponse;
import com.geely.business.train.ticketcommon.approval.response.CostCenterDataResponse;
import com.geely.business.train.ticketcommon.approval.response.Response;
import com.geely.business.train.ticketcommon.approval.result.ApplyApprovalResult;
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
        ApplyApprovalResponse response = new ApplyApprovalResponse();
        ApplyApprovalResult result = new ApplyApprovalResult();
        result.setId(222222222);
        response.setResult(result);
        return response;
    }

    @Override
    public CheckApprovalResponse checkApprovalFlow(Integer approvalId) {
        CheckApprovalResponse response = new CheckApprovalResponse();
        return response;
    }

    @Override
    public Response handleApprovalManually(Integer approvalId, HandleApprovalBody approvalBody) {
        Response response = new Response();
        return response;
    }

    @Override
    public Response urgeApproval(Integer approvalId) {
        Response response = new Response();
        return response;
    }

    @Override
    public Response closeApproval(Integer approvalId) {
        Response response = new Response();
        return response;
    }
}
