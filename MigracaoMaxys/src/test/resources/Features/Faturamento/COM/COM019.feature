 #language: pt
 @wip @COM019 @dt_COM019 @chrome
 Funcionalidade: COM019 - Aprovação de Pedidos de Compra


   # Refluxos reportados na solicitação da tela.
   Cenário de Fundo:
     Dado inicialize a execução dos cenários do COM019
     E acessar o programa "COM019" pela empresa "84" feature COM019
     E confirmar mensagem SQL de Consulta feature COM019

   Cenário: Pedidos Pendentes de Compra - Liberar | Caminho Feliz

     E marcar checkbox numero do pedido feature COM019
     E clicar botão "liberar" feature COM019
     E apresentar o modal H4 "modal-basic-title" feature COM019
     E clicar botão "sim" do modal feature COM019
     E apresentar o modal H5 "modal-basic-title" feature COM019
     E clicar botão "ok" do modal feature COM019


   Cenário: Pedidos Pendentes de Compra - Retornar | Caminho Feliz
     E marcar checkbox numero do pedido feature COM019
     E clicar botão "retornar" feature COM019
     E apresentar o modal H5 "modal-basic-title" feature COM019
     E clicar botão "ok" do modal feature COM019


   Cenário: Pedidos Pendentes de Compra - Recusar | Caminho Feliz
     E marcar checkbox numero do pedido feature COM019
     E informa Motivo liberacao recusa feature COM019
     E clicar botão "recusar" feature COM019
     E apresentar o modal H5 "modal-basic-title" feature COM019
     E clicar botão "ok" do modal feature COM019
     E confirmar mensagem SQL de Consulta feature COM019


   Cenário: Pedidos Pendentes de Compra - Recusar | caminho negativo
     E marcar checkbox numero do pedido feature COM019
     E clicar botão "recusar" feature COM019
     E apresentar o modal H5 "modal-basic-title" feature COM019
     E clicar botão "ok" do modal feature COM019
     E informa Motivo liberacao recusa feature COM019
     E apresentar o modal H5 "modal-basic-title" feature COM019
     E clicar botão "ok" do modal feature COM019


   Cenário: Pedidos Pendentes de Compra - Validação Centro de Custo


     # Pedido de Compra
     Quando clicar botão ToolBar "novo" feature COM019
     E preencher Clifor feature COM019
     E preencher Condição Pagto feature COM019
     E preencher Moeda feature COM019
     E preencher Forma Pagamento feature COM019
     E selecionar Tipo Taxa sendo "A" feature COM019
     E preencher Dt início da correção feature COM019
     Então preencher Taxa feature COM019

     # Itens do Pedido de Compra
     Quando preencher os "3" Itens de Pedido de Compra feature COM019

     Quando clicar botão ToolBar "salvar" feature COM019
     E apresentar o modal H5 "modal-basic-title" feature COM019
     E apresentar a mensagem "MENSAGEM DE ALERTA POR MOTIVO FALTANDO" feature COM019
     Então clicar botão "ok" do modal feature COM019

