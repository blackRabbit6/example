package aloneStudy;

public class UserInfo {
    private static UserInfo instance;
    private String id; 
    private String name; 

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
    public String getId() { 
        return id;
    }

    // 사용자 ID 설정
    public void setId(String id) { 
        this.id = id;
    }

    // 사용자 이름 반환
    public String getName() { 
        return name;
    }

    // 사용자 이름 설정
    public void setName(String name) { 
        this.name = name;
    }
}
