package roomescape.auth.domain;

import jakarta.servlet.http.HttpServletRequest;
import roomescape.exception.auth.AuthTokenNotFoundException;

public interface AuthTokenExtractor<T> {

    String AUTH_TOKEN_NAME = "token";

    T extract(HttpServletRequest request) throws AuthTokenNotFoundException;
}
