#!/bin/bash

# Criar diretório de saída
mkdir -p out

# Gerar lista de arquivos-fonte
find src -name "*.java" ! -name "module-info.java" > sources.txt

# Compilar os arquivos
javac -d out @sources.txt

# Copiar os arquivos .dat para junto dos .class
cp src/prolixa/parser/parser.dat out/prolixa/parser/
cp src/prolixa/lexer/lexer.dat out/prolixa/lexer/ 2>/dev/null

# Executar a aplicação
java -cp out prolixa.Main
