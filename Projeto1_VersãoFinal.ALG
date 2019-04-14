Algoritmo "Projeto I"
// Disciplina: Lógica de Programação Orientada a Objeto
// Professor: Aldo Henrique
// Aluno: Victor Leone da Silva Costa
// CPD: 45543

//O conhecimento para a implementação das instruções e construção do projeto
//a seguir foi edificado a partir do aprendizado em sala de aula e pesquisas
//em fontes externas.

Var
   init,sexo,m0,m1,m2,m3,m4,m5,m6,m7,m8,m9,mor,mor0,mor1,bin,bit,tip :caractere
   menu,count,n0,n1,n2,n3,n4,n5,n6,n7,n8,n9 :inteiro
   med0,med1,med2,med3,med4 :real

procedimento divisao()
inicio
   //Caso 1 - Opção "1. Divisão".
   //A opção 1 foi segmentada, e traz consigo
   //um submenu que permite que o usuário escolha se quer realizar uma
   //operação de divisão com ou sem resto. Isto torna-se possível devido
   //à utilização da instrução 'Escolha-Caso' para separar os tipos de
   //operação; semelhante ao que foi feito no MENU PRINCIPAL.
   //Para todas as opções do menu divisão foram adicionadas estruturas de
   //seleção a fim de impedir a divisão por 0.
   //Inicia-se a estrutura de repetição que garantirá que o usuário retorne
   //ao menu, uma vez que a funcionalidade escolhida por ele for executada.
   repita
      limpatela
      escreval("              MENU - DIVISÃO")
      escreval("1. Divisão com resto")
      escreval("2. Divisão com casas decimais")
      escreval("3. Retornar ao Menu Principal")
      escreval("")
      escreva("Escolha o tipo de divisão que deseja fazer:")
      leia(menu)
      escolha menu
         //Submenu 1: Divisão com resto
         //A combinação de instruções de operações matemáticas, formatação de texto
         //e de impressão, foi utilizada para viabilizar as divisões com resto.
      caso 1
         //As implementações a seguir imprimem o título da opção selecionada e solicitam
         //as entradas de dados.
         limpatela
         escreval("              DIVISÃO COM RESTO")
         escreva("Dividendo:")
         leia(n1)
         escreva("Divisor:")
         leia(n2)
         //Antes de proceder para a divisão, o algoritmo valida se o divisor é maior
         //que 0, por meio das estruturs de seleção mencionadas anteriormente.
         //Caso o divisor não seja maior que 0, será impressa no prompt uma breve
         //explicação sobre divisões de números > que 0, por 0.
         //Se o divisor for maior que 0, o algoritmo prosseguirá para a próxima vali-
         //dação.
         se(n2=0)e(n1>0)então
            limpatela
            escreval("A divisão de",n1," por",n2," é indefinida")
            escreval(" ou impossível entre os números.")
            escreval("")
         senão
            //A seguinte estrutura de seleção, foi utulizada para validar a possível
            //entrada de dados: 0/0. Se validada, será impressa no prompt uma breve
            //explicação sobre a entrada.
            se(n1=0)e(n2=0)então
               limpatela
               escreval("A divisão 0/0 é indeterminada.")
               escreval("")
               //Se não for validada, o algoritmo prosseguirá para a realização das operações
               //de divisão.
            senão
               //Na seguinte parte da implementação, o algoritmo calculará e atribuirá os
               //valores obtidos para as variáveis {n3} e {med0}.
               n3<-(n1 mod n2)
               med0<-int(n1/n2)
               //Realizados os cálculos necessários e atribuições definidas, o algoritmo
               //limpa a tela do prompt e imprime os resultados.
               limpatela
               escreval(n1," dividido por",n2," é igual a",med0," com resto",n3,".")
               escreval("")
               //Ao final, são fechadas as estruturas de seleção e impresso o texto informando
               //que, caso o usuário deseje retornar ao menu, é necessário pressionar 'Enter'.
            fimse
         fimse
         escreval("Pressione 'Enter' para retornar ao MENU - DIVISÃO.")
         leia(init)
         limpatela
         //Submenu 2: Divisão com casas decimais
         //A combinação de instruções de operações matemáticas, formatação de texto
         //e de impressão, foi utilizada para viabilizar as divisões com duas casas
         //decimais.
      caso 2
         limpatela
         //As instruções a seguir imprimem o título da funcionalidade e solicitam
         //as entradas de dados.
         escreval("      DIVISÃO COM CASAS DECIMAIS")
         escreva("Dividendo:")
         leia(n1)
         escreva("Divisor:")
         leia(n2)
         //Antes de proceder para a divisão, o algoritmo valida se o divisor é maior
         //que 0, por meio das estruturs de seleção mencionadas anteriormente.
         //Caso o divisor não seja maior que 0, será impressa no prompt uma breve
         //explicação sobre divisões de números > que 0, por 0.
         //Se o divisor for maior que 0, o algoritmo prosseguirá para a próxima vali-
         //dação.
         se(n2=0)e(n1>0)então
            limpatela
            escreval("A divisão de",n1," por",n2," é indefinida,")
            escreval("ou impossível entre os números.")
            escreval("")
         senão
            //A seguinte estrutura de seleção, foi utulizada para validar a possível
            //entrada de dados: 0/0. Se validada, será impressa no prompt uma breve
            //explicação sobre a entrada.
            se(n1=0)e(n2=0)então
               limpatela
               escreval("A divisão 0/0 é indeterminada.")
               escreval("")
               //Se não for validada, o algoritmo prosseguirá para a realização das operações
               //de divisão.
            senão
               //Na seguinte parte da implementação, o algoritmo calculará e atribuirá o
               //valor obtido para a variável {med0}.
               med0<-(n1/n2)
               //Realizado o cálculo necessário e atribuição definida, o algoritmo
               //limpa a tela do prompt e imprime os resultados.
               limpatela
               escreval(n1," dividido por",n2," é igual a ",(med0):2:2,".")
               escreval("")
               //Ao final, são fechadas as estruturas de seleção e impresso o texto informando
               //que, caso o usuário deseje retornar ao menu, é necessário pressionar 'Enter'.
            fimse
         fimse
         escreval("Pressione 'Enter' para retornar ao MENU - DIVISÃO.")
         leia(init)
         limpatela
         //É encerrada a instrução implementada para a viabilização do submenu.
      fimescolha
      limpatela
      //É encerrada a instrução que mantém o usuário no menu até que a opção
      //"Retornar ao MENU PRINCIPAL" seja selecionada.
   até(menu=3)

