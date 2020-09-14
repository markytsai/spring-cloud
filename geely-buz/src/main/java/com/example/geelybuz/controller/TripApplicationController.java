package com.example.geelybuz.controller;

import com.geely.business.train.ticketapproval.client.TripApplicationService;
import com.geely.business.train.ticketcommon.approval.request.AvailableTripApplicationRequest;
import com.geely.business.train.ticketcommon.approval.response.AvailableTripResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author caizhenya
 * @Date 2020/9/10
 * @Descrition
 **/
@RestController
public class TripApplicationController  {

    @Autowired
    private TripApplicationService tripApplicationService;

    /**
     * 通过用户查询可用公出单接口
     * @param request
     * @return
     */
    @PostMapping("/tripApplication/queryByPersonal")
    AvailableTripResponse queryByPersonal(AvailableTripApplicationRequest request) {
        return tripApplicationService.queryByPersonal(request);
    }

    /**
     * 火车票公出单详情接口
     * @param id
     * todo 火车票公出单待对接，数据结构有待定义
     */
    @GetMapping("/tripApplication/tripTrainByTripId")
    AvailableTripResponse tripTrainByTripId(@RequestParam String id) {
       return  tripApplicationService.tripTrainByTripId(id);
    }
}
