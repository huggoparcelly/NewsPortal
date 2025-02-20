package com.example.newsportal

object NewsDatabase {
    val newsList: List<News> = listOf(
        // Economia
        News(
            id = 1,
            title = "Dólar ultrapassa R$ 5,70 após divulgação da ata do Fed",
            summary = "O dólar atingiu sua maior cotação em 6 meses frente ao real, influenciado pela expectativa de aumento nas taxas de juros nos EUA, conforme sinalizado na última reunião do Federal Reserve.",
            date = "19/02/2025",
            category = "economia"
        ),
        News(
            id = 2,
            title = "Banco do Brasil registra lucro recorde de R$ 37,9 bilhões em 2024",
            summary = "O Banco do Brasil anunciou um lucro histórico, impulsionado pelo aumento nas operações de crédito e pela gestão eficiente de custos, superando as expectativas do mercado.",
            date = "19/02/2025",
            category = "economia"
        ),
        News(
            id = 3,
            title = "Bolsa Família alcança valor médio de R$ 672 em fevereiro",
            summary = "O programa Bolsa Família inicia os pagamentos com o maior valor médio da história, beneficiando milhões de famílias em meio a pressões inflacionárias.",
            date = "19/02/2025",
            category = "economia"
        ),
        News(
            id = 4,
            title = "Argentina registra menor inflação de janeiro desde 2020",
            summary = "Sob o governo de Javier Milei, a Argentina viu a inflação de janeiro cair para um dígito, um marco no ajuste econômico do país, enquanto o Brasil mantém IPCA estável.",
            date = "14/02/2025",
            category = "economia"
        ),
        News(
            id = 5,
            title = "Petrobras anuncia nova descoberta de petróleo na Bacia de Santos",
            summary = "A estatal encontrou um campo promissor que pode aumentar a produção em 15%, fortalecendo a economia brasileira no setor energético.",
            date = "18/02/2025",
            category = "economia"
        ),
        News(
            id = 6,
            title = "OCDE recomenda reformas fiscais ao Brasil para 2025",
            summary = "A Organização para a Cooperação e Desenvolvimento Econômico sugere ajustes no teto de gastos e incentivos à inovação para garantir crescimento sustentável.",
            date = "17/02/2025",
            category = "economia"
        ),
        // Esportes
        News(
            id = 7,
            title = "João Fonseca recebe convite para o Masters 1000 de Indian Wells",
            summary = "O jovem tenista brasileiro, de 18 anos, ganha oportunidade de competir entre os melhores do mundo após boa campanha no circuito sul-americano.",
            date = "19/02/2025",
            category = "esportes"
        ),
        News(
            id = 8,
            title = "Flamengo vence Palmeiras e assume liderança do Brasileirão",
            summary = "Com gols no segundo tempo, o Flamengo garantiu uma vitória por 2 a 1 em casa, intensificando a disputa pelo título na reta final do campeonato.",
            date = "18/02/2025",
            category = "esportes"
        ),
        News(
            id = 9,
            title = "Brasil conquista ouro no Mundial de Vôlei Feminino Sub-21",
            summary = "A seleção brasileira derrotou a Itália na final, consolidando sua força nas categorias de base e levantando expectativas para os Jogos Olímpicos de 2028.",
            date = "16/02/2025",
            category = "esportes"
        ),
        News(
            id = 10,
            title = "Formula 1 confirma GP de São Paulo até 2030",
            summary = "Contrato renovado garante a permanência do circuito de Interlagos no calendário da F1, com investimentos previstos em infraestrutura e sustentabilidade.",
            date = "15/02/2025",
            category = "esportes"
        ),
        News(
            id = 11,
            title = "Neymar retorna aos treinos após 8 meses lesionado",
            summary = "O craque brasileiro está de volta aos gramados pelo Al-Hilal, gerando especulações sobre um possível retorno à Seleção para as Eliminatórias.",
            date = "17/02/2025",
            category = "esportes"
        ),
        News(
            id = 12,
            title = "COB anuncia plano de incentivo ao esporte escolar para 2026",
            summary = "O Comitê Olímpico do Brasil planeja investir R$ 50 milhões em projetos que integrem escolas públicas às competições nacionais.",
            date = "19/02/2025",
            category = "esportes"
        ),
        // Política
        News(
            id = 13,
            title = "Senado aprova liberação de R$ 4,6 bilhões em emendas bloqueadas",
            summary = "Após intensas negociações, o Congresso liberou os recursos contingenciados, que serão destinados a obras e programas sociais em estados.",
            date = "19/02/2025",
            category = "politica"
        ),
        News(
            id = 14,
            title = "Ministro Dias Toffoli é internado com Covid-19 em Brasília",
            summary = "O ministro do STF foi diagnosticado com a doença e segue em observação, adiando julgamentos previstos para esta semana.",
            date = "19/02/2025",
            category = "politica"
        ),
        News(
            id = 15,
            title = "CPI dos Atos Antidemocráticos ouve general exonerado por Lula",
            summary = "A comissão investiga a participação de militares nos eventos de 8 de janeiro de 2023, com depoimento marcado para esta quinta-feira.",
            date = "19/02/2025",
            category = "politica"
        ),
        News(
            id = 16,
            title = "Governo Trump pressiona Rússia com sanções econômicas",
            summary = "J.D. Vance, vice-presidente dos EUA, afirmou que Washington usará medidas econômicas para forçar Moscou a negociar o fim da guerra na Ucrânia.",
            date = "14/02/2025",
            category = "politica"
        ),
        News(
            id = 17,
            title = "Mauro Cid é convocado para depor em CPI no DF",
            summary = "O ex-ajudante de ordens de Bolsonaro será questionado sobre supostas irregularidades durante o governo anterior, em sessão prevista para março.",
            date = "18/02/2025",
            category = "politica"
        ),
        News(
            id = 18,
            title = "Lei Geral do Esporte é aprovada no Senado",
            summary = "O projeto, relatado por Leila Barros, consolida regras para o esporte no Brasil, criando a Anesporte para combater violência e discriminação.",
            date = "17/02/2025",
            category = "politica"
        )
    )

    fun findAll() = newsList

    fun findById(id: Int) = newsList.find { it.id == id }

    fun findByCategory(category: String) = newsList.filter { it.category == category }

}