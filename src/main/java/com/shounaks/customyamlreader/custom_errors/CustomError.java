package com.shounaks.customyamlreader.custom_errors;


public record CustomError(int errorId, String errorMessage, String legacyErrorId, String legacyErrorMessage) {
}