fimprocedimento

procedimento faixaet()
inicio
   //A instrução a seguir limpa o prompt.
   limpatela
   //As instruções a seguir imprimem o título da opção selecionada e solicitam
   //as entradas de dados.
   //Foi adicionado laço de repetição para impedir a entrada de valor
   //inferior a 0.
   escreval("                MÉDIA DE IDADE")
   repita
      escreva("Informe a quantidade de indivíduos:")
      leia(n1)
      se(n1<1)então
         escreval("A quantidade de indivíduos deve ser numérica")
         escreval("e superior a 0.")
         escreval("")
      fimse
   até(n1>0)
   //Foi adicionada a estrutura de seleção a seguir a fim de prevenir falhas
   //ocasionadas pela divisão por 0.
   //As instruções a seguir iniciam uma estrutura de repetição baseada na entrada
   //do usuário para a quantidade de dados a ser processada.
   para count de 1 até n1 faça
      escreval(" ")
      //Foram adicionadas instruções de impressão para que a lista exibida conte em
      //formato ordinal, levando em consideração os dados inseridos pelo usuário.
      escreval(count,"º indivíduo")
      //Instrução de impressão requisitando o dado 'idade', e instrução para leitura
      //e atribuição do dado à variável. Conta com laço de repetição para
      //impedir entrada de dado vazio.
      repita
         escreva("Informe a idade:")
         leia(n2)
         se(n2<=0)então
            escreval("Idade deve ser um número positivo. Tente Novamente.")
         fimse
      até(n2>0)
      //Instrução de impressão requisitando o dado 'sexo', e instrução para leitura
      //e atribuição do dado à variável.
      //Para a variável sexo, também foi adicionada estrutura de repetição com o ob-
      //jetivo de prevenir que esta fique em branco.
      escreval("Informe: 'F' para feminino, ou 'M' para masculino.")
      repita
         escreva("Sexo:")
         leia(sexo)
      até(sexo="m")ou(sexo="M")ou(sexo="f")ou(sexo="F")
      //Para ambas as estruturas de seleção a seguir, foram adicionadas instruções
      //para garantir que tanto letras maiúsculas quanto minúsculas sejam reconheci-
      //das.
      se(sexo="F")ou(sexo="f")então
         //O trecho a seguir basei-se na entrada de dados do usuário considerando a
         //seleção acima. Caso a entrada seja 'f', serão atribuídos dados às variáveis
         //{n5} e {n6}.
         n5<-(n5+n2)
         n6<-(n6+1)
      senão
         se(sexo="M")ou(sexo="m")então
            //O trecho a seguir basei-se na entrada de dados do usuário considerando a
            //seleção acima. Caso a entrada seja 'm', serão atribuídos dados às variáveis
            //{n7} e {n8}.
            n7<-(n7+n2)
            n8<-(n8+1)
            //São encerradas as estruturas de seleção e repetição:
         fimse
      fimse
   fimpara
   //Antes de atribuir dados às variáveis {med1},{med2} e {med3}, foram inseridas
   //estruturas de seleção para prevenir a divisão por 0.
   se(n6>0)então
      med1<-(n5/n6)
   fimse
   se(n8>0)então
      med2<-(n7/n8)
   fimse
   med3<-(n5+n7)/count
   //As instruções abaixo, quando executadas, exibem o resultado final obtido
   //a partir do processamento dos dados inseridos pelo usuário.
   limpatela
   escreval("")
   escreval("Número total de indivíduos:",count)
   escreval("Média das idades:",med3)
   escreval("")
   escreval("Número de homens:",n8)
   escreval("Média das idades:",med2)
   escreval("")
   escreval("Número de mulheres:",n6)
   escreval("Média das idades:",med1)
   //Leitura vazia adicionada para que o algoritmo apenas retorne ao menu princi-
   //pal quando pressionada a tecla 'Enter'.
   escreval("")
   escreval("Pressione 'Enter' para retornar ao MENU PRINCIPAL.")
   leia(init)
   limpatela
