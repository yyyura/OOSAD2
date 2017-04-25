//Virtual Proxy
//RealMovie keeps link to Movie
public class ProxyMovie implements MovieIF {

    String linkToFile;
    RealMovie realMovie;//link to rael movie

    public ProxyMovie(String linkToFile) {
        this.linkToFile = linkToFile;
//        loadMovie();//loading in constructor
    }

    @Override
    public void play() {
        if (realMovie == null) {
            realMovie = new RealMovie(linkToFile);//link to file is already saved to Proxy constructor
        }//loadMovie();//loading in RealMovie constructor
        realMovie.play();//only after method play is called, it will start loading the movie

    }

}
