package abstract_factory.factories;

import abstract_factory.Interfaces.Instrument;
import abstract_factory.Interfaces.InstrumentCr;
import abstract_factory.instruments.Drums;

public class DrumsFactory implements InstrumentCr {

    @Override
    public Instrument createInstrument() {
        Drums myDrums = new Drums();
        myDrums.setCode(myDrums.generateCode());
        System.out.println("Drums has been created succesfully");
        return myDrums;
    }
}