fimprocedimento

procedimento primos()
inicio
   //Caso 3 - Opção "3. Números Primos".
   limpatela
   //As instruções a seguir imprimem o título da opção selecionada e solicitam
   //as entradas de dados.
   escreval("     SOMA DE NÚMEROS PRIMOS NO INTERVALO")
   escreval("")
   escreva("Digite um número:")
   leia(n1)
   //A instrução 'limpatela' foi adicionada para limpar o prompt.
   limpatela
   //Atribuído o valor 2 para a variável {count}.
   count<-2
   //A estrutura de seleção a seguir valida se o número inserido pelo usuário
   //é maior que 1. Caso seja, então o código prossegue para o processamento
   //a fim de encontrar os números primos e somá-los. Caso a entrada não seja
   //validada, o algoritmo prossegue para a impressão da mensagem ao final.
   se(n1>1) então
      escreval("Números primos no intervalo de 1 até ",n1,":")
      //Abaixo são iniciados dois laços de repetição para que seja verificado se
      //determinado número é primo ou não. As estruturas de seleção atuarão como
      //contadores, processando cada um dos números que forem encontrados no
      //intervalo.
      //Cada divisão bem sucedida, adicionará 1 à variável {n3}. Um número será
      //primo quando a variável tiver valor máximo 2 até o final de cada loop.
      enquanto (count<n1) faça
         para n2 de 1 até n1 faça
            se(count mod n2 = 0) então
               n3<-(n3+1)
            fimse
            //Encerra-se a estruturas de repetição utilizada para gerar os divisores.
         fimpara
         se(n3=2)então
            //Feito o processamento, o algoritmo prossegue para a seção abaixo, onde
            //é instruído a imprimir os números primos encontrados, além de somá-los.
            escreval("",count,",")
            med0<-(med0+count)
         fimse
         //Então é incrementado o contador para o próximo passo. E zerada a variável
         //{n3} para que esta possa albergar o contador de divisões bem sucedidas
         //dos próximos números.
         count<-(count+1)
         n3<-0
         //Encerra-se a estrutura de repetição utilizada para gerar os dividendos.
      fimenquanto
      //São impressos os resultados encontrados.
      escreval("")
      escreval("A soma dos números primos no")
      escreval("intervalo é igual a",med0,".")
      //Caso a primeira estrutura de seleção desta seção seja invalidada, as instru-
      //ções a seguir serão executadas, imprimindo a mensagem que informa sobre
      //a inexistência de números primos naquele intervalo.
   senão
      limpatela
      escreval("Não existem números primos neste intervalo.")
   fimse
   //Leitura vazia adicionada para que o algoritmo apenas retorne ao menu princi-
   //pal quando pressionada a tecla 'Enter'.
   escreval("")
   escreval("Pressione 'Enter' para retornar ao MENU PRINCIPAL.")
   leia(init)
   limpatela
