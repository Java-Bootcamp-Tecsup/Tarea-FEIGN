package com.codigo.apis_externas.dto;

public record ReniecCambioResponse(
        String price,
        String base_currency,
        String quote_currency,
        String date
) {
}
