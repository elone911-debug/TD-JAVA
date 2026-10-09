public class VeloElectrique extends Velo implements AssistanceElectrique {
    private int niveauBatterie;

    public VeloElectrique (String modele) {
        super(modele);
        this.niveauBatterie = 0;
    }

    @Override
    public void rechargerBatterie (int carburant) {
        this.niveauBatterie += carburant;


        if (this.niveauBatterie <= CAPACITE_BATTERIE) {
            this.niveauBatterie = CAPACITE_BATTERIE;

        }
        
    }


}