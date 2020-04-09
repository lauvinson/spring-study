package com.lauvinson.nodeport.impl;

import com.lauvinson.nodeport.i.MessageService;

/**
 * 生产发布
 */
public class Producer implements MessageService{
    @Override
    public String getMessage() {
        return this.getClass().getName();
    }
}
