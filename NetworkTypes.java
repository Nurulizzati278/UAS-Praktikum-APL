import java.util.Scanner;

interface KelasJaringan
{
    public void pilihanJaringan();
}

class PAN implements KelasJaringan
{
    public void pilihanJaringan()
    {
        System.out.println("Jenis jaringan ini mencakup wilayah yang lebih kecil, misalnya saja pada kantor, dan rumah.");
    }

}

class LAN implements KelasJaringan
{
    public void pilihanJaringan()
    {
        System.out.println("Jaringan LAN berfungsi untuk menghubungkan perangkat jaringan dalam kondisi jangkauan yang relatif kecil.");
    }

}

class MAN implements KelasJaringan
{
    public void pilihanJaringan()
    {
        System.out.println("MAN adalah jaringan yang menghubungkan antara satu perangkat komputer dengan perangkat yang lain dalam ruang lingkup kota pada jaringan yang sama.");
    }

}

public class NetworkTypes {
    private KelasJaringan kelas;
    
        public void setKelasJaringan(KelasJaringan kelas) {
            this.kelas = kelas;
        }
    
        public KelasJaringan getKelasJaringan() {
            return this.kelas;
        }

        public void pilihanJaringan() {
            kelas.pilihanJaringan();
        }
}

