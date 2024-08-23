package model;

public enum TipoRopa {
    CAMISETAS("HOMBRE"),
    CAMISAS("HOMBRE"),
    PANTALONES("HOMBRE"),
    BERMUDAS("HOMBRE"),
    ZAPATOS("HOMBRE"),
    BLUSAS("MUJER"),
    FALDAS("MUJER"),
    SHORTS("MUJER"),
    TENIS("MUJER"),;

    public static String valueOf(Object selectedItem) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private String genero;

    private TipoRopa(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
