public class Reihenfolge {

    String[][] reihe;

    public Reihenfolge(String[][] r) {
        reihe = r;
    }

    public boolean isWellSorted(String[] forderung) {
        String vergl;
        int anz = 0;

        for(int i = 0; i<forderung.length; ++i) {
            for(int r = 0; r<reihe.length; ++r) {
                anz = 0;
                if(reihe[r][0].equals(forderung[i])) {
                    vergl = reihe[r][1];

                    for(int z = i+1; z<forderung.length; ++z) {
                        if(forderung[z].equals(vergl)) {
                            anz++;
                            break;
                        }
                    }
                    if(anz == 0) {
                        return false;
                    }
                }


            }
        }

        return true;
    }
}
