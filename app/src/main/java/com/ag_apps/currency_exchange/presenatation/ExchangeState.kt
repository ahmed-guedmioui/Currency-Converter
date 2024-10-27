package com.ag_apps.currency_exchange.presenatation

import com.ag_apps.currency_exchange.domain.Currency

/**
 * @author Ahmed Guedmioui
 */
data class ExchangeState(
    val from: Currency = Currency("United States Dollar", "USD"),
    val to: Currency = Currency("Euro", "EUR"),
    val amount: String = "1",
    val result: String = "",
    val allCurrencies: List<Currency> = emptyList()
)
