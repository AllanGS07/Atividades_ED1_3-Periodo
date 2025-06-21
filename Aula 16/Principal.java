public class Principal{
    public static void main(String[] args) {
        SistemaImpressao impressora = new SistemaImpressao();

        System.out.println("Iniciando Sistema de Impressão");
        impressora.fila_vazia();
        System.out.println();

        // Adicionando documentos
        impressora.adicionar_documento_normal();
        impressora.adicionar_documento_normal();
        impressora.adicionar_documento_urgente();
        impressora.adicionar_documento_normal();
        impressora.adicionar_documento_urgente();
        System.out.println();

        // Visualizando a fila e estatísticas
        impressora.visualizar_fila();
        impressora.total_documentos();
        impressora.total_paginas();
        System.out.println();

        // Processando documentos
        System.out.println("Processando Documentos");
        impressora.processar_proximo();
        impressora.processar_ultimo();
        System.out.println();

        // Visualizando a fila final
        System.out.println("Estado Final da Fila");
        impressora.visualizar_fila();
        impressora.total_documentos();
        impressora.total_paginas();
        impressora.fila_vazia();
    }
}