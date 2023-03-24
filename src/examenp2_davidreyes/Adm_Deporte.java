package examenp2_davidreyes;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Adm_Deporte {
File f= null;  
ArrayList<Deporte> dep;
  public  Adm_Deporte(String path){
      f = new File(path);
  }

    public File getF() {
        return f;
    }

    public void setF(File f) {
        this.f = f;
    }

    public ArrayList<Deporte> getDep() {
        return dep;
    }

    public void setDep(ArrayList<Deporte> dep) {
        this.dep = dep;
    }

public void cargarArchivo() {
        try {
            dep = new ArrayList();
            Deporte temp;
            if (f.exists()) {
                FileInputStream entrada
                        = new FileInputStream(f);
                ObjectInputStream objeto
                        = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Deporte) objeto.readObject()) != null) {
                        dep.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(f);
            bw = new ObjectOutputStream(fw);
            for (Deporte t : dep) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
