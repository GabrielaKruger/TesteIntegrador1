 #language: pt
 @test @COM019 @dt_COM019 @chrome
 Funcionalidade: COM019 - Aprovação de Pedidos de Compra


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
     E confirmar mensagem SQL de Consulta feature COM019


   Cenário: Pedidos Pendentes de Compra - Retornar | Caminho Feliz
     E marcar checkbox numero do pedido feature COM019
     E informa Motivo liberacao recusa feature COM019
     E clicar botão "retornar" feature COM019
     E apresentar o modal H5 "modal-basic-title" feature COM019
     E clicar botão "ok" do modal feature COM019
     E confirmar mensagem SQL de Consulta feature COM019


   Cenário: Pedidos Pendentes de Compra - Recusar | Caminho Feliz
     E marcar checkbox numero do pedido feature COM019
     E informa Motivo liberacao recusa feature COM019
     E clicar botão "recusar" feature COM019
     E apresentar o modal H5 "modal-basic-title" feature COM019
     E clicar botão "ok" do modal feature COM019
     E confirmar mensagem SQL de Consulta feature COM019


   Cenário: Pedidos Pendentes de Compra - Retornar | Caminho Negativo
     E marcar checkbox numero do pedido feature COM019
     E clicar botão "retornar" feature COM019
     E apresentar o modal H5 "modal-basic-title" feature COM019
     E clicar botão "ok" do modal feature COM019
     E informa Motivo liberacao recusa feature COM019
     E clicar botão "retornar" feature COM019
     E apresentar o modal H5 "modal-basic-title" feature COM019
     E clicar botão "ok" do modal feature COM019
     E confirmar mensagem SQL de Consulta feature COM019

   Cenário: Pedidos Pendentes de Compra - Retornar | Caminho Negativo
     E marcar checkbox numero do pedido feature COM019
     E clicar botão "recusar" feature COM019
     E apresentar o modal H5 "modal-basic-title" feature COM019
     E clicar botão "ok" do modal feature COM019
     E informa Motivo liberacao recusa feature COM019
     E clicar botão "recusar" feature COM019
     E apresentar o modal H5 "modal-basic-title" feature COM019
     E clicar botão "ok" do modal feature COM019
     E confirmar mensagem SQL de Consulta feature COM019

     
