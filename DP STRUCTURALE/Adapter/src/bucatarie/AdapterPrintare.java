package bucatarie;

import bar.Bar;
import bar.PrintareBar;

public class AdapterPrintare implements  PrintareBucatarie{
    private Bar bar;

    public AdapterPrintare(Bar bar) {
        this.bar = bar;
    }

    @Override
    public void printeazaBucatarie() {
        bar.printeazaBar();
        PrintareBucatarie bucatarie=new Bucatarie();
        bucatarie.printeazaBucatarie();
    }
}
