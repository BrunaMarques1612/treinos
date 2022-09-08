algoritmo "Calculadora"
// Função : Calcular maioridade
// Autor : Bruna
// Data : 24/08/2021
// Seção de Declarações 

var
nascimento, anoatual, idade : inteiro
inicio
// Seção de Comandos
Escreva (" Insira o ano do seu nacimento : ")
Leia (nascimento)
Escreva (" Insira o ano atual : ")
Leia (anoatual)
idade := anoatual - nascimento
Se idade >=18 entao
Escreva (" Você já pode ser preso, você atingiu a maioridade : ", idade)
Fimse
Se idade <18 entao
Escreva ( " Você ainda não atingiu a maioridade : ", idade)
Fimse
fimalgoritmo
