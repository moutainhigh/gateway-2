package com.zdmoney.credit.api.waimao3.service;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.zdmoney.credit.common.annotate.FuncIdAnnotate;
import com.zdmoney.credit.common.vo.FuncResult;
import com.zdmoney.credit.framework.vo.wm3.input.WM3_5201Vo;
import com.zdmoney.credit.wm3Ws.service.Request;

/**
 *  溢缴款账户开户
 *
 */
@Service
public class WM3_5201Service extends Wm3BusinessService {
	
	/**
     * 账户开户接口
     * @param vo
     * @return
     * @throws  
     */
    @FuncIdAnnotate(value = "wm3_5201", desc = "账户开户接口", voCls = WM3_5201Vo.class)
    public FuncResult execute(WM3_5201Vo vo) {
        /** 封装请求参数 **/
        Request request = this.getRequestVo();
        /** 账户开户接口 **/
        request.setTxCode("5201");
        /** 设定业务请求参数 **/
        String content = JSONObject.toJSONString(vo);
        request.setContent(content);
        /** 调用账户开户接口 **/
        return this.process(request);
    }

}
