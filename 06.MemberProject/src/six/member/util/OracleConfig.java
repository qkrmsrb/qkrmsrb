package six.member.util;

public interface OracleConfig {
	//interface�� ����� ����� ��� public static final �� �ڵ����� ����
	//interface�� �߻�޼��带 ����Ұ�� abstract �ڵ����� ����
	String DRIVER="oracle.jdbc.driver.OracleDriver";
	String URL="jdbc:oracle:thin:@localhost:1521:xe";
	String USER="scott";
	String PASS="tiger";
}