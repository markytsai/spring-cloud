package com.example.geelybuz.client;

import com.geely.business.train.ticketcommon.approval.response.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;

/**
 * @Author caizhenya
 * @Date 2020/9/3
 * @Descrition 数据中心模块
 **/
@FeignClient
public interface DataCenterService {


    /**
     * 根据用户编码获取成本中心信息接口
     *
     * @param userCode
     * @param businessCode
     * @param asceneIda
     * @return
     */
    @GetMapping("/cost/findCostCenterInfoByUserCode")
    CostCenterDataResponse findCostCenterInfoByUserCode(@RequestParam @NotNull String userCode, @RequestParam @NotNull String businessCode, @RequestParam @NotNull String asceneIda);

    /**
     * 查询火车票服务费接口
     *
     * @param businessCode
     * @param serviceBusinessType
     * @return TicketFeeResponse
     */
    @GetMapping("/serviceResource/serviceFee")
    TicketFeeResponse serviceFee(@RequestParam @NotNull String businessCode, @RequestParam @NotNull String serviceBusinessType);

    /**
     * 根据用户编号查询用户信息接口
     *
     * @param userCode
     * @return
     */
    @GetMapping("/userPerson/getUserInfo")
    UserInfoResponse getUserInfo(@RequestParam @NotNull String userCode);

    /**
     * 获取短信通知人信息接口
     *
     * @param userCode
     * @param passengerCode
     * @return
     */
    @GetMapping("/tissueData/findSmsReception")
    SisReceptionUserResponse findSmsReception(@RequestParam @NotNull String userCode, @RequestParam @NotNull String passengerCode);


    /**
     * 根据公司编码查询费用归属可选公司列表
     *
     * @param businessCode
     */
    @GetMapping("/businessCost/queryOptionalBusinessList")
    OptionalBusinessResponse queryOptionalBusinessList(@RequestParam @NotNull String businessCode);

    /**
     * 根据公司编码查询公出单绑定信息
     *
     * @param businessCode
     */
    @GetMapping("/business/publicBill")
    publicBillReponse publicBill(@RequestParam @NotNull String businessCode);

}
