package abstract_factory.factories;

import abstract_factory.Interfaces.Instrument;
import abstract_factory.Interfaces.InstrumentCr;

public class InstrumentsFactory {
    public static void createInstrumentFactory(InstrumentCr factory){
        Instrument objectInstrument = factory.createInstrument();
        objectInstrument.codeInstrument();
    }
}
