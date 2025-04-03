 #language: pt
 @wip @COM004 @dt_COM004 @chrome
 Funcionalidade: COM004 - Compras Avulsas

   # Refluxo reportado na solicitação
   Cenário de Fundo:
     Dado inicialize a execução dos cenários do COM004
     E acessar o programa "COM004" pela empresa "84" feature COM004

   @910v2
   Cenário: Pedido avulso - Moeda Dolar - Taxa Abertura

     # Pedido de Compra
     Quando clicar botão ToolBar "novo" feature COM004
     E preencher Clifor feature COM004
     E preencher Condição Pagto feature COM004
     E preencher Moeda feature COM004
     E preencher Forma Pagamento feature COM004
     E selecionar Tipo Taxa sendo "A" feature COM004
     E preencher Dt início da correção feature COM004
     Então preencher Taxa feature COM004

     # Itens do Pedido de Compra
     # Quando preencher os "3" Itens de Pedido de Compra feature COM004

     Quando clicar botão ToolBar "salvar" feature COM004
     E apresentar o modal H5 "modal-basic-title" feature COM004
     E apresentar a mensagem "MENSAGEM DE ALERTA POR MOTIVO FALTANDO" feature COM004
     Então clicar botão "ok" do modal feature COM004

   @910v3
   Cenário: Pedido avulso - Moeda Dolar - Taxa Média

   @910v4
   Cenário: Pedido avulso - Moeda Dolar - Taxa Média

   @910v5
   Cenário: Pedido avulso - Moeda Dolar - Taxa Fechamento

   @910v6
   Cenário: Pedido avulso - Moeda Dolar - Taxa Negociada

   @910v6
   Cenário: Pedido avulso - Moeda Dolar - Taxa Recebimento

   @5669v1
   Cenário: Pedido de compra - centro de custo - c/planilha

   @8198v4
   Cenário: Aprovação Contábil de Pedido de Compra com CheckBox Adiantamento