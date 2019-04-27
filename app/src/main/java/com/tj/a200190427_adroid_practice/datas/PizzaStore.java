package com.tj.a200190427_adroid_practice.datas;

public class PizzaStore {
//    가게이름, 어느 동네(구), 영업시간("09:00 ~ 21:00"), 로고파일 ☆

    public String storeName;
    public String location;
    public String openTime;
    public String imageURL; //웹상에 있는 이미지의 주소

    public PizzaStore(String storeName, String location, String openTime, String imageURL) {
        this.storeName = storeName;
        this.location = location;
        this.openTime = openTime;
        this.imageURL = imageURL;
    }
}
