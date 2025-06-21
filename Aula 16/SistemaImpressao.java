import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SistemaImpressao {
    private Deque filaDeImpressao;
    private Random random;
    private List<Integer> idsGerados;
    private String[] tiposDeDocumento = {"PDF", "TXT", "JPG", "PNG", "DOCX", "XLSX"};

    public SistemaImpressao() {
        this.filaDeImpressao = new Deque();
        this.random = new Random();
        this.idsGerados = new ArrayList<>();
    }

    private int gerarIdUnico() {
        int novoId;
        do {
            novoId = random.nextInt(1000) + 1;
        } while (idsGerados.contains(novoId));
        idsGerados.add(novoId);
        return novoId;
    }

    private Documento criarDocumentoAleatorio() {
        int id = gerarIdUnico();
        String tipo = tiposDeDocumento[random.nextInt(tiposDeDocumento.length)];
        int paginas = random.nextInt(100) + 1;
        return new Documento(id, tipo, paginas);
    }

    public void adicionar_documento_normal() {
        Documento novoDocumento = criarDocumentoAleatorio();
        filaDeImpressao.inserirFim(novoDocumento);
        System.out.println("Documento normal adicionado ao final da fila: " + novoDocumento);
    }

    public void adicionar_documento_urgente() {
        Documento novoDocumento = criarDocumentoAleatorio();
        filaDeImpressao.inserirInicio(novoDocumento);
        System.out.println("Documento urgente adicionado no início da fila: " + novoDocumento);
    }

    public void processar_proximo() {
        Documento docProcessado = filaDeImpressao.removerInicio();
        if (docProcessado != null) {
            System.out.println("Processando próximo da fila: " + docProcessado);
        }
    }

    public void processar_ultimo() {
        Documento docProcessado = filaDeImpressao.removerFim();
        if (docProcessado != null) {
            System.out.println("Processando último da fila: " + docProcessado);
        }
    }

    public void visualizar_fila() {
        filaDeImpressao.exibir();
    }

    public void fila_vazia() {
        if (filaDeImpressao.estaVazio()) {
            System.out.println("A fila de impressão está vazia.");
        } else {
            System.out.println("A fila de impressão contém documentos.");
        }
    }

    public void total_documentos() {
        int total = filaDeImpressao.calcularTotalDocumentos();
        System.out.println("Total de documentos na fila: " + total);
    }

    public void total_paginas() {
        int paginas = filaDeImpressao.calcularTotalPaginas();
        System.out.println("Total de páginas a serem impressas: " + paginas);
    }
}