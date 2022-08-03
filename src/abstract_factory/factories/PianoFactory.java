package abstract_factory.factories;

import abstract_factory.Interfaces.Instrument;
import abstract_factory.Interfaces.InstrumentCr;
import abstract_factory.instruments.Piano;

public class PianoFactory implements InstrumentCr {

    @Override
    public Instrument createInstrument() {
        Piano myPiano = new Piano();
        myPiano.setCode(myPiano.generateCode());
        System.out.println("Piano has been created succesfully");
        return myPiano;
    }
}
