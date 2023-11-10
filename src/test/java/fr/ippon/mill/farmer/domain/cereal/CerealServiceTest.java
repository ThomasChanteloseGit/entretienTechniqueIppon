package fr.ippon.mill.farmer.domain.cereal;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class CerealServiceTest {

    private CerealService cerealService;


    void demandeDepotKO_WhenTypeCerealNotValide(){
        //Given
        //When
        IllegalArgumentException toto = assertThrows(IllegalArgumentException.class, () -> cerealService.demandeDepot("Toto"));
        //Then

    }

}