package common;

public class Protocol {
    public static final int PORT = 30000; // 포트 번호
    public static final String SEP = "|"; // 메시지를 나누는 구분자

    // 메시지 종류 (클라이언트 -> 서버)
    public static final String JOIN = "JOIN";
    public static final String WORD = "WORD";
    public static final String CHAT = "CHAT";

    // 메시지 종류 (서버 -> 클라이언트)
    public static final String WELCOME = "WELCOME";
    public static final String RESULT  = "RESULT";

    private Protocol() {} // 생성자를 private로 막아 객체 생성을 막는다
}
