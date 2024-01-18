package com.example.java_thirdtermproject_pjatk.exception;

import java.time.Instant;

public record ErrorResponse(Instant occurrenceTime, String message) {
}
