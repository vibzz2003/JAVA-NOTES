class player{
   void play(){
    System.out.println("he/she is a player");
   }
}
class Cricketplayer extends player{
    void match(){
      System.out.println("he plays cricket");
    }
}
class Footballplayer extends player{
    void ball(){
        System.out.println("he plays football");
    }
}
class Hockeyplayer extends player{
    void hockey(){
        System.out.println("he plays hockey");
    }
}
class Exp4_2{
    public static void main(String args[]){
        Cricketplayer c = new Cricketplayer();
        Footballplayer f = new Footballplayer();
        Hockeyplayer h = new Hockeyplayer();
        c.play();
        f.play();
        h.play();
    }
}