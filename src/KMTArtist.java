import de.umass.lastfm.Artist;
import de.umass.lastfm.Caller;

import java.text.DateFormat;
import java.util.Collection;

public class KMTArtist extends Artist{
    //public static String Name;
    public static String[] artists1 = new String[5];
    public static Collection<KMTArtist> similar;
    public static Collection<Artist> similar1;
   /* public KMTArtist()
    {
        Collection<Artist> similar = Artist.getSimilar(KMTQuery.uArtName, 5, Main1.key);
       int i=0; //Artist.getSimilar()
        for (Artist artist : similar) {
            artists1[i]=artist.getName();
            i++;
        }

}*/

    protected KMTArtist(Artist a) {
        super(a.getName(), a.getUrl());
                //this.getSimilar(); Artist.getSimilar(s,5,Main1.key);
        int i=0; //Artist.getSimilar()
        similar1=Artist.getSimilar(this.getName(), 5, Main1.key);
        for (Artist artist : similar1) {
            similar.add(new KMTArtist(artist));
            artists1[i]=artist.getName();
            i++;
    }
}



}