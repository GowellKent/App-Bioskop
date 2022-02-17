
package model;

public class Bioskop {
    private String Film, Waktu;
    private char Studio;
    private int Harga;
    
    public void setFilm(String Film){
        this.Film = Film;
    }
    public String getFilm(){
        return Film;
    }
    
    public void setWaktu(String Waktu){
        this.Waktu = Waktu;
    }
    public String getWaktu(){
        return Waktu;
    }
    
    public void setStudio(char studio){
        this.Studio = studio;
    }
    public char getStudio(){
        return Studio;
    }
    
    public void setHarga(int Harga){
        this.Harga = Harga;
    }
    public int getHarga(){
        return Harga;
    }
}