fimprocedimento

procedimento mmem()
inicio
   //Caso 4 - Opção "Maior, Menor, e Média".
   limpatela
   //É atribuior valor à variável {count} para que o contador comece do número 1.
   count<-1
   //As instruções a seguir imprimem o título da opção selecionada e solicitam
   //as entradas de dados.
   escreval("             MAIOR, MENOR E MÉDIA")
   escreval("")
   //Laço de repetição iniciado.
   repita
      escreva("Quantos números deseja processar? ")
      leia(n1)
      //Seleção adicionada para impedir que o algoritmo continue quando o valor
      //estiver vazio ou não for numérico.
      se(n1<1)então
         escreval("A quantidade de números deve ser numérica e superior a 0!")
         escreval("")
      fimse
      //Laço de repetição encerrado quando os requisitos são atingidos.
   até(n1>0)
   //Imprime as requisições de entrada em formato ordinal.
   escreva(count,"º número:")
   //Solicita a entrada de dados.
   leia(n2)
   //Atribui valores às variáveis para impedir que o algoritmo seja
   //encerrado por erro.
   n3<-n2
   n5<-n2
   n6<-n2
   //É iniciado um laço de repetição para que os números ordinais das
   //requisições sejam incrementados.
   para count de 2 até n1 faça
      escreva(count,"º número:")
      leia(n2)
      //Seleções implementadas para comparar os valores e atribuí-los às
      //variáveis.
      se(n2>n3)então
         n3<-n2
      fimse
      se(n2<n5)então
         n5<-n2
      fimse
      //São somados os valores obtidos e atribuídos à variável {n6}.
      n6<-(n6+n2)
   fimpara
   limpatela
   //É... gambiarra para resolver um erro que ocorria ao inserir apenas
   // um valor. (FUNCIONA! ;D)
   se(n1=1)então
      med1<-n2
   senão
      med1<-(n6/count)
   fimse
   //Seção implementada para que sejam impressos os resultados.
   escreval("             MAIOR, MENOR E MÉDIA")
   escreval("")
   escreval("Maior:",n3)
   escreval("Menor:",n5)
   escreval("Média: ",(med1):4:2)
   //Leitura vazia adicionada para que o algoritmo apenas retorne ao menu princi-
   //pal quando pressionada a tecla 'Enter'.
   escreval("")
   escreval("Pressione 'Enter' para retornar ao MENU PRINCIPAL.")
   leia(init)
   limpatela
fimprocedimento

