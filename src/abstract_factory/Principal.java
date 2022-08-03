package abstract_factory;

import abstract_factory.Interfaces.InstrumentCr;
import abstract_factory.factories.DrumsFactory;
import abstract_factory.factories.GuitarFactory;
import abstract_factory.factories.InstrumentsFactory;
import abstract_factory.factories.PianoFactory;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        DrumsFactory drums = new DrumsFactory();
        GuitarFactory guitar = new GuitarFactory();
        PianoFactory piano = new PianoFactory();
        String salida, exit;
        salida =  "Select an option to get the code of the instrument:\n1. Code of Drums\n2. Code of Guitar\n3. Code of Piano";
        try {
            do{
                try{
                    int option = Integer.parseInt(JOptionPane.showInputDialog(salida));
                    switch (option){
                        case 1:
                            InstrumentsFactory.createInstrumentFactory(drums);
                            break;
                        case 2:
                            InstrumentsFactory.createInstrumentFactory(guitar);
                            break;
                        case 3:
                            InstrumentsFactory.createInstrumentFactory(piano);
                            break;
                        default:System.out.println("Is not a valid option.");
                        break;
                    }
                } catch (Exception e){
                    System.out.println("Not a valid query value");
                } exit = JOptionPane.showInputDialog("Do you wish to consult another code? Y/N");
            } while (exit.equals("Y") || exit.equals("y"));
            } catch (Exception e){
            System.out.println("Good day.");
        }
    }
}
