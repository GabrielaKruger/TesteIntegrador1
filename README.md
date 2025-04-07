<h1 style="font-size: 40px; font-weight: bold; color: blue; text-align: center;"> Migracao Maxys </h1>

<p align="center"><i>Bem-vindo ao melhor projeto da Maxicon!</i></p>

<p style="text-align: justify;"> <b>Maxys é um ERP</b> modular e completo, desenvolvido para oferecer uma gestão integrada e eficiente de diversas áreas empresariais. Ele suporta setores como Contábil, Faturamento, Originação, Transporte, Financeiro, Compras, Estoque, Controladoria, Fiscal, RH e Comercial, garantindo suporte especializado por meio de squads dedicados. Construído com tecnologia Oracle, o sistema assegura escalabilidade, segurança e alto desempenho.

Atualmente, o <b>Maxys</b> está em processo de <i>migração da tecnologia FMB para uma versão Web</i>, com o objetivo de modernizar a interface, melhorar a experiência do usuário e ampliar a integração com novas tecnologias. Essa transição busca oferecer maior flexibilidade, acessibilidade e padronização dos processos, garantindo continuidade operacional e alinhamento entre as equipes sem impactos negativos.</p>

<p style="text-align: justify;"><b> 🚀 Tecnologias e Ferramentas:</b> </p>

🖥️ Linguagens e Frameworks: 

    ☕ Java | 🗄️ Oracle PL/SQL | 🥒 Cucumber | ✍️ Gherkin |  🖹 Selenium WebDriver | 🌐 Selenium Grid | ✅ JUnit 

💾 Banco de Dados:

    🛢️Oracle Database

🛠️ Build e Gerenciamento de Dependências:

    🏗️ Maven (gerenciador de dependências e build automation)

🛠️ IDE e Desenvolvimento:

    🏗️ IntelliJ IDEA

🔄 Controle de Versão:

    🔀 Git | 🦊 GitLab 

⚙️ Integração e Deploy:

    🤖 Jenkins 

📌 Metodologias e Gestão:

    📝 BDD | 📊 Página de Solicitações


<p style="text-align: justify;"><b>Estrutura do Projeto:

```
📂 MigracaoMaxys
├── 📂 idea 
├── 📂 src
│   ├── 📂 main
│   │   ├── 📂 java          # Classes de apoio e utilitários
│   ├── 📂 test
│   │   ├── 📂 java
│   │   │   ├── 📂 steps     # Definição dos passos (Step Definitions)
│   │   │   ├── 📂 runners   # Configuração dos runners (TestRunner)
│   │   │   ├── 📂 utils     # Classes de suporte e configuração
│   │   ├── 📂 resources
│   │   │   ├── 📂 features     # Cenários Gherkin (.feature)
│   │   │   ├── 📂 massa_teste  # json das massas dos cenarios(.json)
├── pom.xml                  # Configuração do Maven
├── .gitignore               # Arquivos ignorados pelo Git
└── README.md                # Documentação do projeto

## Configuração do Ambiente
Manual para instalações mais detalhado: https://confluence.maxiconsystems.com.br/pages/viewpage.action?pageId=95719001

1. Instalar o **Java 11 ou superior**
2. Instalar o **Maven**
3. Instalar o **IntelliJ IDEA** e adicionar plugins:
   * Cucumber for java
   * Gherkin
   * Docker
   * GitLab
4. Clonar este repositório:
   ```bash
   git clone https://gitlab.maxiconsystems.com.br/automacao/ldc
   ```
5. Abrir o projeto no IntelliJ e importar como projeto Maven
6. Atualizar dependências do Maven:
   ```bash
   mvn clean install
   ```
ou ainda ir no pom.xml do projeto e encontrar opção add maven e/ou reload project

## Como Executar os Testes
Para executar os testes via linha de comando:
```bash
mvn test
```
Ou, no IntelliJ:
1. Navegue até a classe Runner na pasta `runners`
2. Execute como **JUnit Test**

Ou, na Feature:
1. Navegue até a feature e encontre o cenário que deseja executar
2. Execute com o Run ou debug

## Exemplo de Cenário Gherkin
```gherkin
Funcionalidade: Login no sistema
  Cenario de Fundo:
    Dado inicialize a execução dos cenários
    
Cenario: Login válido | Caminho Feliz
    Quando acessar página de login
    E digitar um usuário e senha válidos
    Então deve logar com sucesso

Cenario: Login inválido |  Caso Negativo
    Quando acessar página de login
    E digitar um usuário e senha inválidos
    Então deve gerar mensagem de "Usuário ou senha inválidos" e não logar
```

## Contato
Caso tenha dúvidas ou sugestões, entre em contato pelo e-mail: [henrique.silva@maxiconsystems.com.br](mailto:henrique.silva@maxiconsystems.com.br).
