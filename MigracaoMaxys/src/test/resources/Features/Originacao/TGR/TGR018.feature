 #language: pt
 @test @TGR018 @dt_TGR018 @chrome
 Funcionalidade: TGR018 - Tipo de Modalidade Gão


    # Refluxos reportados na solicitação.
   Cenário de Fundo:
     Dado inicialize a execução dos cenários do TGR018
     E acessar o programa "TGR018" pela empresa "84" feature TGR018

   Cenário: Cadastro de Tipo de Modalidades de Grãos| Caminho feliz

     Quando clicar botão ToolBar "ultimo registro" feature TGR018
     E clicar botão ToolBar "novo" feature TGR018
     E preencher Modalidade feature TGR018
     Então selecionar o Tipo Contrato feature TGR018

     Quando clicar botão ToolBar "salvar" feature TGR018
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR018

     Quando clicar botão ToolBar "ultimo registro" feature TGR018
     E clicar botão ToolBar "excluir" feature TGR018
     E apresenta o modal H4 "modal-basic-title" feature TGR018
     E clicar botão "sim" do modal feature TGR018
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR018

    @TGR018C2
   Cenário: Cadastro de Tipo de Modalidades de Gãos | Teclas Atalho

     Quando clicar botão ToolBar "ultimo registro" feature TGR018
     E pressionar tecla "f6" feature TGR018
     E preencher Modalidade feature TGR018
     Então selecionar o Tipo Contrato feature TGR018

     Quando pressionar tecla "f10" feature TGR018
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR018

     Quando clicar botão ToolBar "ultimo registro" feature TGR018
     E pressionar teclas shift + f6 para excluir TGR018
     E apresenta o modal H4 "modal-basic-title" feature TGR018
     E clicar botão "sim" do modal feature TGR018
     Então apresentar a mensagem " Registro salvo com sucesso " no pop-up feature TGR018