class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String editora;

    public Livro(String titulo, String autor, int ano, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.editora = editora;
    }

    public String toString() {
        return "Título: " + getTitulo() + "\nAutor: " + getAutor() + "\n Ano de publicação: " + getAno() + "\nEditora: " + getEditora();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}

class TestaLivro {
    Livro livro1 = new Livro("O homem mais rico da Babilônia", "George S Clason e Luiz Cavalcanti de M. Guerra", 1926, "HarperCollins");
    Livro livro2 = new Livro("A coragem de não agradar", "Ichiro Kishimi e Fumitake Koga", 2018, "Sextante");
    Livro livro3 = new Livro("#umdiasemreclamar", "Davi Lago e Marcelo Galuppo", 2021, "Citadel");
}