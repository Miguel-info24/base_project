package models;

import java.time.LocalDate;

public class Pedido {
    private String id;
    private String nome;
    private String descricao;
    private double preco;
    private String tipo;
    private String status;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Barco barco;  // Associação com Barco

    public Pedido(String id, String nome, String descricao, double preco, String tipo,
                  String status, LocalDate dataInicio, LocalDate dataFim, Barco barco) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tipo = tipo;
        this.status = status;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.barco = barco;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public double getPreco() { return preco; }
    public String getTipo() { return tipo; }
    public String getStatus() { return status; }
    public LocalDate getDataInicio() { return dataInicio; }
    public LocalDate getDataFim() { return dataFim; }
    public Barco getBarco() { return barco; }

    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", tipo='" + tipo + '\'' +
                ", status='" + status + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", barco=" + barco +
                '}';
    }
}
