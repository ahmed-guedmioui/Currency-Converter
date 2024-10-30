package com.ag_apps.currency_exchange.data

import com.ag_apps.currency_exchange.domain.Currency
import com.ag_apps.currency_exchange.domain.ExchangeRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

/**
 * @author Ahmed Guedmioui
 */
class ExchangeRepositoryImpl(
    private val httpClient: HttpClient
) : ExchangeRepository {

    private val tag = "ExchangeRepositoryImpl: "

    private val baseUrl = "https://v6.exchangerate-api.com/v6"
    private val apiKey = "5fb12bdb7af9c5ea0d0fe2c4"

    override suspend fun convert(
        fromCurrency: String, toCurrency: String, amount: Double
    ): Double {

//        val result: ExchangeDto = httpClient.get(
//            "$baseUrl/$apiKey/pair/$fromCurrency/$toCurrency/$amount"
//        ).body()
//
//        println(tag + result.conversion_result)
//
//        return result.conversion_result

        return 243.61

    }

    override suspend fun getAllCurrencies(): List<Currency> {
        return listOf(
            Currency("UAE Dirham", "AED"),
            Currency("Afghan Afghani", "AFN"),
            Currency("Albanian Lek", "ALL"),
            Currency("Armenian Dram", "AMD"),
            Currency("Netherlands Antillian Guilder", "ANG"),
            Currency("Angolan Kwanza", "AOA"),
            Currency("Argentine Peso", "ARS"),
            Currency("Australian Dollar", "AUD"),
            Currency("Aruban Florin", "AWG"),
            Currency("Azerbaijani Manat", "AZN"),
            Currency("Bosnia and Herzegovina Mark", "BAM"),
            Currency("Barbados Dollar", "BBD"),
            Currency("Bangladeshi Taka", "BDT"),
            Currency("Bulgarian Lev", "BGN"),
            Currency("Bahraini Dinar", "BHD"),
            Currency("Burundian Franc", "BIF"),
            Currency("Bermudian Dollar", "BMD"),
            Currency("Brunei Dollar", "BND"),
            Currency("Bolivian Boliviano", "BOB"),
            Currency("Brazilian Real", "BRL"),
            Currency("Bahamian Dollar", "BSD"),
            Currency("Bhutanese Ngultrum", "BTN"),
            Currency("Botswana Pula", "BWP"),
            Currency("Belarusian Ruble", "BYN"),
            Currency("Belize Dollar", "BZD"),
            Currency("Canadian Dollar", "CAD"),
            Currency("Congolese Franc", "CDF"),
            Currency("Swiss Franc", "CHF"),
            Currency("Chilean Peso", "CLP"),
            Currency("Chinese Renminbi", "CNY"),
            Currency("Colombian Peso", "COP"),
            Currency("Costa Rican Colon", "CRC"),
            Currency("Cuban Peso", "CUP"),
            Currency("Cape Verdean Escudo", "CVE"),
            Currency("Czech Koruna", "CZK"),
            Currency("Djiboutian Franc", "DJF"),
            Currency("Danish Krone", "DKK"),
            Currency("Dominican Peso", "DOP"),
            Currency("Algerian Dinar", "DZD"),
            Currency("Egyptian Pound", "EGP"),
            Currency("Eritrean Nakfa", "ERN"),
            Currency("Ethiopian Birr", "ETB"),
            Currency("Euro", "EUR"),
            Currency("Fiji Dollar", "FJD"),
            Currency("Falkland Islands Pound", "FKP"),
            Currency("Faroese Króna", "FOK"),
            Currency("Pound Sterling", "GBP"),
            Currency("Georgian Lari", "GEL"),
            Currency("Guernsey Pound", "GGP"),
            Currency("Ghanaian Cedi", "GHS"),
            Currency("Gibraltar Pound", "GIP"),
            Currency("Gambian Dalasi", "GMD"),
            Currency("Guinean Franc", "GNF"),
            Currency("Guatemalan Quetzal", "GTQ"),
            Currency("Guyanese Dollar", "GYD"),
            Currency("Hong Kong Dollar", "HKD"),
            Currency("Honduran Lempira", "HNL"),
            Currency("Croatian Kuna", "HRK"),
            Currency("Haitian Gourde", "HTG"),
            Currency("Hungarian Forint", "HUF"),
            Currency("Indonesian Rupiah", "IDR"),
            Currency("Israeli New Shekel", "ILS"),
            Currency("Manx Pound", "IMP"),
            Currency("Indian Rupee", "INR"),
            Currency("Iraqi Dinar", "IQD"),
            Currency("Iranian Rial", "IRR"),
            Currency("Icelandic Króna", "ISK"),
            Currency("Jersey Pound", "JEP"),
            Currency("Jamaican Dollar", "JMD"),
            Currency("Jordanian Dinar", "JOD"),
            Currency("Japanese Yen", "JPY"),
            Currency("Kenyan Shilling", "KES"),
            Currency("Kyrgyzstani Som", "KGS"),
            Currency("Cambodian Riel", "KHR"),
            Currency("Kiribati Dollar", "KID"),
            Currency("Comorian Franc", "KMF"),
            Currency("South Korean Won", "KRW"),
            Currency("Kuwaiti Dinar", "KWD"),
            Currency("Cayman Islands Dollar", "KYD"),
            Currency("Kazakhstani Tenge", "KZT"),
            Currency("Lao Kip", "LAK"),
            Currency("Lebanese Pound", "LBP"),
            Currency("Sri Lanka Rupee", "LKR"),
            Currency("Liberian Dollar", "LRD"),
            Currency("Lesotho Loti", "LSL"),
            Currency("Libyan Dinar", "LYD"),
            Currency("Moroccan Dirham", "MAD"),
            Currency("Moldovan Leu", "MDL"),
            Currency("Malagasy Ariary", "MGA"),
            Currency("Macedonian Denar", "MKD"),
            Currency("Burmese Kyat", "MMK"),
            Currency("Mongolian Tögrög", "MNT"),
            Currency("Macanese Pataca", "MOP"),
            Currency("Mauritanian Ouguiya", "MRU"),
            Currency("Mauritian Rupee", "MUR"),
            Currency("Maldivian Rufiyaa", "MVR"),
            Currency("Malawian Kwacha", "MWK"),
            Currency("Mexican Peso", "MXN"),
            Currency("Malaysian Ringgit", "MYR"),
            Currency("Mozambican Metical", "MZN"),
            Currency("Namibian Dollar", "NAD"),
            Currency("Nigerian Naira", "NGN"),
            Currency("Nicaraguan Córdoba", "NIO"),
            Currency("Norwegian Krone", "NOK"),
            Currency("Nepalese Rupee", "NPR"),
            Currency("New Zealand Dollar", "NZD"),
            Currency("Omani Rial", "OMR"),
            Currency("Panamanian Balboa", "PAB"),
            Currency("Peruvian Sol", "PEN"),
            Currency("Papua New Guinean Kina", "PGK"),
            Currency("Philippine Peso", "PHP"),
            Currency("Pakistani Rupee", "PKR"),
            Currency("Polish Złoty", "PLN"),
            Currency("Paraguayan Guaraní", "PYG"),
            Currency("Qatari Riyal", "QAR"),
            Currency("Romanian Leu", "RON"),
            Currency("Serbian Dinar", "RSD"),
            Currency("Russian Ruble", "RUB"),
            Currency("Rwandan Franc", "RWF"),
            Currency("Saudi Riyal", "SAR"),
            Currency("Solomon Islands Dollar", "SBD"),
            Currency("Seychellois Rupee", "SCR"),
            Currency("Sudanese Pound", "SDG"),
            Currency("Swedish Krona", "SEK"),
            Currency("Singapore Dollar", "SGD"),
            Currency("Saint Helena Pound", "SHP"),
            Currency("Sierra Leonean Leone", "SLE"),
            Currency("Somali Shilling", "SOS"),
            Currency("Surinamese Dollar", "SRD"),
            Currency("South Sudanese Pound", "SSP"),
            Currency("São Tomé and Príncipe Dobra", "STN"),
            Currency("Syrian Pound", "SYP"),
            Currency("Eswatini Lilangeni", "SZL"),
            Currency("Thai Baht", "THB"),
            Currency("Tajikistani Somoni", "TJS"),
            Currency("Turkmenistan Manat", "TMT"),
            Currency("Tunisian Dinar", "TND"),
            Currency("Tongan Paʻanga", "TOP"),
            Currency("Turkish Lira", "TRY"),
            Currency("Trinidad and Tobago Dollar", "TTD"),
            Currency("Tuvaluan Dollar", "TVD"),
            Currency("New Taiwan Dollar", "TWD"),
            Currency("Tanzanian Shilling", "TZS"),
            Currency("Ukrainian Hryvnia", "UAH"),
            Currency("Ugandan Shilling", "UGX"),
            Currency("United States Dollar", "USD"),
            Currency("Uruguayan Peso", "UYU"),
            Currency("Uzbekistani So'm", "UZS"),
            Currency("Venezuelan Bolívar Soberano", "VES"),
            Currency("Vietnamese Đồng", "VND"),
            Currency("Vanuatu Vatu", "VUV"),
            Currency("Samoan Tālā", "WST"),
            Currency("Central African CFA Franc", "XAF"),
            Currency("East Caribbean Dollar", "XCD"),
            Currency("Special Drawing Rights", "XDR"),
            Currency("West African CFA franc", "XOF"),
            Currency("CFP Franc", "XPF"),
            Currency("Yemeni Rial", "YER"),
            Currency("South African Rand", "ZAR"),
            Currency("Zambian Kwacha", "ZMW"),
            Currency("Zimbabwean Dollar", "ZWL")
        )
    }
}