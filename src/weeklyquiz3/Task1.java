package chap08.src.weeklyquiz3;

import java.sql.*;

public class Task1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test_db";
        String userName = "root";
        String userPw = "0000";

        // JDBC 연결 및 실행
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            System.err.println(" !! <JDBC 오류> Driver load 오류: " + e.getMessage());
//            e.printStackTrace();
//        }

        // DB 값 가져오기
        try (Connection connection = DriverManager.getConnection(url, userName, userPw);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT name, age, address FROM students WHERE age >= 30")) {

            while (resultSet.next()) {
                String name = resultSet.getString("name");   // name 컬럼 값
                int age = resultSet.getInt("age");           // age 컬럼 값
                String address = resultSet.getString("address"); // address 컬럼 값

                // 결과 출력
                System.out.println("이름: " + name + " | 나이: " + age + " | 주소: " + address);
                System.out.println("-----------------------------------");

            }

        } catch (SQLException e) {
            System.err.println("SQL 오류: " + e.getMessage()); // 단점들 때문에 실무에서는 사용하지 않음.
            // => 나중에 로거를 사용해서 서버에 출력하는 방법 사용하기.
            // e.printStackTrace();     // 오류 내용을 콘솔에 그대로 출력하는 메서드이기 때문에 절대 사용하면 안 됨.
        }
    }
}


/*
* 1. 파일 -> 프로젝트 구조 -> 라이브러리 -> 새 프로젝트 라이브러리
* 2. 다운로드한 인텔리제이 JDBC 드라이버 추가
* 3. JDBC를 통해 DBMS 연결
* 4. 관련 정보 입력 (id, pw등)
* 5. 데이터베이스명 입력 시 test_db 입력 (DB명)
* */

/*
* < 에러모음 >
* 1. ClassNotFoundException: com.mysql.cj.jdbc.Driver
*    => mysql connect 파일 중 zip 파일을 그대로 대입해서 일어난 문제.
*    => 압축을 해제해서 jar 파일만 라이브러리에 추가했으면 됐었다.
*
* 2. Loading class `com.mysql.jdbc.Driver'.
*    This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'.
*    The driver is automatically registered via the SPI and manual loading of
*    the driver class is generally unnecessary.
*    => 한 마디로 `com.mysql.jdbc.Driver' 코드 대신  `com.mysql.cj.jdbc.Driver' 를 사용해서 해결
* */