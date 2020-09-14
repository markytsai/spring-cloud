package com.example.geelybuz.service;

import com.geely.business.train.ticketapproval.client.TripApplicationService;
import com.geely.business.train.ticketcommon.approval.request.AvailableTripApplicationRequest;
import com.geely.business.train.ticketcommon.approval.response.AvailableTripResponse;
import com.geely.business.train.ticketcommon.approval.result.trip.AvailableTripResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author caizhenya
 * @Date 2020/9/10
 * @Descrition
 **/
@Service
public class TripApplicationServiceImpl implements TripApplicationService {
    @Override
    public AvailableTripResponse queryByPersonal(AvailableTripApplicationRequest request) {
        AvailableTripResponse response = new AvailableTripResponse();
        List<AvailableTripResult> availableTripResults = new ArrayList<>();
        AvailableTripResult availableTripResult = new AvailableTripResult();
        availableTripResults.add(availableTripResult);
        response.setResult(availableTripResults);
        return response;
    }

    @Override
    public AvailableTripResponse tripTrainByTripId(String id) {
        AvailableTripResponse response = new AvailableTripResponse();
        List<AvailableTripResult> availableTripResults = new ArrayList<>();
        AvailableTripResult availableTripResult = new AvailableTripResult();
        availableTripResult.setTripApplicationId("11111");
        availableTripResults.add(availableTripResult);
        response.setResult(availableTripResults);
        return response;
    }
}
