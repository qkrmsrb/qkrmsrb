package six.member.util;

public interface OracleConfig {
	//interface는 상수를 명시할 경우 public static final 이 자동으로 삽입
	//interface는 추상메서드를 명시할경우 abstract 자동으로 삽입
	String DRIVER="oracle.jdbc.driver.OracleDriver";
	String URL="jdbc:oracle:thin:@localhost:1521:xe";
	String USER="scott";
	String PASS="tiger";
}