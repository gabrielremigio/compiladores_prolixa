# Analisador Sintático com SableCC

Este projeto utiliza o [SableCC](http://sablecc.org/) para gerar um analisador léxico e sintático em Java. A aplicação principal está no arquivo `Main.java`, e o projeto é configurado para ser executado facilmente no Visual Studio Code (VS Code).

## 🚀 Como Executar

### 1. Ajustar os caminhos (paths)

- **No `Main.java`**: Certifique-se de que os caminhos para arquivos de entrada/saída estejam corretos.
- **No `.vscode/launch.json`**: Se estiver usando a depuração, ajuste os caminhos relativos conforme a estrutura do seu projeto.

### 2. Gerar o analisador com SableCC

- Instale a **extensão SableCC no VS Code** (ou use o JAR manualmente).
- Execute o arquivo `.sablecc` localizado em `grammar/`, usando:
  - **Pelo VS Code**: clique com o botão direito no arquivo `.sablecc` → **Run SableCC**
  - **Ou via terminal**:
    ```bash
    java -jar sablecc.jar grammar/MinhaGramatica.sablecc
    ```

### 3. Rodar o script de execução

No terminal, na raiz do projeto, execute:

```bash
chmod +x run.sh
./run.sh
