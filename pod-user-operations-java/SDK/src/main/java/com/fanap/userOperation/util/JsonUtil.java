package com.fanap.userOperation.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

public class JsonUtil extends JacksonUtil {
    private static final ObjectMapper mapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL);

    public static String getJson(Object obj) {
        if (obj == null) return null;
        if (obj instanceof JSONArray || obj instanceof JSONObject) {
            return obj.toString();
        } else {
            try {
                ByteArrayOutputStream bout = new ByteArrayOutputStream();
                getObjectMapper().writeValue(bout, obj);
                byte[] objectBytes = bout.toByteArray();
                return new String(objectBytes, "UTF-8");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static String getValueFromJson(String key, Object json) {
        JSONObject jsonObject = new JSONObject(json.toString());
        if (!key.contains(".")) {
            return (String) jsonObject.get(key);
        } else {
            String ObjectKey = key.substring(0, key.indexOf('.'));
            String newKey = key.substring(key.indexOf('.') + 1);
            Object newJson = jsonObject.get(ObjectKey);
            return getValueFromJson(newKey, newJson);
        }
    }

    public static JSONObject getJsonObject(String json) {
        try {
            return new JSONObject(json);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static JSONArray getJsonArray(String json) {
        try {
            return new JSONArray(json);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> String toJsonArray(List<T> objectList) throws JsonProcessingException {
        return mapper.writeValueAsString(objectList);
    }
}
