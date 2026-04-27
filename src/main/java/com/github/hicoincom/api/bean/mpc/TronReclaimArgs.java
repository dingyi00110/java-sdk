package com.github.hicoincom.api.bean.mpc;

import com.alibaba.fastjson.annotation.JSONField;
import com.github.hicoincom.api.bean.BaseArgs;

import java.io.Serializable;

/**
 * @author ChainUp Custody
 * TronReclaimArgs args
 */
public class TronReclaimArgs extends BaseArgs implements Serializable {

    private static final long serialVersionUID = 7392845610234781920L;

    /**
     * The unique identifier for the reclaim request
     * required : true
     */
    @JSONField(name = "request_id")
    private String requestId;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