procedimento morse()
inicio
   //Caso 5 - Opção "Código Morse"
   //Atribuição de valores morse do tipo caractere às variáveis.
   m0<-("-----")
   m1<-(".----")
   m2<-("..---")
   m3<-("...--")
   m4<-("....-")
   m5<-(".....")
   m6<-("-....")
   m7<-("--...")
   m8<-("---..")
   m9<-("----.")
   //O comando "limpatela" limpa o prompt.
   limpatela
   //É impresso o título da opção.
   escreval("          CÓDIGO MORSE")
   escreval("")
   //Laço de repetição implementado para impedir a entrada de dados inválidos.
   repita
      //É limpa a variável {init} a cada repetição.
      init<-""
      //As instruções a seguir imprimem a requisição e solicitam as entradas de dados.
      escreval("Informe um número para convertê-lo")
      escreval("em código morse.")
      leia(mor)
      //A arte ASCII a seguir será exibida se a leitura não receber dados.
      se(mor="")então
         limpatela
         escreval("               O CÓDIGO DORME")
         escreval("")
         escreval("ZzZzz... Entradas vazias fazem o algoritmo dormir.")
         escreval("                     z           _____________    ")
         escreval("                 z              | * (  *    . |   ")
         escreval("                   Z            |.      . *  *|   ")
         escreval("        .--.  Z Z               |__*_____*__._|   ")
         escreval("       / _(c\   .-.     __                        ")
         escreval("      | / /  '-;   \'-'`  `\______                ")
         escreval("      \_\/'/ __/ )  /  )   |      \--,            ")
         escreval("      | \`--`__-/ .'--/   /--------\  \           ")
         escreval("       ||`  |||-\/   /   /---;-.    `-´           ")
         escreval("                    (________\  \                 ")
         escreval("                              '-'                 ")
      fimse
      //As estruturas de casos e atribuição de valores a seguir foram implementadas
      //para valorar a variável {mor1} de acordo com a entrada de dados do usuário.
      n0 <- compr(mor)
      para count de 1 até n0 faça
         mor0:=copia(mor,count,1)
         escolha mor0
         caso "0"
            mor1<-(mor1+(" ")+m0)
         caso "1"
            mor1<-(mor1+(" ")+m1)
         caso "2"
            mor1<-(mor1+(" ")+m2)
         caso "3"
            mor1<-(mor1+(" ")+m3)
         caso "4"
            mor1<-(mor1+(" ")+m4)
         caso "5"
            mor1<-(mor1+(" ")+m5)
         caso "6"
            mor1<-(mor1+(" ")+m6)
         caso "7"
            mor1<-(mor1+(" ")+m7)
         caso "8"
            mor1<-(mor1+(" ")+m8)
         caso "9"
            mor1<-(mor1+(" ")+m9)
         outrocaso
            init<-"1"
         fimescolha
      fimpara
      //Variável {init} é utilizada como controle de entrada de dados inválidos.
      //A seleção é utilizada para informar ao usuário sobre a entrada de dados inválidos.
      se(init="1")então
         limpatela
         escreval("          CÓDIGO MORSE")
         escreval("")
         escreval("Entrada inválida.")
         escreval("Insira apenas números positivos!")
         escreval("")
         mor1<-""
      fimse
      //É encerrado o laço de repetição que atribui valor à variável de controle
      //de exceções.
   até(init<>"1")
   //As instruções a seguir limpam a tela e imprimem o valor digitado pelo
   //usuário convertido em código morse.
   se(mor<>"")então
      limpatela
      escreval("          CÓDIGO MORSE")
      escreval("")
      escreval(mor, " em morse é ",mor1," !")
      //Leitura vazia adicionada para que o algoritmo apenas retorne ao menu princi-
      //pal quando pressionada a tecla 'Enter'.
   fimse
   escreval("")
   escreval("Pressione 'Enter' para retornar ao MENU PRINCIPAL.")
   leia(init)
   limpatela
fimprocedimento

