 #language: pt
 @test @TGR010 @dt_TGR010 @chrome
 Funcionalidade: TGR010 - Produtos de Balança

   # Refluxos reportados na solicitação.
   Cenário de Fundo:
     Dado inicialize a execução dos cenários do TGR010
     E acessar o programa "TGR010" pela empresa "84" feature TGR010

   Cenário: Cadastro e Exclusão de Produtos de Balança | Caminho feliz

     # Ordem invertida por causa do refluxo
     Quando clicar botão ToolBar "novo" feature TGR010
     E preencher Código feature TGR010
     E preencher Tipo de Pedido feature TGR010
     E preencher Descrição feature TGR010
     E preencher Item Transgênico feature TGR010
     E "marcar" Classificar feature TGR010
     E "marcar" Segunda Classificação feature TGR010
     E "marcar" Produto com restricao no bioma amazônico feature TGR010
     E "marcar" Produto com certificação de qualidade POP 11 feature TGR010
     Então "marcar" Ordem de carregamento obrigatória featue TGR010

     Quando clicar botão ToolBar "salvar" feature TGR010
     Então apresentar a mensagem "Registro salvo com sucesso" no pop-up feature TGR010

     Quando clicar botão ToolBar "ultimo registro" feature TGR010
     E aguarda os dados serem carregados feature TGR010
     E clicar botão ToolBar "excluir" feature TGR010
     E apresenta o modal H4 "modal-basic-title" feature TGR010
     E clicar botão "sim" do modal feature TGR010
     Então apresentar a mensagem "Registro salvo com sucesso" no pop-up feature TGR010

   @wip # Atalho F6 interagem com o navegador, não com a tela. Aguardar correção do Tailon.
   Cenário: Cadastro e Exclusão de Produtos de Balança | Teclas Atalho

     Quando pressionar tecla "f6" feature TGR010
     E preencher Código feature TGR010
     E preencher Tipo de Pedido feature TGR010
     E preencher Descrição feature TGR010
     E preencher Item Transgênico feature TGR010
     E "marcar" Classificar feature TGR010
     E "marcar" Segunda Classificação feature TGR010
     E "marcar" Produto com restricao no bioma amazônico feature TGR010
     E "marcar" Produto com certificação de qualidade POP 11 feature TGR010
     Então "marcar" Ordem de carregamento obrigatória featue TGR010

     Quando pressionar tecla "f10" feature TGR010
     Então apresentar a mensagem "Registro salvo com sucesso" no pop-up feature TGR010

     Quando clicar botão ToolBar "ultimo registro" feature TGR010
     E aguarda os dados serem carregados feature TGR010
     E pressionar teclas shift + f6 para excluir TGR010
     E apresenta o modal H4 "modal-basic-title" feature TGR010
     E clicar botão "sim" do modal feature TGR010
     Então apresentar a mensagem "Registro salvo com sucesso" no pop-up feature TGR010


   Cenário: Produtos de Balança | Negativo - Campos obrigatórios

     Quando clicar botão ToolBar "novo" feature TGR010
     E não preencher Código feature TGR010
     Então apresentar a mensagem "O registro deve ser informado ou excluído" no pop-up feature TGR010

     Quando preencher Código feature TGR010
     E não preencher Tipo de Pedido feature TGR010
     Então apresentar a mensagem "O registro deve ser informado ou excluído" no pop-up feature TGR010