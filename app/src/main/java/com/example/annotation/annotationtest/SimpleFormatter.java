package com.example.annotation.annotationtest;

import java.lang.reflect.Field;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * 通用格式转换输出类
 */
public class SimpleFormatter {

    /**
     * 通用格式化方法==>将obj对象输出为String
     * @param obj
     * @return
     */
    public static String format(Object obj){
        try{
            Class<?> cls = obj.getClass();
            StringBuilder builder = new StringBuilder();
            for (Field field : cls.getDeclaredFields()) {
                if(!field.isAccessible()){
                    field.setAccessible(true);//放弃java安全检测，设置可以访问私有字段
                }
                //获取Label注解-输出的字段名称
                Label label = field.getAnnotation(Label.class);
                String name = null == label ? field.getName() : label.value();
                //获取字段对应的value
                Object value = field.get(obj);
                //如果是Date类型，走时间格式化
                if(null != value && field.getType() == Date.class){
                    value = formatter(field,value);
                }
                builder.append(name + "?" + value + "\n");
            }
            return builder.toString();
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("格式化输出失败:"+e.getMessage());
        }
    }

    /**
     * 针对时间类型字段进行格式化的方法
     */
    private static Object formatter(Field field, Object value) {
        Formats format = field.getAnnotation(Formats.class);
        if(null == format){
            return value;
        }
        String pattern = format.pattern();
        String timezone = format.timezone();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        sdf.setTimeZone(TimeZone.getTimeZone(timezone));
        return sdf.format(value);
    }
}