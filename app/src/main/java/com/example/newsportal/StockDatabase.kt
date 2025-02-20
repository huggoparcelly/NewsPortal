package com.example.newsportal

object StockDatabase {

    private val stockList = listOf(
        Stock(1, "PETR4", "Petrobras PN", 38.45, 1.23, 52430000),
        Stock(2, "VALE3", "Vale ON", 61.78, 0.45, 38210000),
        Stock(3, "ITUB4", "Itaú Unibanco PN", 34.12, 0.87, 28540000),
        Stock(4, "BBDC4", "Bradesco PN", 15.89, -0.34, 19320000),
        Stock(5, "ABEV3", "Ambev ON", 12.34, 1.15, 16780000),
        Stock(6, "BBAS3", "Banco do Brasil ON", 27.65, 0.23, 14230000),
        Stock(7, "WEGE3", "WEG ON", 52.10, 2.14, 9870000),
        Stock(8, "MGLU3", "Magazine Luiza ON", 11.98, -3.45, 8450000),
        Stock(9, "RENT3", "Localiza ON", 43.27, 0.98, 7320000),
        Stock(10, "JBSS3", "JBS ON", 33.56, -0.67, 6910000),
        Stock(11, "SUZB3", "Suzano ON", 54.89, 1.32, 6450000),
        Stock(12, "LREN3", "Lojas Renner ON", 17.45, -0.89, 5980000),
        Stock(13, "GGBR4", "Gerdau PN", 18.23, 0.56, 5430000),
        Stock(14, "EQTL3", "Equatorial ON", 35.67, 0.12, 4890000),
        Stock(15, "CSNA3", "CSN ON", 12.78, -1.78, 4320000)
    )

    fun findAll() = stockList

    fun findById(id: Int) = stockList.find { it.id == id }

    fun findBySymbol(symbol: String) = stockList.find { it.symbol == symbol }
}