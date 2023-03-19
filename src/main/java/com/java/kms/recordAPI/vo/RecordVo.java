package com.java.kms.recordAPI.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecordVo {
    private String id;
    private String recordName;
    private String createDate;
    private String updateDate;
}
