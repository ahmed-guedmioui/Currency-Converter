package com.ag_apps.currency_exchange.data

import kotlinx.serialization.Serializable

@Serializable
data class ExchangeDto(
    val conversion_result: Double
)