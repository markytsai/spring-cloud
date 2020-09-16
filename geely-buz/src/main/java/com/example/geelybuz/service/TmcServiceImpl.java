package com.example.geelybuz.service;

import com.geely.business.train.ticketapproval.client.TmcService;
import com.geely.business.train.ticketcommon.approval.request.UserQueryRequest;
import com.geely.business.train.ticketcommon.approval.response.UserQueryResponse;
import com.geely.business.train.ticketcommon.approval.result.datacenter.UserCard;
import com.geely.business.train.ticketcommon.approval.result.datacenter.UserInfoResult;
import com.geely.business.train.ticketcommon.approval.result.tmc.UserQueryResult;
import com.geely.business.train.ticketcommon.approval.result.tmc.entity.UserBusinessSceneResult;
import org.springframework.stereotype.Service;

import javax.smartcardio.Card;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author caizhenya
 * @Date 2020/9/15
 * @Descrition
 **/
@Service
public class TmcServiceImpl implements TmcService {

    @Override
    public UserQueryResponse getUserAndSceneByUser(UserQueryRequest userQueryRequest) {
        UserQueryResponse userQueryResponse = new UserQueryResponse();
        userQueryResponse.setCode("Z000");

        UserQueryResult userQueryResult = new UserQueryResult();
        userQueryResponse.setResult(userQueryResult);

        UserInfoResult userPersonResponse = new UserInfoResult();
        List<UserCard> userCards = new ArrayList<>();
        userPersonResponse.setUserCards(userCards);
        userQueryResult.setUserPersonResponse(userPersonResponse);

        List<UserBusinessSceneResult> userBusinessSceneResults = new ArrayList<>();
        userQueryResult.setUserBusinessSceneResults(userBusinessSceneResults);
        UserBusinessSceneResult userBusinessSceneResult = new UserBusinessSceneResult();

//        userBusinessSceneResult.setBusinessNameResponse();
//        userBusinessSceneResult.setTravelPoliciesResults();





        return userQueryResponse;
    }
}
