package com.example.geelybuz.service;

import com.geely.business.train.ticketapproval.client.DataCenterService;
import com.geely.business.train.ticketcommon.approval.response.*;
import com.geely.business.train.ticketcommon.approval.result.datacenter.*;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author caizhenya
 * @Date 2020/9/10
 * @Descrition
 **/
@Service
public class DataCenterServiceImpl implements DataCenterService {
    @Override
    public CostCenterDataResponse findCostCenterInfoByUserCode(@NotNull String userCode, @NotNull String businessCode, @NotNull String sceneId) {
        CostCenterDataResponse response = new CostCenterDataResponse();
        response.setCode("Z000");
        CostCenterDataResult costCenterDataResult = new CostCenterDataResult();
        costCenterDataResult.setCostCenterManualFlag("flag");
        costCenterDataResult.setCostCenterTitle("tile");
        List<CostCenter> costCenterList = new ArrayList<>();
        CostCenter costCenter = new CostCenter();
        costCenter.setCostCenterCode("11111");
        costCenterList.add(costCenter);

        CostCenter costCenter1 = new CostCenter();
        costCenter1.setCostCenterCode("2222");
        costCenterList.add(costCenter1);

        CostCenter costCenter2 = new CostCenter();
        costCenter2.setCostCenterCode("3333");
        costCenterList.add(costCenter2);

        costCenterDataResult.setCostCenterList(costCenterList);
        response.setResult(costCenterDataResult);
        return response;
    }

    @Override
    public TicketFeeResponse serviceFee(@NotNull String businessCode, @NotNull String serviceBusinessType) {
        TicketFeeResponse response = new TicketFeeResponse();
        TicketFeeResult result = new TicketFeeResult();
        result.setFeeCollectType("1");
        result.setOfflineFee(20.0);
        result.setOnlineFee(20.0);
        response.setResult(result);
        return response;
    }

    @Override
    public UserInfoResponse getUserInfo(@NotNull String userCode) {
        UserInfoResult userInfoResult = new UserInfoResult();

        UserInfoResponse response = new UserInfoResponse();
        response.setResult(userInfoResult);
        response.setCode("Z000");
//        throw new RuntimeException("test");
        return response;
    }

    @Override
    public SisReceptionUserResponse findSmsReception(@NotNull String userCode, @NotNull String passengerCode) {
        SisReceptionUserResponse response = new SisReceptionUserResponse();
        return response;
    }

    @Override
    public OptionalBusinessResponse queryOptionalBusinessList(@NotNull String businessCode) {
        OptionalBusinessResponse response = new OptionalBusinessResponse();
        List<OptionalBusiness> businesses = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {
            OptionalBusiness business = new OptionalBusiness();
            business.setOptionalBusinessCode(i + "" + "" + i);
            business.setOptionalBusinessName("测试公司" + i);
            businesses.add(business);
        }
        response.setResult(businesses);
        return response;
    }

    @Override
    public PublicBillResponse publicBill(@NotNull String businessCode) {
        PublicBillResponse response = new PublicBillResponse();
        return response;
    }

    @Override
    public BusinessSwitchResponse queryBusinessSwitch(String businessCode) {
        BusinessSwitchResponse response = new BusinessSwitchResponse();
        return response;
    }
}