procedimento bases()
inicio
   //Caso 6 - Opção "6. Mudança de Base".
   //Limpa o prompt
   limpatela
   //As intruções a seguir imprimem o título da opção.
   escreval("             MUDANÇA DE BASE")
   escreval("")
   //Laço de repetição iniciado.
   repita
      //variável n3 é zerada para evitar erros.
      n3<-0
      n9<-0
      escreva("Quantos números deseja processar? ")
      leia(n1)
      escreval("")
      //Seleção adicionada para impedir que o algoritmo continue quando o valor
      //estiver vazio ou não for numérico.
      se(n1<1)então
         escreval("A quantidade de números deve ser numérica e superior a 0!")
         escreval("")
      fimse
      //Laço de repetição é encerrado quando os requisitos são atingidos.
   até(n1>0)
   //É zerado o contador.
   count<-0
   //Imprime a requisição de dados e os lê. Implementado laço de repetição
   //para impedir a entrada de números menores que 1.
   para count de 1 até n1 faça
      repita
         escreva("Insira o número que deseja converter:")
         leia(n2)
      até(n2>0)
      //Imprime a requisição do tipo de dado a lê.
      repita
         escreval("Digite 'D' se ",n2," é um número decimal, ou 'B'")
         escreva("se for binário:")
         leia(tip)
         escreval("")
         //Seleção adicionada para unificar os valores. Necessária porque o
         //visualg é bugado.
         se(tip="d")ou(tip="D")então
            tip<-"1"
         fimse
         se(tip="b")ou(tip="B")então
            tip<-"2"
         fimse
      até(tip="1")ou(tip="2")
      //Escolha caso para cada uma das opções.
      escolha tip
         //Escolha caso 1 para converter de binário para decimal.
      caso "1"
         //Atribuição do valor para armazenamento do valor inicial,
         //pois a variável {n2} é modificada durante o processo.
         n3<-n2
         //Laço de repetição utilizado para possibilitar os cálculos.
         enquanto (n2>0) faca
            //Escolha caso implementado para organizar os valores, concatenando
            //0 ou 1 como caractere quando necessário para gerar o valor binário final.
            escolha (n2 mod 2)
            caso 0
               bin<-("0"+bin)
            caso 1
               bin<-("1"+bin)
            fimescolha
            //Atribuição do quociente da divisão à {n2} para dar continuidade aos
            //cálculos.
            n2 <- (n2 div 2)
            //Laço de repetição encerrado quando 0 é obtido.
         fimenquanto
         //Escolha caso 2 para converter binário para decimal.
      caso "2"
         //Variável {n3} armazena valor inicial da variável {n2}.
         n3<-n2
         //Valor de {n2} é convertido de número para caractere.
         bin<-(numpcarac(n2))
         //{n0} recebe a quantidade de caracteres que compõem {bin}.
         n0 <- compr(bin)
         //{n1} é zerada.
         n1<-0
         //Laço de repetição utilizado para seguimentar as operações por algarismo/caractere.
         para count de n0 até 1 passo -1 faça
            //{bit} recebe o algarismo/caractere a ser processado.
            //A instrução copia permite isolar os caracteres um a um.
            bit:=copia(bin,count,1)
            //Laço de seleção pava validar se número é binário ou não.
            se(bit<>"1")e(bit<>"0")então
               escreval(n3," não é um número binário.")
               //Variável de validação.
               n9<-1
            senão
               //Laço de seleção utilizado para verificar e calcular os valores.
               //Se o bit armazenado em {bit} for igual a 1, ele é processado. Se 0
               //é ignorado.
               se(bit="1")então
                  med0<-med0+((2^n1)*1)
               fimse
               //Variável {n1} é incrementada.
               n1<-(n1+1)
               //Laço de repetição é encerrado.
            fimse
         fimpara
         //O valor da {med0} é atribuído à {n2} desconsiderando os números
         //fracionários.
         n2<-int(med0)
         //É encerrado o Escolha Caso.
      fimescolha
      //Laços de seleção adicionados para imprimir o resultado de acordo
      //com o caso selecionado.
      se(tip="1")então
         escreval(n3," em binário é ",bin,".")
         escreval(" ")
      fimse
      se(tip="2")e(n9<=0)então
         escreval(n3," binário é ",n2," em decimal.")
         escreval("")
      fimse
      //Seção de limpeza das variáveis. Implementada para previnir erros.
      n2<-0
      med0<-0
      bin<-""
      //O contador é incrementado. E o laço encerrado.
      count<-(count+1)
   fimpara
   //Leitura vazia adicionada para que o algoritmo apenas retorne ao menu princi-
   //pal quando pressionada a tecla 'Enter'.
   escreval("")
   escreval("Pressione 'Enter' para retornar ao MENU PRINCIPAL.")
   leia(init)
   limpatela
fimprocedimento


Inicio

   //Esta seção de código foi adicionada para a exibição do título do projeto.
   //Além disso, também serve como "gatilho" de início, solicitando que o usuário
   //pressione a tecla "Enter" para começar. Para tal, a variável {init} faz-se
   //presente, com a finalidade única de "ler" um valor vazio.
   //A instrução 'limpatela' foi adicionada para que o prompt seja limpo.
   escreval("Lógica de Programação Orientada a Objetos")
   escreval("                Projeto I")
   escreval("")
   escreva("Pressione Enter para começar.")
   leia(init)
   limpatela
   //----------------------------------------------------
   //Esta seção, quando executada, exibe uma sequência de textos ordenados
   //como um menu e lê a opção desejada para que o usuário escolha o que
   //deseja fazer.
   repita
      escreval("              MENU PRINCIPAL")
      escreval("1. Divisão")
      escreval("2. Média de idade")
      escreval("3. Números Primos")
      escreval("4. Maior, Menor, e Média")
      escreval("5. Código Morse")
      escreval("6. Mudança de Base")
      escreval("7. Sair")
      escreval("")
      //As variáveis são limpas sempre que o usuário retorna ao MENU PRINCIPAL.
      init<-""
      sexo<-""
      mor1<-""
      bin<-""
      bit<-""
      count<-0
      n0<-0
      n1<-0
      n2<-0
      n3<-0
      n4<-0
      n5<-0
      n6<-0
      n7<-0
      n8<-0
      n9<-0
      med0<-0
      med1<-0
      med2<-0
      med3<-0
      med4<-0
      escreva("Digite o número da opção que deseja executar:")
      leia(menu)
      escolha menu
         //----------------------------------------------------
         //Nesta seção são iniciadas as instruções de escolha.
      caso 1
         divisao
      caso 2
         faixaet
      caso 3
         primos
      caso 4
         mmem
      caso 5
         morse
      caso 6
         bases
      outrocaso
         limpatela
      fimescolha

   até (menu=7)
Fimalgoritmo