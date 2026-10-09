public class Station {

    rechargerTous(AssistanceElectrique[]appareils) {
        for (int i = 0; i < appareils.length; i++) {

        appareils[i].rechargerBatterie(AssistanceElectrique.CAPACITE_BATTERIE);
        }
    
    }
}

//Q4  Peut-on stocker un objet de type Velo dans un tableau de AssistanceElectrique ? : Oui si c'est un velo electrique
// Peut-on stocker un objet de type VeloElectrique dans un tableau de Cycle ? : Oui car il englobe tout le tableau Cycle