package com.example.geelybuz.controller;

import com.geely.business.train.ticketapproval.client.TmcService;
import com.geely.business.train.ticketapproval.client.TripApplicationService;
import com.geely.business.train.ticketcommon.approval.request.AvailableTripApplicationRequest;
import com.geely.business.train.ticketcommon.approval.request.UserQueryRequest;
import com.geely.business.train.ticketcommon.approval.response.AvailableTripResponse;
import com.geely.business.train.ticketcommon.approval.response.UserQueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author caizhenya
 * @Date 2020/9/10
 * @Descrition
 **/
@RestController
public class TmcServiceController {

    @Autowired
    private TmcService tmcService;

    @PostMapping("/regulation/reserve/getUserAndSceneByUser")
    UserQueryResponse getUserAndSceneByUser(@RequestBody UserQueryRequest userQueryRequest){
        return tmcService.getUserAndSceneByUser(userQueryRequest);
    }
}
