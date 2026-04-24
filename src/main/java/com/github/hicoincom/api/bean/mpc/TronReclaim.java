package com.github.hicoincom.api.bean.mpc;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * @author ChainUp Custody
 * TronReclaim response data, https://custodydocs-zh.chainup.com/api-references/mpc-apis/apis/tron/reclaim
 */
public class TronReclaim implements Serializable {

    private static final long serialVersionUID = 3801625497234561890L;

    /**
     * The unique identifier for the reclaim request
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
