package com.itheima.pojo;

import lombok.Data;

@Data
public class Bangumi {
    private Integer id;
    private String name;
    private Integer type;
    private Integer time;
    private Integer status;
    private Integer year;
    private String picture;
    private Integer userId;

//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getType() {
//        return type;
//    }
//    public String getTypeStr(){
//        switch (type) {
//            case 1: {
//                return "番剧";
//            }
//            case 2: {
//                return "剧场版";
//            }
//            case 3: {
//                return "ova";
//            }
//            case 4: {
//                return "长篇";
//            }
//            default: {
//                return "未知";
//            }
//        }
//    }
//    public void setType(Integer type) {
//        this.type = type;
//    }
//
//    public Integer getTime() {
//        return time;
//    }
//    public String getTimeStr(){
//        switch (time) {
//            case 1: {
//                return "1月番";
//            }
//            case 4: {
//                return "4月番";
//            }
//            case 7: {
//                return "7月番";
//            }
//            case 10: {
//                return "10月番";
//            }
//            default: {
//                return "未知";
//            }
//        }
//    }
//
//    public void setTime(Integer time) {
//        this.time = time;
//    }
//
//    public Integer getStatus() {
//        return status;
//    }
//    public String getStatusStr(){
//        switch (status) {
//            case 1: {
//                return "看完";
//            }
//            case 2: {
//                return "没看";
//            }
//            case 3: {
//                return "待定";
//            }
//            default: {
//                return "未知";
//            }
//        }
//    }
//    public void setStatus(Integer status) {
//        this.status = status;
//    }
//
//    public Integer getYear() {
//        return year;
//    }
//
//    public void setYear(Integer year) {
//        this.year = year;
//    }
//
//    public String getPicture() {
//        return picture;
//    }
//
//    public void setPicture(String picture) {
//        this.picture = picture;
//    }
//
//    public Bangumi() {
//    }
//
//
//    @Override
//    public String toString() {
//        return "Bangumi{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", type=" + type +
//                ", time=" + time +
//                ", status=" + status +
//                ", year=" + year +
//                ", picture='" + picture + '\'' +
//                ", userId='" + userId + '\'' +
//                '}';
//    }
//
//    public Bangumi(Integer id, String name, Integer type, Integer time, Integer status, Integer year, String picture, Integer userId) {
//        this.id = id;
//        this.name = name;
//        this.type = type;
//        this.time = time;
//        this.status = status;
//        this.year = year;
//        this.picture = picture;
//        this.userId = userId;
//    }
//
//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }
}
