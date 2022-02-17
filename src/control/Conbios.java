
package control;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Bioskop;

public class Conbios {
    File f = null;
    FileReader fr = null;
    BufferedReader br = null;
    
    FileWriter fw = null;
    BufferedWriter bw = null;
    
    Bioskop b;
    
    public Conbios(){
        f = new File("DataBioskop.txt");
    }
    
    public List<Bioskop> getAll(){
        List<Bioskop> list = new ArrayList<Bioskop>();
        try{
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            String X = br.readLine();
            while(X != null){
                b = new Bioskop();
                String[] temp = X.split(" # ");
                b.setFilm(temp[0]);
                b.setWaktu(temp[1]);
                b.setStudio(temp[2].charAt(0));
                b.setHarga(Integer.parseInt(temp[3]));
                list.add(b);
                X = br.readLine();
            }
        }catch(FileNotFoundException e){
            System.out.println("File Not Found");
        }catch(IOException e){
            System.out.println("Input Error");
        }finally{
            try{
                fr.close();
                br.close();
            }catch(IOException e){
                
            }
            return list;
        }
    }
    
    public void upBios(List<Bioskop> lb){
        try{
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            
            for(Bioskop bi : lb){
                String temp = "";
                temp += bi.getFilm();
                temp += " # " + bi.getWaktu();
                temp += " # " + bi.getStudio();
                temp += " # " + bi.getHarga() + "\n" ;
                bw.write(temp);
            }
            bw.close();
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
