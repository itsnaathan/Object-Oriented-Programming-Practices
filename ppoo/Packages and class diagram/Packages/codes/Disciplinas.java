public class Disciplinas {

    private String codigo;
    private int cargaHoraria;

    public Disciplinas(String codigo, int cargaHoraria) {

        this.codigo = codigo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getCodigo() {

        return codigo;
    }

    public int getCargaHoraria() {

        return cargaHoraria;
    }

}