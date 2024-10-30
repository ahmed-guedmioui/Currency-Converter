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


    fun onAction(action: ExchangeAction) {
        when (action) {
            ExchangeAction.Clear -> {
                state = state.copy(
                    amount = "",
                    result = "",
                )
            }

            ExchangeAction.Delete -> {
                if (state.amount.isBlank()) return

                state = state.copy(
                    amount = state.amount.dropLast(1)
                )

                convert()

            }

            is ExchangeAction.Input -> {
                state = state.copy(
                    amount = state.amount + action.value
                )

                convert()
            }

            is ExchangeAction.SelectedFrom -> {
                state = state.copy(
                    from = state.allCurrencies[action.index]
                )

                convert()
            }

            is ExchangeAction.SelectedTo -> {
                state = state.copy(
                    to = state.allCurrencies[action.index]
                )

                convert()
            }
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