package com.example.geelybuz.client;

import com.geely.business.train.ticketcommon.approval.request.AvailableTripApplicationRequest;
import com.geely.business.train.ticketcommon.approval.response.AvailableTripResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author caizhenya
 * @Date 2020/9/3
 * @Descrition 公出单模块
 **/
@FeignClient(name = "")
public interface TripApplicationService {


    /**
     * 通过用户查询可用公出单接口
     * @param request
     * @return
     */
    @PostMapping("/tripApplication/queryByPersonal")
    AvailableTripResponse queryByPersonal(AvailableTripApplicationRequest request);

    /**
     * 火车票公出单详情接口
     * @param id
     * todo 火车票公出单待对接，数据结构有待定义
     */
    @GetMapping("/tripApplication/tripTrainByTripId")
    void tripTrainByTripId(@RequestParam Integer id);

}
