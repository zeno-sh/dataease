package io.dataease.controller.request.datasource;

import com.google.gson.JsonObject;
import io.dataease.plugins.common.base.domain.DatasetTableField;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ApiDefinition {
    private String name;
    private String desc;
    private String url;
    private String method = "GET";
    private List<DatasetTableField> fields;
    private String request;
    private String dataPath;
    private String status;
    private List<JsonObject> datas = new ArrayList<>();
}
