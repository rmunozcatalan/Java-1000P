package controller;

import classes.FamiliaSemilla;

/**
 * @author Ricardo Munoz
 * @author Jose Arancibia
 */
public class controllerFamiliaSemilla {

    private FamiliaSemilla[] aFamiliaSemilla;
    public int cont = 0;

    public controllerFamiliaSemilla() {

        FamiliaSemilla Fabaceae = new FamiliaSemilla(cont, "Fabaceae");
        aFamiliaSemilla[cont] = Fabaceae;
//        this.addAFamiliaSemilla(Fabaceae);
        cont++;

        FamiliaSemilla Euphorbiaceae = new FamiliaSemilla(cont, "Euphorbiaceae");
        aFamiliaSemilla[cont] = Euphorbiaceae;
//        this.addAFamiliaSemilla(Euphorbiaceae);
        cont++;

        FamiliaSemilla Aextoxicaceae = new FamiliaSemilla(cont, "Aextoxicaceae");
        aFamiliaSemilla[cont] = Aextoxicaceae;
//        this.addAFamiliaSemilla(Aextoxicaceae);
        cont++;

        FamiliaSemilla Alstroemeriaceae = new FamiliaSemilla(cont, "Alstroemeriaceae");
        aFamiliaSemilla[cont] = Alstroemeriaceae;
        cont++;

    }

    public FamiliaSemilla[] getaFamiliaSemilla() {
        return aFamiliaSemilla;
    }

//    public void addAFamiliaSemilla(FamiliaSemilla oFamiliaSemilla) {
//        aFamiliaSemilla[this.getaFamiliaSemilla().length + 1] = oFamiliaSemilla;
//    }

}
