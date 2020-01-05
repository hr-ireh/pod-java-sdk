package com.fanap.podProduct.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class JacksonUtil {
    public static final ObjectMapper mapper = new ObjectMapper();

    static {
        SimpleModule module = new SimpleModule();
        module.addSerializer(BigDecimal.class, new ToStringSerializer());
        module.addDeserializer(BigDecimal.class, new FromStringDeserializer<BigDecimal>(BigDecimal.class) {
            @Override
            protected BigDecimal _deserialize(String s, DeserializationContext deserializationContext) {
                return new BigDecimal(s);
            }
        });
        mapper.registerModule(module);
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        mapper.setDateFormat(df);
        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public static ObjectMapper getObjectMapper() {
        return mapper;
    }

    public static <T> T getObject(byte[] json, Class<T> classOfT) {
        try {
            return mapper.readValue(new String(json, "utf-8"), classOfT);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <B> B getObject(String json, Class<B> mainClass , Class[] parametricClasses) {
        JavaType type = mapper.getTypeFactory().constructParametricType(mainClass, parametricClasses);
        try {
            return mapper.readValue(json, type);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static <T> T getObject(String json, Class<T> classOfT) {
        try {
            return mapper.readValue(json, classOfT);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static <T> T getObject(String json, TypeReference<T> typeReference) {
        try {
            return mapper.readValue(json, typeReference);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
