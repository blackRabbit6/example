package com.acorn.jdbc;

public class UserInfo {
    private static UserInfo instance;
    private String userId;
    private String userName;

    // 생성자를 private로 선언하여 외부에서 인스턴스 생성 방지
    private UserInfo() {
        // private 생성자
    }

    // 인스턴스를 얻는 메서드
    public static UserInfo getInstance() {
        if (instance == null) {
            instance = new UserInfo();
        }
        return instance;
    }

    // 사용자 ID 반환
    public String getUserId() {
        return userId;
    }

    // 사용자 ID 설정
    public void setUserId(String userId) {
        this.userId = userId;
    }

    // 사용자 이름 반환
    public String getUserName() {
        return userName;
    }

    // 사용자 이름 설정
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
