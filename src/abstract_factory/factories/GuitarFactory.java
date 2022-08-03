package abstract_factory.factories;

import abstract_factory.Interfaces.Instrument;
import abstract_factory.Interfaces.InstrumentCr;
import abstract_factory.instruments.Guitar;

public class GuitarFactory implements InstrumentCr {

    @Override
    public Instrument createInstrument() {
        Guitar myGuitar = new Guitar();
        myGuitar.setCode(myGuitar.generateCode());
        System.out.println("Guitar has been created succesfully");
        return myGuitar;
    }
}
