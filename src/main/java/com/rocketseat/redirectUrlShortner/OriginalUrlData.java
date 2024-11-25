package com.rocketseat.redirectUrlShortner;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class OriginalUrlData {
    private String originalUrl;
    private long expirationTime;
}
