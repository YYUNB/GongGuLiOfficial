package back.request;

import java.io.Serializable;

public record Login_Request(String userId, String password) implements Serializable {}