 #language: pt
 @wip @TCO035 @dt_TCO024 @chrome
 Funcionalidade: TCO024 - Usuários Por Departamentos


   Cenário de Fundo:
     Dado inicialize a execução dos cenários do TCO024
     E acessar o programa "TCO024" feature TCO024

   # Autorizador Por Departamento:
   # Futuramente criar casos para Substituição de Usuário - Não é prioridade.
   Cenário: Consultar Departamento, cadastrar e excluir Solicitante| Caminho feliz

   Cenário: Consultar Departamento, cadastrar e excluir Solicitante| Teclas Atalho

   Cenário: Consultar Departamento, cadastrar e excluir Autorizador| Caminho feliz

   Cenário: Consultar Departamento, cadastrar e excluir Autorizador| Teclas Atalho

   # Tipos de Cargos
   Cenário: Cadastrar, editar e excluir Tipos de Cargos| Caminho Feliz

   Cenário: Cadastrar, editar e excluir Tipos de Cargos| Teclas Atalho

   Cenário: Cadastrar Tipo de Cargos com Código já cadastrado| Negativo

   # Departamento
   Cenário: Cadastrar, editar e excluir Departamentos| Caminho Feliz

   Cenário: Cadastrar, editar e excluir Departamentos| Teclas Atalho

   Cenário: Cadastrar Departamento com Código já cadastrado| Negativo