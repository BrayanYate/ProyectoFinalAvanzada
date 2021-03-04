package Logica;

public class Plantilla {
    
    protected String opcion1;
    protected String opcion2;
    protected String opcion3;
    protected String opcion4;
    protected String img;

    public Plantilla() {
        this.opcion1 = "";
        this.opcion2 = "";
        this.opcion3 = "";
        this.opcion4 = "";
        this.img = "";
    }

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
