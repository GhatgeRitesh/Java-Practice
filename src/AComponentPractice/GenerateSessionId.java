package AComponentPractice;

import java.util.UUID;

public class GenerateSessionId {
    public static void main(String[] args) {
        String sessionId= UUID.randomUUID().toString();
        System.out.println(sessionId);
    }
}
