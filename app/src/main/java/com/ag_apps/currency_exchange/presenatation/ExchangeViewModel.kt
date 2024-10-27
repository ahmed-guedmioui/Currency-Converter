package com.ag_apps.currency_exchange.presenatation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ag_apps.currency_exchange.domain.ConvertUserCase
import com.ag_apps.currency_exchange.domain.ExchangeRepository
import kotlinx.coroutines.launch

/**
 * @author Ahmed Guedmioui
 */
class ExchangeViewModel(
    private val convertUserCase: ConvertUserCase,
    private val exchangeRepository: ExchangeRepository
) : ViewModel() {

    var state by mutableStateOf(ExchangeState())
        private set

    init {
        viewModelScope.launch {
            convert()
            state = state.copy(
                allCurrencies = exchangeRepository.getAllCurrencies()
            )
        }
    }


    private fun convert() {
        viewModelScope.launch {
            state = state.copy(
                result = convertUserCase(
                    fromCurrency = state.from.code,
                    toCurrency = state.to.code,
                    amount = state.amount
                )
            )
        }
    }

}