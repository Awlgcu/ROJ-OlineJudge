package com.yupi.rojbackendmodel.model.codesandbox;

import lombok.Data;

@Data
public class JudgeInfo {
    //执行信息
    String message;
    //内存限制-kb
    Long memory;
    //时间限制-ms
    Long time;
}
