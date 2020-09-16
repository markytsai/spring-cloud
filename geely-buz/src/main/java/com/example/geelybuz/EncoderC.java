package com.example.geelybuz;

import feign.RequestTemplate;
import feign.codec.EncodeException;
import feign.codec.Encoder;

import java.lang.reflect.Type;

/**
 * @Author caizhenya
 * @Date 2020/9/16
 * @Descrition
 **/
public class EncoderC implements Encoder {

    @Override
    public void encode(Object o, Type type, RequestTemplate requestTemplate) throws EncodeException {

    }
}
