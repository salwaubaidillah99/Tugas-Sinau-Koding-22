public class Siswa {
    String namaMhs;
    int nimMhs;
    String fakultas;
    int nilai;
    String status;

    
    public String getNama(){
        return namaMhs;
    }
    public void setNama(String namaMhs){
        this.namaMhs= namaMhs;
    }

    public int getNim(){
        return nimMhs;
    }
    public void setNim(Integer nimMhs){
        this.nimMhs=nimMhs;
    }

    public String getFakultas(){
        return fakultas;
    }
    public void setFakultas(String fakultas){
        this.fakultas=fakultas;
    }

    public int getNilai(){
        return nilai;
    }
    public void setNilai(Integer nilai){
        this.nilai=nilai;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status=status;
    }
}
