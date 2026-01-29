package Examenes.Examen3.Act1Caja;

public class Caja {
    // Valores por default en caso de fallo
    private static final double NUMERO_DEFAULT = 1;
    private static final String ETIQUETA_DEFAULT = "desconocida";
    private static final Unidad UNIDAD_DEFAULT = Unidad.M;

    private double ancho;
    private double alto;
    private double fondo;
    private Unidad unidadMedia;
    private String etiqueta;

    public Caja(double ancho, double alto, double fondo, Unidad unidadMedia, String etiqueta) {
        setAlto(alto);
        setAncho(ancho);
        setFondo(fondo);
        setUnidadMedia(unidadMedia);
        setEtiqueta(etiqueta);
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if (ancho <= 0) {
            System.out.println("El ancho no puede ser menor o igual a 0. Numero establecido por defecto: 1");
            this.ancho = NUMERO_DEFAULT;
        } else {
            this.ancho = ancho;
        }
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        if (alto <= 0) {
            System.out.println("El alto no puede ser menor o igual a 0. Numero establecido por defecto: 1");
            this.alto = NUMERO_DEFAULT;
        } else {
            this.alto = alto;
        }
    }

    public double getFondo() {
        return fondo;
    }

    public void setFondo(double fondo) {
        if (fondo <= 0) {
            System.out.println("El fondo no puede ser menor o igual a 0. Numero establecido por defecto: 1");
            this.fondo = NUMERO_DEFAULT;
        } else {
            this.fondo = fondo;
        }
    }

    public Unidad getUnidadMedia() {
        return unidadMedia;
    }

    public void setUnidadMedia(Unidad unidadMedia) {
        if (unidadMedia == null) {
            System.out.println("La unidad de medida no ha sido definida. Unidad establecida por defecto: M");
            this.unidadMedia = UNIDAD_DEFAULT;
        } else {
            this.unidadMedia = unidadMedia;
        }
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        if (etiqueta == null || etiqueta.trim().isEmpty()) {
            System.out.println("No se han introducido datos en etiqueta. Valor establecido por defecto: 'desconocido'");
            this.etiqueta = ETIQUETA_DEFAULT;
        } else {
            this.etiqueta = etiqueta;
        }
    }

    public double getVolumen() {
        if (unidadMedia == Unidad.CM) {
            return ((ancho / 100) * (alto / 100) * (fondo / 100));
        } else {
            return ancho * alto * fondo;
        }
    }

    @Override
    public String toString() {
        return "Ancho=" + ancho + unidadMedia + ", alto=" + alto + unidadMedia + ", fondo=" + fondo + unidadMedia
                + ", etiqueta=" + etiqueta + ", volumen=" + getVolumen() + unidadMedia;
    }

    @Override
    public boolean equals(Object obj) {
        Caja otro = (Caja) obj;
        return this.alto == otro.alto && this.ancho == otro.ancho && this.etiqueta == otro.etiqueta
                && this.fondo == otro.fondo && this.unidadMedia == otro.unidadMedia;
    }

}
