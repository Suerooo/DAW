package Unidad7.Act1VehiculoElectrico;

public class CocheElectrico {
    public String modelo;
    private int porcentajeBateria;
    private boolean enMarcha;

    public CocheElectrico(String modelo, int porcentajeBateria, boolean enMarcha) {
        setModelo(modelo);
        setPorcentajeBateria(porcentajeBateria);
        setEnMarcha(enMarcha);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null || modelo.isEmpty()) {
            this.modelo = "desconocido";
        } else {
            this.modelo = modelo;
        }
    }

    public int getPorcentajeBateria() {
        return porcentajeBateria;
    }

    public void setPorcentajeBateria(int porcentajeBateria) {
        if (porcentajeBateria < 0) {
            this.porcentajeBateria = 0;
        } else if (porcentajeBateria > 100) {
            this.porcentajeBateria = 100;
        } else {
            this.porcentajeBateria = porcentajeBateria;
        }

        if (porcentajeBateria <= 0) {
            enMarcha = false;
        }
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        if (porcentajeBateria <= 0) {
            this.enMarcha = false;
        } else {
            this.enMarcha = enMarcha;
        }
    }

    public void conducir(int kms) {
        setPorcentajeBateria(porcentajeBateria - (kms / 10));
    }

    @Override
    public String toString() {
        return "CocheElectrico [modelo=" + modelo + ", porcentajeBateria=" + porcentajeBateria + ", enMarcha="
                + enMarcha + "]";
    }

}
