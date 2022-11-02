public class User {
    // TODO Create Attribute of User; Name and Phone Number then Create Setter
    // TODO Create Method to Register User and Display User's Name and Phone Number and success message
    String Nama;
    int HP;

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setHP(int HP){
        this.HP = HP;
    }

    
    public void sukses() {
    System.out.println("Selamat Datang di Restoran EAD");
    System.out.println("Silahkan Register Terlebih Dahulu");
    System.out.println("===================================");
    System.out.println("Nama = " + Nama);
    System.out.println("No. Handphone = " + HP);
    System.out.println("Register Success");
    System.out.println("===================================");
    System.out.println("1. Menu");
    System.out.println("2. Pilih Menu");
    System.out.println("3. Keluar");
    System.out.println("===================================");

}
}
